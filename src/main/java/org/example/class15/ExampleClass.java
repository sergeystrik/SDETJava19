package org.example.class15;

public class ExampleClass {
    private int value;

    // Constructor with parameters
    public ExampleClass(int value) {
        this.value = value;
    }

    // Constructor without parameters
    public ExampleClass() {
        // Default value if no parameter is provided
        this.value = 0;
    }

    // Getter method for value
    public int getValue() {
        return value;
    }
}
