/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muhammad Rivaldo
 */
public class CheckingAccount extends Account {

    private double overdraftProtection;

    public CheckingAccount(double initBalance, double overdraftProtection) {
        super(initBalance);
        this.overdraftProtection = overdraftProtection;
    }

    public boolean penarikan(double amount) {
        if (balance > 0) {
            if (balance > amount || balance == amount) {
                super.penarikan(amount);
            } else {
                if (overdraftProtection > 0) {
                    double overdraft = balance - amount;
                    if (overdraftProtection > Math.abs(overdraft) || overdraftProtection == Math.abs(overdraft)) {
                        overdraftProtection = overdraftProtection + overdraft;    
                        balance =  balance - amount;
                        System.out.println("Message : Used overdraft protection : Rp."+overdraft);
                        System.out.println("Message : overdraft protection balance : "+overdraftProtection);
                        return true;
                    } else {
                        System.out.println("Message : Insufficient Overdraft Protection");
                        System.out.println("Message : overdraft protection balance : "+overdraftProtection);
                        return false;
                    }
                }
            }
        }

        return false;
    }
}
