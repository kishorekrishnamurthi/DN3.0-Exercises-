// StrategyPatternTest.java
public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Using Credit Card Payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "kishore", "123");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(150.00);

        // Using PhonePe Payment
        PaymentStrategy phonePePayment = new PhonePePayment("9876543210");
        paymentContext.setPaymentStrategy(phonePePayment);
        paymentContext.executePayment(200.00);
    }
}
