package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    // if wired via XML use a setter
    //public void setDbUsername(String dbUsername) {
    //    this.dbUsername = dbUsername;
    //}



    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname("Robin");
        customer.setLastname("Davies");
        customers.add(customer);
        return customers;
    }

}
