// PhonePePayment.java
public class PhonePePayment implements PaymentStrategy {
    private String phoneNumber;

    public PhonePePayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing PhonePe payment of $" + amount);
        // Additional logic for PhonePe payment
    }
}
