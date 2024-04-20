package org.example.class23;
//Create a map of a building. Store floor number and its associated company name.
//(Example: 1= Google, 2=Syntax etc... )Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map

import java.util.HashMap;
import java.util.Map;

public class BuildingMap {
    public static void main(String[] args) {
        Map<Integer, String> buildingMap = new HashMap<>();

        buildingMap.put(1, "Google");
        buildingMap.put(2, "Syntax");
        buildingMap.put(3, "Microsoft");
        buildingMap.put(4, "Amazon");
        buildingMap.put(5, "Apple");
        buildingMap.put(6, "Facebook");
        buildingMap.put(7, "Google");

        System.out.println("Number of entries: " + buildingMap.size());
        buildingMap.put(4, "Oracle");
        buildingMap.remove(7);
        System.out.print(buildingMap);

        }
    }
