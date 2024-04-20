package org.example.class23;
//Create a map of countries(5) with its capital that will store countries in
// alphabetical order. Country names will be keys and capitals will be values
//Print all keys and values from a country map using for each loop or Lambda.
//Print all values from a country map using for each loop or Lambda.

import java.util.Map;
import java.util.TreeMap;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,String> countryMap=new TreeMap<>();
        countryMap.put("Germany", "Berlin");
        countryMap.put("France", "Paris");
        countryMap.put("Italy", "Rome");
        countryMap.put("Spain", "Madrid");
        countryMap.put("United Kingdom", "London");
        for (Map.Entry<String, String> entry : countryMap.entrySet()) {
            System.out.println( entry.getKey() + " " + entry.getValue());
        }
        countryMap.forEach((country, capital) -> System.out.println( country + " " + capital));
        for (String capital : countryMap.values()) {
            System.out.println(capital);
        }
        countryMap.values().forEach(capital -> System.out.println(capital));
    }
}
