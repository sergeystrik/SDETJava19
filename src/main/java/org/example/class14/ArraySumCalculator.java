package org.example.class14;
//Create a method that will accept an array as parameters and will return a sum of
// all elements from that array. Method should be visibly only within same package
// and accessible by the creating an instance/object of the class.
public class ArraySumCalculator {
    int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArraySumCalculator calculator = new ArraySumCalculator();
        int sum = calculator.calculateSum(arr);
        System.out.println("Sum of array elements: " + sum);
    }
}