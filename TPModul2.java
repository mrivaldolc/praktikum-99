package com.mycompany.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muhammad Rivaldo
 */
public class TPModul2 {

    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.println("=========================================== BANK RAKYAT TEL-U ===========================================");
        System.out.println();
        System.out.println();

        bank.addCustomer("EAD", "Lab");
        bank.getCustomer(0).setAccount(new Account(100000));
        bank.getCustomer(0).getAccount().setoran(200000);
        bank.getCustomer(0).getAccount().penarikan(100000);

        bank.addCustomer("ESD", "Lab ");
        bank.getCustomer(1).setAccount(new CheckingAccount(200000.0, 50000.0));// ie : overdraftProtection = Rp50.000
        bank.getCustomer(1).getAccount().setoran(100000.0);
        bank.getCustomer(1).getAccount().penarikan(200000.0);

        bank.addCustomer("EIS", "Lab");
        bank.getCustomer(2).setAccount(new SavingsAccount(300000));
        bank.getCustomer(2).getAccount().setoran(200000);
        bank.getCustomer(2).getAccount().penarikan(100000);

        System.out.println("=> DAFTAR NASABAH");
        System.out.println();
        System.out.println("Nasabah 1 : " + bank.getCustomer(0).getFullName() + " Dengan Sisa Saldo Rp " + bank.getCustomer(0).getAccount().getBalance());
        System.out.println("Nasabah 2 : " + bank.getCustomer(1).getFullName() + " Dengan Sisa Saldo Rp " + bank.getCustomer(1).getAccount().getBalance());
        System.out.println("Nasabah 3 : " + bank.getCustomer(2).getFullName() + " Dengan Sisa Saldo Rp " + bank.getCustomer(2).getAccount().getBalance());
        System.out.println();
        System.out.println("Jumlah Nasabah = " + bank.getNumOfCustomers());
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("=> JENIS AKUN NASABAH");
        System.out.println();
        System.out.println("Default Account Dengan Nasabah Bernama  :" + bank.getCustomer(0).getFullName());
        System.out.println("Checking Account Dengan Nasabah Bernama :" + bank.getCustomer(1).getFullName());
        System.out.println("Saving Account Dengan Nasabah Bernama   :" + bank.getCustomer(2).getFullName());
    }
}
