package org.example.class23;

import java.util.Set;
import java.util.TreeMap;

public class E4 {
    public static void main(String[] args) {
        TreeMap<String,Double> fruit=new TreeMap<>();
      fruit.put("Banana",20.5);
        fruit.put("Kiwi",5.5);
        fruit.put("Apple",25.5);
       fruit.put("Orange",10.5);
       fruit.forEach((k,v)-> System.out.println(k+" "+v));
        Set<String> keys=fruit.keySet();
        keys.removeIf(x->x.contains("a")||x.contains("A"));
        System.out.println(fruit);


    }
}
