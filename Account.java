/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muhammad Rivaldo
 */
public class Account {

    protected double balance;

    public Account(double initBalance) {
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean setoran(double amount) {
        balance += amount;
        return true;
    }

    public boolean penarikan(double amount) {
        if (balance > 0) {
            if ((balance > amount) || (balance == amount)) {
                balance -= amount;
                return true;
            }
        }
        return false;
    }

}
