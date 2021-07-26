package com.vansh.springdemo.dao;

import com.vansh.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Customer> getCustomers() {

        Session session=sessionFactory.getCurrentSession();

        Query<Customer> query=session.createQuery("from Customer", Customer.class);


        List<Customer> customers=query.getResultList();

        return customers;
    }
}
