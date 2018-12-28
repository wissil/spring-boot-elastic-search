package com.spring.boot.example.es.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "customer_index", type = "customer", shards = 2)
public class Customer {

    private String id;

    private String firstName;

    private String lastName;

    private int age;

    public Customer(){}

    public Customer(String id, String lastName, String firstName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
