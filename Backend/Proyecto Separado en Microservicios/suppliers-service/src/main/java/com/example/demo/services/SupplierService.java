package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;


import com.example.demo.entities.Supplier;

import com.example.demo.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;



//Aqui se va encontrar la logica del negocio
@Service
public class SupplierService implements ISupplierService {

    @Autowired
    private SupplierRepository repository;

    @Override
    public List<Supplier> getAll() {
        List<Supplier> listado=(List<Supplier>) repository.findAll();

        return listado;

    }

    @Override
    public Supplier getById(Long id) {
        return  (Supplier) repository.findById(id).get();
    }

    @Override
    public void remove(Long id){
        repository.deleteById(id);
    }
    @Override
    public void save(Supplier supplier){
        repository.save(supplier);
    }

}
