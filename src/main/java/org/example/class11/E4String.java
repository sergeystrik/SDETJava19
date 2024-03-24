package org.example.class11;

public class E4String {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder("Sunday7343Monday");

      // st.deleteCharAt(6);
        //st.delete(6,9);
        st.insert(2,"0");
        System.out.println(st);

    }
}
