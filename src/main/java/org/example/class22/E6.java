package org.example.class22;
//Create arraylist of even numbers from 1 to 500 using loop.
// Then write another loop to remove any number that is divisible by 5
// from that arraylist
import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 500; i += 2) {
            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.removeIf(c -> c % 5 == 0);
        System.out.println(numbers);
    }
}

