package br.com.addressconsumer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.addressconsumer.model.Address;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AddressConsume {
	
	@Autowired
	private AddressService addressService; 
	
	@KafkaListener(topics = "${topic.address}", groupId = "${spring.kafka.consumer.group-id}" )
	public void getAddressKafka(String value) throws JsonProcessingException {
		log.info("Mensagem lida do kafka {}", value);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Address address = objectMapper.readValue(value, Address.class);
		
		addressService.saveAddress(address);
		log.info("Endereço salvo na base {}", address);
	}

}
