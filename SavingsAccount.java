/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Rivaldo
 */
public class SavingsAccount extends Account{
    double interestRate;
    public SavingsAccount(double init_balance, double interestRate) {
        super(init_balance);
        this.interestRate = interestRate;
    }
    public SavingsAccount(double init_balance){
        super(init_balance);
        this.balance = init_balance;
    }

}
