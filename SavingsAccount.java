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
    private double interestRate;
    public SavingsAccount(double initBalance, double interestRate) {
        super(initBalance);
        this.interestRate = interestRate;
    }
    public SavingsAccount(double initBalance){
        super(initBalance);
        this.balance = initBalance;
    }

}
