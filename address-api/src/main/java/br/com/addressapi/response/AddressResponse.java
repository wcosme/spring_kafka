package br.com.addressapi.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressResponse {
	
	private String cep;
	private String logradouro;
	private Long numero;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;	

}
