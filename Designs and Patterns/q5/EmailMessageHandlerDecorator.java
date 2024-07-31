// EmailMessageHandlerDecorator.java
public class EmailMessageHandlerDecorator extends MessageHandlerDecorator {
    public EmailMessageHandlerDecorator(MessageHandler decoratedHandler) {
        super(decoratedHandler);
    }

    @Override
    public void handle(String message) {
        super.handle(message);
        sendEmail(message);
    }

    private void sendEmail(String message) {
        System.out.println("Sending email with message: " + message);
    }
}