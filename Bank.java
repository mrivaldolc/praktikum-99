/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Muhammad Rivaldo
 */
public class Bank {

    private ArrayList<String> customers = new ArrayList<String>();
    private int numberOfCustomers;

    public Bank() {
        this.customers = new ArrayList<String>(5);
        this.numberOfCustomers = 0;
    }

    public void addCustomer(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.customers.add(fullName);
        this.numberOfCustomers += 1;
    }

    public int getNumOfCustomers() {
        return this.numberOfCustomers;
    }

    public String getCustomer(int index) {
        return customers.get(index);
    }
}
