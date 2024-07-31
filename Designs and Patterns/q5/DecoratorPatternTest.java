// DecoratorPatternTest.java
public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create a basic message handler
        MessageHandler basicHandler = new BasicMessageHandler();

        // Decorate the message handler with logging, email, and web broadcast functionalities
        MessageHandler decoratedHandler = new WebBroadcastMessageHandlerDecorator(
                new EmailMessageHandlerDecorator(
                        new LoggingMessageHandlerDecorator(basicHandler)));

        // Handle a message using the decorated handler
        decoratedHandler.handle("Hello, Decorator Pattern!");
    }
}
