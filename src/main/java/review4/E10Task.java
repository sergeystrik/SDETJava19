package review4;

public class E10Task {
    public static void main(String[] args) {
        //how many even numbers
        int[] numbers = {10, 25, 45, 66, 85, 100};
        int counter=0;
        for (int n:numbers) {

            if (n%2==0){
                counter++;
            }
        }
        System.out.println(counter);
        }
       }