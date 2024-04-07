package org.example.class17;
//Create a Bird class create 4 fields and use the
//Bird class as parent class and create 2 classes
//Using it one sparrow and one parrot use constructors make fields private and define
// printInfo methods as well create the object of each class and call the methods
public class Bird {
    private String species;
    private String color;
    private int age;
    private boolean canFly;

    // Constructor
    Bird(String species, String color, int age, boolean canFly) {
        this.species = species;
        this.color = color;
        this.age = age;
        this.canFly = canFly;
    }

    // Method to print bird information
    public void printInfo() {
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}

// Child class Sparrow
class Sparrow extends Bird {
    Sparrow(String color, int age) {
        super("Sparrow", color, age, true);
    }
}

// Child class Parrot
class Parrot extends Bird {
    Parrot(String color, int age) {
        super("Parrot", color, age, true);
    }
}

class BirdTester {
    public static void main(String[] args) {
        // Creating objects of Sparrow and Parrot
        Sparrow sparrow = new Sparrow("Brown", 2);
        Parrot parrot = new Parrot("Green", 3);

        // Calling printInfo method for each bird
        System.out.println("Sparrow Information:");
        sparrow.printInfo();
        System.out.println();

        System.out.println("Parrot Information:");
        parrot.printInfo();
    }
}
