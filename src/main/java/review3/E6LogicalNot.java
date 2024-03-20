package review3;

public class E6LogicalNot {
    public static void main(String[] args) {
        /*
        if someone is exactly 10 20 or 30 years old do not give discount otherwise
        give discount to everyone
         */
        int age=3;
        if(age!=10 && age!=20 && age!=30){
            System.out.println("You will get a discount of 20%");
        }
    }
}
