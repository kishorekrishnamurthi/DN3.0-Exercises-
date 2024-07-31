// GPayAdapter.java
public class GPayAdapter implements PaymentProcessor {
    private GPayGateway gPayGateway;

    public GPayAdapter(GPayGateway gPayGateway) {
        this.gPayGateway = gPayGateway;
    }

    @Override
    public void processPayment(double amount) {
        gPayGateway.pay(amount);
    }
}
