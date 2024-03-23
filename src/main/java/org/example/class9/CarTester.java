package org.example.class9;

public class CarTester {
    public static void main(String[] args) {
        Car toyotaCar=new Car();
        toyotaCar.make="Toyota";
        toyotaCar.model="Prius";
        toyotaCar.year=2024;
        toyotaCar.color="Red";
        toyotaCar.price=50000;
        System.out.println(toyotaCar.make);
        System.out.println(toyotaCar.model);
        System.out.println(toyotaCar.year);
        System.out.println(toyotaCar.price);
        toyotaCar.moveForward();
        toyotaCar.applyBrakes();
        Car mercedesCar=new Car();
        mercedesCar.make="Mercedes";
        mercedesCar.model="GLS";
        mercedesCar.year=2024;
        mercedesCar.color="Red";
        mercedesCar.price=15000;
        System.out.println(mercedesCar.make);
        System.out.println(mercedesCar.model);
        System.out.println(mercedesCar.year);
        System.out.println(mercedesCar.price);
        mercedesCar.moveForward();
        mercedesCar.applyBrakes();

    }
}
