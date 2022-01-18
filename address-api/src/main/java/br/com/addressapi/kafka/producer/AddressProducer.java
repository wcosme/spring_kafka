package br.com.addressapi.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class AddressProducer {
	
	@Value("${topic.address}")
	private String topicAddress;
	
	@Autowired
	private KafkaTemplate<String, String> template;
	
	public void onSend(String message) {
		template.send(topicAddress, message);
		log.info("Mensagem enviada para o topic address: {}", message);
	}

}
