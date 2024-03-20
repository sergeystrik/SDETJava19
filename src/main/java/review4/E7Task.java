package review4;

public class E7Task {
    public static void main(String[] args) {
       //Write a program to calculate the avg of these numbers
        int[] numbers={10,20,30};
        int sum=0;
        for (int i=0;i< numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum/numbers.length);
       }

        }
