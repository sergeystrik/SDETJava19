package org.example.class8;

public class E2Break {
    public static void main(String[] args) {
        String [] names={"James","Iram","Fab","Aladin","Anna","Silva"};
        String name="Aladin";
      for(String n:names){
          if (n.equals(name)){
              System.out.println(n+" Is present");
              break;
          }
      }



       }
    }

