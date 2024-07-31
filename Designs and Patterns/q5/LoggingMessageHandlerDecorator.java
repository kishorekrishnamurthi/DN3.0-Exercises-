// LoggingMessageHandlerDecorator.java
public class LoggingMessageHandlerDecorator extends MessageHandlerDecorator {
    public LoggingMessageHandlerDecorator(MessageHandler decoratedHandler) {
        super(decoratedHandler);
    }

    @Override
    public void handle(String message) {
        super.handle(message);
        logMessage(message);
    }

    private void logMessage(String message) {
        System.out.println("Logging message: " + message);
    }
}
