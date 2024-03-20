package review4;

public class E9Task {
    public static void main(String[] args) {
        // Calculate the avg of numbers which is greater than 25
        int[] numbers = {10, 25, 45, 66, 85, 100};
        double sum = 0;
        int counter=0;
        for (int n:numbers) {

            if (n>25){
                sum +=n;
                counter++;
            }
        }
        System.out.println(sum/counter);
        }
       }