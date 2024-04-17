package org.example.class22;
//Create arraylist of even numbers from 1 to 500 using loop.
// Then write another loop to remove any number that is divisible by 5
// from that arraylist
import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 2; i <= 500; i += 2) {
            evenNumbers.add(i);
        }
        removeNumbers(evenNumbers);
        System.out.println(evenNumbers);
    }
    public static void removeNumbers(ArrayList<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 5 == 0) {
                numbers.remove(i);
            }
        }
        }
    }

