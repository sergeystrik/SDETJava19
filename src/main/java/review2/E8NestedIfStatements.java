package review2;

public class E8NestedIfStatements {
    public static void main(String[] args) {

    boolean haveCoupon=false;
    int coupon=20;
    if(haveCoupon){
        System.out.println("Apply 10% discount");
    } else if (coupon==20) {
        System.out.println("Apply 20% discount");

    }else {
        System.out.println("Wrong coupon code");
    }
    }
}
