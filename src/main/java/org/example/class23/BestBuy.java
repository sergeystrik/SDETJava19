package org.example.class23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BestBuy {
    public static void main(String[] args) {
        Map<Integer,String> bestBuyMap=new HashMap<>();
        bestBuyMap.put(7664847, "Printer");
        bestBuyMap.put(7879885, "TV");
        bestBuyMap.put(7892234, "Laptop");
        bestBuyMap.put(7985621, "Smartphone");
        bestBuyMap.put(7998745, "Headphones");
        for (Map.Entry<Integer, String> entry : bestBuyMap.entrySet()) {
            System.out.println("Item ID: " + entry.getKey() + ", Item Name: " + entry.getValue());
        }

    }
}
