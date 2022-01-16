package br.com.addressconsumer.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AddressConsumeService {
	
	@KafkaListener(topics = "${topic.address}", groupId = "${spring.kafka.consumer.group-id}" )
	public void getAddressKafka(String value) {
		log.info("Mensagem lida do kafka {}", value);
	}

}
