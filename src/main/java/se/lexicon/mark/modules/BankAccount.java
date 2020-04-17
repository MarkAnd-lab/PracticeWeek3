package se.lexicon.mark.modules;

public class BankAccount {

// Blueprint for bank account

    // Fields
    private String number;
    private double balance;
    public String customerName;
    public String customerEmailAddress;
    private int customerPhoneNumber;

    //Constructor

    public void deposit(double depositAmount) {
        this.balance = depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);

    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + " processed. Remaining balance = " + this.balance);
        }
    }

    // Method
    //Getters and Setters

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
/*
}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void getDeposit(int depositCash) {
        balance = balance + depositCash;
    }
    public void getWithdraw (int withdraw){
        if (withdraw > 0)
            if(withdraw > balance)
                System.out.println("Can´t allow withdraw! insufficent found");
            else
                balance = balance - withdraw;
        System.out.println("withdraw succesful");
    }

    //Constructor
    public BankAccount(String costumerName, int accountNumber, int balance, String email, int phoneNumber, int deposit, int withdraw) {

        this.costumerName = costumerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.deposit = deposit;
        this.withdraw = withdraw;

    }


}
*/