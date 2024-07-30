// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println();

        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());

        payPalProcessor.processPayment(1000.0); // Use only PayPal to process the payment
        stripeProcessor.processPayment(2000.0); // Use only Stripe to process the payment
    }
}
