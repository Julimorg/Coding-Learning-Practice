package SOLID.Practice1_SingleReponsibilityPrinciple;

public class OrderService {
    private OrderReponsibility reponsibility;
    private EmailService emailService;

    public OrderService(OrderReponsibility reponsibility, EmailService emailService) {
        this.reponsibility = reponsibility;
        this.emailService = emailService;
    }

    public void processOrder(Order order) {
        reponsibility.saveToDb(order);
        emailService.sendEmailConfirmation(order);
    }
}
