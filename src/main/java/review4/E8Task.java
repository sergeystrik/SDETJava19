package review4;

public class E8Task {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 66, 85, 100};
        double sum = 0;
        for (int n:numbers) {
            sum +=n;
        }
        System.out.println(sum / numbers.length);
        }
       }