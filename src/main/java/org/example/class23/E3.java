package org.example.class23;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class E3 {
    public static void main(String[] args) {
        TreeMap<String,Double> fruit=new TreeMap<>();
      fruit.put("BlushOn",20.5);
        fruit.put("Lipstick",5.5);
        fruit.put("Apple",25.5);
       fruit.put("Orange",10.5);
        Set<String> keys=fruit.keySet();
        //OR
       // var keys=fruit.keySet();
        System.out.println(keys);




    }
}
