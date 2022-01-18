package br.com.addressapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.addressapi.response.AddressResponse;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface AddressService {
	
	@GetMapping("{cep}/json")
	AddressResponse getCep(@PathVariable("cep") String cep);

}
