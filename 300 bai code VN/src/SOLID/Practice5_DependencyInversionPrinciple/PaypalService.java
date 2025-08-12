package SOLID.Practice5_DependencyInversionPrinciple;

public class PaypalService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal");
    }
}
