package JavaMasterClassCoursePractice.OOP_Inheritance.OOP5;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer()
    {
        this("Jian Fong" , 23, "kienphongtran2003@gmail.com");
    }
    public Customer(String name, String email)
    {
        this(name,102,email);
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
