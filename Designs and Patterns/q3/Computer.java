// Computer.java
public class Computer {
    // Required attributes
    private String processor;
    private String memory;

    // Optional attributes
    private String storage;
    private String graphicsCard;
    private String powerSupply;
    private String coolingSystem;

    // Private constructor
    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.memory = builder.memory;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.powerSupply = builder.powerSupply;
        this.coolingSystem = builder.coolingSystem;
    }

    // Static nested Builder class
    public static class Builder {
        // Required attributes
        private String processor;
        private String memory;

        // Optional attributes
        private String storage;
        private String graphicsCard;
        private String powerSupply;
        private String coolingSystem;

        // Constructor with required attributes
        public Builder(String processor, String memory) {
            this.processor = processor;
            this.memory = memory;
        }

        // Setter methods for optional attributes
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder setCoolingSystem(String coolingSystem) {
            this.coolingSystem = coolingSystem;
            return this;
        }

        // Build method to create Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [processor=" + processor + ", memory=" + memory + ", storage=" + storage
                + ", graphicsCard=" + graphicsCard + ", powerSupply=" + powerSupply
                + ", coolingSystem=" + coolingSystem + "]";
    }
}
