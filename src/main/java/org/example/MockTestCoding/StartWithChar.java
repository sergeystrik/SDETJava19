package org.example.MockTestCoding;
//You have a list of strings and you want to keep only those that start with
//“A” and you want to return them in lower case".

import java.util.ArrayList;
import java.util.List;

public class StartWithChar {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apricot");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Avocado");
        fruits.removeIf(x-> (x.charAt(0) != 'A'));
        String lastString = fruits.toString();
        System.out.println(lastString.toLowerCase());


    }
}
