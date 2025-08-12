package SOLID.Practice5_DependencyInversionPrinciple;

public class StripeService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe");
    }
}
