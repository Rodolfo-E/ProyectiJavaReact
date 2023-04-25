package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Customer;

public interface ICustomerService {
	
	public List<Customer> getAll() ;


    Customer getById(Long id);
    void remove(Long id);
    void save(Customer customer);
}
