package org.example.class22;
//java create an arraylist of cars and retrieve all the values using 2 different ways
import java.util.ArrayList;

public class E4 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mercedes");

        for (String car : cars) {
            System.out.println(car);
        }
        cars.forEach(x-> System.out.println(x));
        }
    }

