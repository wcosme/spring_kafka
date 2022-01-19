package br.com.addressconsumer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.addressconsumer.model.Address;
import br.com.addressconsumer.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	
	public Address saveAddress(Address address) {		
		return addressRepository.save(address);		
	}
	
	public List<Address> getAddress(){		
		return addressRepository.findAll();
	}

}
