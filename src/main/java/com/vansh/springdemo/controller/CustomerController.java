package com.vansh.springdemo.controller;


import com.vansh.springdemo.dao.CustomerDAO;
import com.vansh.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired

    private CustomerDAO customerDAO;


    @RequestMapping("/list")
    public  String listCustomer(Model theModel){

        List<Customer> customers=customerDAO.getCustomers();

        theModel.addAttribute("customers", customers);

        return "list-customers";
    }
}
