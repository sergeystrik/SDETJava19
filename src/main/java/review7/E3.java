package review7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E3 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.frequency(numbers,10);
    }
}
