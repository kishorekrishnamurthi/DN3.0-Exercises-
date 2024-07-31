// ComputerBuilderTest.java
public class ComputerBuilderTest {
    public static void main(String[] args) {
        // Create a high-end gaming computer
        Computer gamingPC = new Computer.Builder("Intel Core i9", "32GB DDR4")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA GeForce RTX 3080")
                .setPowerSupply("750W")
                .setCoolingSystem("Liquid Cooling")
                .build();
        
        System.out.println(gamingPC);

        // Create a basic office computer
        Computer officePC = new Computer.Builder("Intel Core i5", "16GB DDR4")
                .setStorage("500GB HDD")
                .build();
        
        System.out.println(officePC);
    }
}
