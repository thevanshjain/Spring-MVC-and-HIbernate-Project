package com.vansh.springdemo.service;

import com.vansh.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();


    void saveCustomer(Customer customer);
}
