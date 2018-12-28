package com.spring.boot.example.es.repository;

import com.spring.boot.example.es.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

    List<Customer> findByFirstName(String firstName);
}
