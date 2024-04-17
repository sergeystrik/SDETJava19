package org.example.class22;

import java.util.ArrayList;

public class E2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("James");
        names.add("Diane");
        names.add("John");
        names.add("Nikola");
        names.add("Olga");

         names.forEach(x-> System.out.println(x));

    }
}
