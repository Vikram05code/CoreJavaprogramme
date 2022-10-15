package com.vikram;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

        /*list.add(10);
        list.add(12);
        list.add(5);
        list.add(26);
        list.add(34);
        list.add(67);
        list.add(68);
        list.add(24);
        list.add(679);
        list.add(234);
        list.add(546);
        list.add(6543);*/

       // System.out.println(list.contains(68));

        /*System.out.println(list);
       // list.set(0, 99);
        list.remove(2);
        System.out.println(list);*/

        //input
        for(int i=0; i<10; i++){
            list.add(sc.nextInt());
        }

        //output
        for(int i=0; i<10; i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
