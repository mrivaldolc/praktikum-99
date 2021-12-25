/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Rivaldo
 */
public class CheckingAccount extends Account{
    double overdraftProtection;
    public CheckingAccount(double init_balance, double overdraftProtection) {
        super(init_balance);
        this.overdraftProtection = overdraftProtection;
    }
    public boolean penarikan(double amount) {

        super.penarikan(amount);
        if (balance < 0) {
            if (overdraftProtection >= (balance - amount)) {
                balance -= (balance - amount);
                return true;
            } else {
                System.out.println("Insufficient funds");
                return false;
            }
        } else {
            return false;
        }
    }
}
