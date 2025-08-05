package SOLID.Practice1_SingleReponsibilityPrinciple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Input order id: ");
        String orderId = sc.nextLine();
        System.out.println("Input total amount: ");
        int totalAmount = sc.nextInt();

        Order order = new Order(orderId, totalAmount);

        OrderReponsibility orderReponsibility = new OrderReponsibility();
        EmailService emailService = new EmailService();

        OrderService orderService = new OrderService(orderReponsibility, emailService);
        orderService.processOrder(order);


    }
}
