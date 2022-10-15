package com.vikram;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LearnArrayList {
     public static void main(String[] args){
        /* String[] studentsName = new String[30];
         studentsName[0] = "Rakesh";
         studentsName[29] = "Harish";
         */

        // ArrayList<String> studentsName = new ArrayList<>();
        // studentsName.add("Rakesh");

         /*List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         System.out.println(list);
         list.add(4);
         System.out.println(list);

         list.add(1, 50);
         System.out.println(list);

         List<Integer> newList = new ArrayList<>();
         newList.add(150);
         newList.add(160);

         list.addAll(newList);
         System.out.println(list);

         System.out.println(list.get(1));*/

         List<Integer> list = new ArrayList<>();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         list.add(50);
         list.add(60);
         list.add(70);
         list.add(80);

         System.out.println(list);

         /*list.remove(1);
         System.out.println(list);

         list.remove(Integer.valueOf(30));
         System.out.println(list);

         list.clear();
         System.out.println(list);*/

         /*list.set(2, 1000);
         System.out.println(list);

         System.out.println(list.contains(50));*/

         for(int i=0; i<list.size(); i++){
             System.out.println("The element is: "+ list.get(i));
         }

         for(Integer element : list){
             System.out.println("foreach element is: "+ element);
         }

         Iterator<Integer> it = list.iterator();

         while(it.hasNext()){
             System.out.println("Iterator "+ it.next());
         }


     }
}
