package br.com.addressconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class AddressConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressConsumerApplication.class, args);
	}

}
