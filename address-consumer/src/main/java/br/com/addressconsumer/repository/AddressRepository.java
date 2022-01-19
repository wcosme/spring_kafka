package br.com.addressconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.addressconsumer.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
