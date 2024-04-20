package review7;

import java.util.ArrayList;

public class E1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList();
        numbers.add(45.0);
        numbers.add(50.0);
        numbers.add(60.0);
        numbers.add(20.0);
        System.out.println(numbers);
//------------------------------------

        numbers.forEach(g-> System.out.println(g));
//-----------------------------------
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
  //--------------------------------------------
            for (Double d:numbers){
                System.out.println(d);
            }

        }
    }
}
