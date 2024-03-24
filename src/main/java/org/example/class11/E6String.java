package org.example.class11;

public class E6String {
    public static void main(String[] args) {
    // how would you check String is palindrome or  not?
        String originalstr="aba";
        StringBuilder st=new StringBuilder(originalstr);
        st.reverse();
        String reversedStr=st.toString();
        if (originalstr.equals(reversedStr)){
            System.out.println("True");

        }else {
            System.out.println("False");
        }


    }
}
