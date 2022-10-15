package com.vikram;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
public class LearnArrayList2 {
    public static void main(String[] args){
         List<Integer> arr = new ArrayList<>();
         arr.add(50);
         arr.add(40);
         arr.add(34);
         arr.add(12);
         arr.add(6);
         //System.out.println(arr);

      // iterate using Iterator
        /*Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

        // iterate using forEach loop
        /*for(Integer x : arr){
            System.out.println(x);
        }*/

        /*//accessing the element
        System.out.println("Returning element: "+arr.get(2));
        //changing the element
        arr.set(3, 100);

        //Traversing list
        for(Integer y : arr){
            System.out.println(y);
        }*/

        // Sort ArrayList
        Collections.sort(arr);
        System.out.println(arr);

    }
}
