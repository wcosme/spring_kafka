package br.com.addressconsumer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.addressconsumer.model.Address;
import br.com.addressconsumer.services.AddressService;

@Controller
@RequestMapping("/adresses")
public class AddressController {
	
	@Autowired
	private AddressService addressService;

	@PostMapping
	public ResponseEntity<Address> save(@RequestBody Address address){
		addressService.saveAddress(address);
		return ResponseEntity.ok(address);
	}
}
