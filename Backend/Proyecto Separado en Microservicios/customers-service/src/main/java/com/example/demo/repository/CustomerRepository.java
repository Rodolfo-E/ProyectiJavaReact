package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;

//Va estar la conexion con y la logica con la bd
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	

}
