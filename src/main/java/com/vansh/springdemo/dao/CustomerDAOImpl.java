package com.vansh.springdemo.dao;

import com.vansh.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        Session session=sessionFactory.getCurrentSession();

        Query<Customer> query=session.createQuery("from Customer order by lastName", Customer.class);


        List<Customer> customers=query.getResultList();

        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {

        Session session=sessionFactory.getCurrentSession();
        session.save(customer);

    }
}
