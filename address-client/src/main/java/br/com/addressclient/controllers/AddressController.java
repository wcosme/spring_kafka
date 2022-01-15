package br.com.addressclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.addressclient.response.AddressResponse;
import br.com.addressclient.service.AddressService;

@Controller
@RequestMapping("api/v1/cep")
public class AddressController {
	
	@Autowired
	private AddressService addressService;

	@GetMapping("/{cep}")
	public ResponseEntity<AddressResponse> getCep(@PathVariable("cep") String cep){
		
		return ResponseEntity.ok(addressService.getCep(cep));
		
	}
}
