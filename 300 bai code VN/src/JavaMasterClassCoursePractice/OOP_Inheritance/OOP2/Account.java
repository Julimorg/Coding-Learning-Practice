package JavaMasterClassCoursePractice.OOP_Inheritance.OOP2;

import java.util.Scanner;

public class Account {
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String number;
    private double balance;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double money) {
        this.balance = money;
    }

    public void depositingFunds(double depositAmount)
    {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + "made . New balance is $" + balance);

    }
    public void widthdrawingFunds(double widthdrawingAmount)
    {
        if ( balance - widthdrawingAmount < 0 )
        {
            System.out.println("Insufficient Funds! You only have $" + balance + "in your account");

        }else {
            balance -= widthdrawingAmount;
            System.out.println("Withdrawal of $" + widthdrawingAmount + "made . New balance is $" + balance);
        }
    }




}
