package br.com.addressclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AddressClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressClientApplication.class, args);
	}

}
