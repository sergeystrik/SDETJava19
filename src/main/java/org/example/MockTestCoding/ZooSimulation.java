package org.example.MockTestCoding;
interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();
}

abstract class Animal implements AnimalBehavior {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayInformation();
}

class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    @Override
    void displayInformation() {
        System.out.println("Mammal: Name - " + name + ", Age - " + age);
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is pecking.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is roosting.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }

    @Override
    void displayInformation() {
        System.out.println("Bird: Name - " + name + ", Age - " + age);
    }
}

public class ZooSimulation {
    public static void main(String[] args) {
        Animal lion = new Mammal("Lion", 5);
        Animal parrot = new Bird("Parrot", 2);

        lion.eat();
        lion.makeSound();
        lion.displayInformation();

        System.out.println();

        parrot.eat();
        parrot.makeSound();
        parrot.displayInformation();
    }
}
//In this implementation:
//
//We define an AnimalBehavior interface with methods eat(), sleep(), and makeSound().
//We create an abstract class Animal that implements AnimalBehavior and defines properties like name and age.
// It also declares an abstract method displayInformation() for showing details about the animal.
//The Mammal and Bird classes extend Animal and implement specific behaviors for mammals and birds, respectively.
// They override methods like eat(), sleep(), and makeSound().
//We demonstrate polymorphism and method overriding by creating instances of Mammal and Bird and calling the behavior
// methods on them.
//The displayInformation() method displays information about each animal, showcasing data encapsulation and abstraction.