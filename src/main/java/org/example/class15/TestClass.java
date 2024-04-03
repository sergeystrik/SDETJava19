package org.example.class15;

public class TestClass {
    public static void main(String[] args) {
        // 1. Inside the same class
        ConstructorExample obj1 = new ConstructorExample();

        // 2. From outside the class
        ConstructorExample obj2 = new ConstructorExample(10);

        // 3. From a different class inside a different package
        ConstructorExample obj3 = new ConstructorExample(5.5);

        // 4. From a different class inside a different package
        ConstructorExample obj4 = new ConstructorExample("Hello");
    }
}
