package com.mycompany.test;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates1
 * and open the template in the editor.
 */
/**
 *
 * @author Muhammad Rivaldo
 */
public class Bank {

    private List<Customer> customers = new ArrayList<Customer>(10);
    private int numberOfCustomers = 0;

    public void addCustomer(String firstName, String lastName) {   
        customers.add(new Customer(firstName, lastName));
        numberOfCustomers += 1;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }
}
