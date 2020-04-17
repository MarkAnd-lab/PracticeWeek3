package se.lexicon.mark;


import se.lexicon.mark.modules.BankAccount;

import javax.swing.*;

/*
Practice
•*Create a class called BankAccount
•*Create fields for account number, balance, customer name, email and phone number.
•*Create a constructor that assign values to all fields
•Make getters and setters for all fields
•Create methods to deposit and withdraw funds.
•Do not allow a withdraw al to complete if the balance is insufficient.
•Extra: Have a static counter that increment and assign the account number.
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Practice Week 3, BankAccount");

// here we create an object of Bank account

        BankAccount marksAccount = new BankAccount();
        marksAccount.withdrawal(100.0);

        marksAccount.deposit(50.0);
        marksAccount.withdrawal(100.0);
        marksAccount.deposit(51.0);
        marksAccount.withdrawal(100.0);





        //BankAccount bankAccount = new BankAccount("Mark", 9030_343, 1000, "mark-andersson@hotmail.com", 8737237);

        //System.out.println("Bank Account: " + " " + bankAccount.getCostumerName() + " " + bankAccount.getAccountNumber() + " " + bankAccount.getBalance() + " " + bankAccount.getEmail() + " " + bankAccount.getPhoneNumber());


        //Bank konto och använd if satser

    }
}

