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

        Customer ead = new Customer("EAD", "Lab ");
        Account EAD = new CheckingAccount(750000, 0.01);
        ead.setAccount(ead.getAccount());
        bank.addCustomer(ead.getFirstName(), ead.getLastName());

        EAD.setoran(45700);
        EAD.penarikan(13000);

        Customer esd = new Customer("ESD", "Lab ");
        Account ESD = new Account(130000);
        esd.setAccount(esd.getAccount());
        bank.addCustomer(esd.getFirstName(), esd.getLastName());

        ESD.setoran(16500);
        ESD.setoran(75000);

        Customer eis = new Customer("EIS", "Lab ");
        Account EIS = new SavingsAccount(11500);
        eis.setAccount(eis.getAccount());
        bank.addCustomer(eis.getFirstName(), eis.getLastName());

        EIS.setoran(11400);
        EIS.penarikan(50000);

        System.out.println("=> DAFTAR NASABAH");
        System.out.println();
        System.out.println("Nasabah 1 : " + bank.getCustomer(0) + "Dengan Sisa Saldo Rp " + ESD.getBalance());
        System.out.println("Nasabah 2 : " + bank.getCustomer(1) + "Dengan Sisa Saldo Rp " + EAD.getBalance());
        System.out.println("Nasabah 3 : " + bank.getCustomer(2) + "Dengan Sisa Saldo Rp " + EIS.getBalance());
        System.out.println();
        System.out.println("Jumlah Nasabah = " + bank.getNumOfCustomers());
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("=> JENIS AKUN NASABAH");
        System.out.println();
        System.out.println("Default Account Dengan Nasabah Bernama  :" + bank.getCustomer(0));
        System.out.println("Checking Account Dengan Nasabah Bernama :" + bank.getCustomer(1));
        System.out.println("Saving Account Dengan Nasabah Bernama   :" + bank.getCustomer(2));
    }
}
