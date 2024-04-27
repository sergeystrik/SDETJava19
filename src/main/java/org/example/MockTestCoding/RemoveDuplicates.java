package org.example.MockTestCoding;
//How can you remove all duplicates from ArrayList?

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void removeDuplicates(ArrayList<Integer> list) {
        // Create a Set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>(list);

        // Clear the original list
        list.clear();

        // Add unique elements back to the list
        list.addAll(uniqueElements);
    }

    public static void main(String[] args) {
        // Example ArrayList with duplicates
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);

        // Print the original list
        System.out.println("Original ArrayList: " + list);

        // Remove duplicates
        removeDuplicates(list);

        // Print the list after removing duplicates
        System.out.println("ArrayList after removing duplicates: " + list);
    }
}
//This code defines a method removeDuplicates() that takes an ArrayList as input,
// removes duplicates from it, and modifies the original list. The main() method
// demonstrates how to use this method with an example ArrayList containing duplicates.