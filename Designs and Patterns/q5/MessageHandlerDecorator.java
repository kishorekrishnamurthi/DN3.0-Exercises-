// MessageHandlerDecorator.java
public abstract class MessageHandlerDecorator implements MessageHandler {
    protected MessageHandler decoratedHandler;

    public MessageHandlerDecorator(MessageHandler decoratedHandler) {
        this.decoratedHandler = decoratedHandler;
    }

    @Override
    public void handle(String message) {
        decoratedHandler.handle(message);
    }
}





