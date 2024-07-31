// WebBroadcastMessageHandlerDecorator.java
public class WebBroadcastMessageHandlerDecorator extends MessageHandlerDecorator {
    public WebBroadcastMessageHandlerDecorator(MessageHandler decoratedHandler) {
        super(decoratedHandler);
    }

    @Override
    public void handle(String message) {
        super.handle(message);
        broadcastWeb(message);
    }

    private void broadcastWeb(String message) {
        System.out.println("Broadcasting message to web interface: " + message);
    }
}