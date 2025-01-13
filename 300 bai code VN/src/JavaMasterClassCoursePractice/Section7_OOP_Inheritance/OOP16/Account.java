package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP16;

public class Account {
    private double balance;

    public Account() {
    }
    public Account(double initialBalance) {
        if(initialBalance > 0.0)
        {
            balance = initialBalance;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void credit(double amount) {
        balance += amount;
    }
}
