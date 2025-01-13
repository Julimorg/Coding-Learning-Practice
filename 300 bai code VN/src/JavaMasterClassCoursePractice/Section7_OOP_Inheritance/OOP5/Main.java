package JavaMasterClassCoursePractice.Section7_OOP_Inheritance.OOP5;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("JIan Fong", 100,"dqjwnj@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());


    }
}
