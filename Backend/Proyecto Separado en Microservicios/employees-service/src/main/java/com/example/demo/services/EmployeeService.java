package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;



//Aqui se va encontrar la logica del negocio
@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAll() {
        List<Employee> listado=(List<Employee>) repository.findAll();

        return listado;

    }

    @Override
    public Employee getById(Long id) {
        return  (Employee) repository.findById(id).get();
    }

    @Override
    public void remove(Long id){
        repository.deleteById(id);
    }
    @Override
    public void save(Employee employee){
        repository.save(employee);
    }

}
