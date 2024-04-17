package org.example.class22;
//Create an ArrayList that will store 5 names into it.
//• Find out whether the given ArrayList is empty or not?
//• Check whether the specific name is present in an ArrayList or not?
//• Find the size of your arrayList and print all values from that

import java.util.ArrayList;

public class E3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("James");
        names.add("Diane");
        names.add("John");
        names.add("Nikola");
        names.add("Olga");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Olga"));
        System.out.println(names.size());
        names.forEach(x-> System.out.println(x));

    }
}
