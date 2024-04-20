package org.example.class23;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E5 {
    public static void main(String[] args) {
        TreeMap<String,Double> fruit=new TreeMap<>();
      fruit.put("Banana",20.5);
        fruit.put("Kiwi",5.5);
        fruit.put("Apple",5.5);
       fruit.put("Orange",10.5);


        System.out.println(fruit.values());

       //Collection<Double> values=fruit.values();

       var values=fruit.values();

       values.removeIf(x->x>10);

        System.out.println(fruit);


    }
}
