package org.example.class23;

import java.util.HashMap;

public class E2 {
    public static void main(String[] args) {
        HashMap<String,Integer> makeUpMap=new HashMap<>();
        makeUpMap.put("BlushOn",20);
        makeUpMap.put("Lipstick",50);
        makeUpMap.put("EyeLiner",40);
        makeUpMap.put("Foundation",100);
        makeUpMap.remove("Lipstick");
        System.out.println(makeUpMap);
        makeUpMap.replace("BlushOn",70);
        System.out.println(makeUpMap);
        makeUpMap.clear();
        
    }
}
