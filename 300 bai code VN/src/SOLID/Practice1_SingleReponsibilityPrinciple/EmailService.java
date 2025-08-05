package SOLID.Practice1_SingleReponsibilityPrinciple;

public class EmailService {
    public void sendEmailConfirmation(Order order){
        System.out.println("Email confirmation: " + order.getTotalAmount());
    }
}
