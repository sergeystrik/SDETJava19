package org.example.class15;

public class ExampleClassTest {
    public static void main(String[] args) {
        ExampleClass obj1 = new ExampleClass(10);
        System.out.println("Value using constructor with parameters: " + obj1.getValue());

        // Creating object using constructor without parameters
        ExampleClass obj2 = new ExampleClass();
        System.out.println("Value using constructor without parameters: " + obj2.getValue());
    }
}
