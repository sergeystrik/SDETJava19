package org.example.class12;

public class E4Methods {
    int addArray(int[]arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        E4Methods e2=new E4Methods();
        int[] ar={10,20,30};
        int result= e2.addArray(ar);
        System.out.println(result);
    }
}
