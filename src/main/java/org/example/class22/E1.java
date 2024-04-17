package org.example.class22;

import java.util.ArrayList;

public class E1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList();
        names.add("James");
        names.add("Diane");
        names.add("John");
        names.add("Nikola");
        System.out.println(names);
        System.out.println(names.size());
        names.remove("James");
        System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
        for (String s:names){
            System.out.println(s);
        }
    }
}
