// BasicMessageHandler.java
public class BasicMessageHandler implements MessageHandler {
    @Override
    public void handle(String message) {
        System.out.println("Handling message: " + message);
    }
}
