// AdapterPatternTest.java
public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create a GPay gateway instance
        GPayGateway gPayGateway = new GPayGateway();

        // Create an adapter for the GPay gateway
        PaymentProcessor gPayProcessor = new GPayAdapter(gPayGateway);

        // Process payments using the adapter
        gPayProcessor.processPayment(10000.0);
    }
}
