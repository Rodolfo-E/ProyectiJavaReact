package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;

//Aqui se va encontrar la logica del negocio
@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public List<Customer> getAll() {
		return (List<Customer>)repository.findAll();
		
	}

	@Override
	public Customer getById(Long id) {
		return  (Customer) repository.findById(id).get();
	}

	@Override
	public void remove(Long id){
		repository.deleteById(id);
	}
	@Override
	public void save(Customer customer){
		repository.save(customer);
	}

}
