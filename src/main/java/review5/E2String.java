package review5;

public class E2String {
    public static void main(String[] args) {
    String str="Java is not easy";
        System.out.println(str.charAt(3));
    char c= str.charAt(3);
int counter=0;
    for (int i=0;i<str.length();i++){
        char ch= str.charAt(i);
        if (ch == 'a') {
            counter++;
        }
        }
        System.out.println(counter);
    }
    }
