package org.example.class18;
//Create a Class Computer that will have 4 subclasses as Apple,
// Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class
// and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array.
// Loop through each object and execute available methods.

public class  Computer {
    void turnOn(){

        System.out.println("is turning on");
    }

    void eat(){
        System.out.println("Booting up");

    }
    void walk(){
        System.out.println("Shutting down");
    }
}
class Apple extends Computer{

     void turnOn() {
        System.out.println(" is turning on.");
    }
    void sleep(){
        System.out.println("Syntax students lose sleep");
    }
}
class  Lenovo extends Computer{
    void workout(){
        System.out.println("College students workout");
    }
}
class  HP extends Computer{
    void playSports(){
        System.out.println("School students play sports");
    }
}
class ComputerTester {
    public static void main(String[] args) {
        Student [] arr={new syntaxStudent(),new collegeStudent(),new schoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            Student a=arr[i];
            a.eat();
            a.walk();
            a.work();

        }
    }
}
