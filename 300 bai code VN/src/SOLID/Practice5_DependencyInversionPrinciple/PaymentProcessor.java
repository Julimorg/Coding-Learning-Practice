package SOLID.Practice5_DependencyInversionPrinciple;

public class PaymentProcessor {
    private PaymentService paymentService;

    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void process(double amount) {
        paymentService.processPayment(amount);
    }
}
