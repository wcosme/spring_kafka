package br.com.addressclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.addressclient.kafka.producer.AddressProducer;
import br.com.addressclient.response.AddressResponse;
import br.com.addressclient.service.AddressService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("api/v1/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	@Autowired
	private AddressProducer addressProducer;

	@GetMapping("/{cep}")
	public ResponseEntity<AddressResponse> getCep(@PathVariable("cep") String cep){
		
		return ResponseEntity.ok(addressService.getCep(cep));
		
	}
	
	@PostMapping
	public ResponseEntity<AddressResponse> sendAddress(@RequestBody AddressResponse response) throws JsonProcessingException{
		
		log.info("Dados enviados pelo cliente: {}", response);
		AddressResponse addressResponse = addressService.getCep(response.getCep());
		addressResponse.setComplemento(response.getComplemento());
		addressResponse.setNumero(response.getNumero());
		
		ObjectMapper objMapper = new ObjectMapper();		
		String msg = objMapper.writeValueAsString(addressResponse);
		
		addressProducer.onSend(msg);
		log.info("Endereço retornado pela API de cep: {}", addressResponse);
		
		return ResponseEntity.ok(addressResponse);
		
	}	
}
