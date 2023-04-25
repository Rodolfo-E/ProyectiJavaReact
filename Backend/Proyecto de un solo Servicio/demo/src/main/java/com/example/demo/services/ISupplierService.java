package com.example.demo.services;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Supplier;

import java.util.List;

public interface ISupplierService {

    public List<Supplier> getAll() ;


    Supplier getById(Long id);
    void remove(Long id);
    void save(Supplier supplier);
}
