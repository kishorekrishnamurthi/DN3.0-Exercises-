// CommandPatternTest.java
public class CommandPatternTest {
    public static void main(String[] args) {
        // Create a light instance
        Light livingRoomLight = new Light();

        // Create command instances
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create the remote control instance
        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
