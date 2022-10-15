package com.vikram;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class LearnArrayList3 {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Apple");
        arr.add("Mango");
        arr.add("Orange");
        arr.add("Banana");
        arr.add("Guava");

        //Collections.sort(arr);
        System.out.println(arr);

        // Traversing through ListIterator

        /*ListIterator<String> list1 = arr.listIterator(arr.size());
        while(list1.hasPrevious()){
            String str = list1.previous();
            System.out.println(str);
        }*/

        //Traversing through for loop

        /*for(int i=0; i<arr.size(); i++){
           System.out.println(arr.get(i));
        }*/

        //Traversing through foreach loop
       /* for(String i : arr){
            System.out.println(i);
        }*/

        //Traversing through forEach() method. it is a new feature, introduced in java 8

        arr.forEach(a->{
            System.out.println(a);
        });
    }
}
