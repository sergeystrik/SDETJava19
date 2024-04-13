package org.example.class20;
//Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
// which should be returning a price of the Vehicle.
//Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of
// calculateSalePrice() method in which returned price calculated as following: if weight>2000 then returned price car
// should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
// if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount

public class Vehicle {
    protected double vehiclePrice;

    public Vehicle(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
    public double calculateSalePrice() {
        return vehiclePrice;
    }
}
class Sedan extends Vehicle {
    private double length;

    public Sedan(double vehiclePrice, double length) {
        super(vehiclePrice);
        this.length = length;
    }
    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return vehiclePrice * 0.95; // 5% discount
        } else {
            return vehiclePrice * 0.90; // 10% discount
        }
    }
}
class Truck extends Vehicle {
    private double weight;

    public Truck(double vehiclePrice, double weight) {
        super(vehiclePrice);
        this.weight = weight;
    }
    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return vehiclePrice * 0.90; // 10% discount
        } else {
            return vehiclePrice * 0.80; // 20% discount
        }
    }
}
 class VehicleSalePriceTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(25000, 18);
        Truck truck = new Truck(40000, 2200);

        System.out.println("Sedan Sale Price: $" + sedan.calculateSalePrice());
        System.out.println("Truck Sale Price: $" + truck.calculateSalePrice());
    }
}
