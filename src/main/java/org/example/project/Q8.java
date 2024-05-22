package org.example.project;

import java.util.ArrayList;
import java.util.List;

/*
You have a list of strings and you want to keep only
those that start with
“A” and you want to return them in lower case".
 */
public class Q8 {



    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("Chai");
        stringList.add("Coke");
        stringList.add("Apple");
        stringList.add("aOrange");
        stringList.add("Ananas");
        System.out.println(convertList(stringList));

    }

    static List<String> convertList(List<String> listOfWords){
        List<String> newList=new ArrayList<>();
        for (String word:listOfWords){
            if(word.startsWith("a")||word.startsWith("A")){
                newList.add(word.toLowerCase());
            }
        }
        return newList;
    }


}
