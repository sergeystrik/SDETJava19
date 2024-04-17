package org.example.class22;
//Create an array list of drinks call it. If any drink has letter "a" or"e" replace whole word with water
import java.util.ArrayList;

public class E5 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("juice");
        drinks.add("soda");
        drinks.add("watermelon");
        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
        }
    }

