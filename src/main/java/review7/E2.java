package review7;

import java.util.ArrayList;

public class E2 {
    public static void main(String[] args) {

        ArrayList<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        int sum=0;
        for (int a:number){
            sum+=a;
        }
        System.out.println(sum);
    }
}
