package com.spring.boot.example.es.controllers;

import com.spring.boot.example.es.model.Customer;
import com.spring.boot.example.es.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @PostMapping("/saveCustomer")
    public int saveCustomer(@RequestBody List<Customer> customers) {
        repo.saveAll(customers);
        return customers.size();
    }

    @GetMapping("/findAll")
    public Iterable<Customer> findAllCustomers() {
        return repo.findAll();
    }

    @GetMapping("/findByFName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName) {
        return repo.findByFirstName(firstName);
    }

}
