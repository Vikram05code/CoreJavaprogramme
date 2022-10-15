package com.vikram;
import java.util.Deque;
import java.util.ArrayDeque;
public class LearnArrayDeque1 {
    public static void main(String[] args){

        Deque<Integer> ad = new ArrayDeque<>();
        ad.add(50);
        ad.add(60);
        ad.add(20);
        ad.add(10);
        ad.add(5);

        for(Integer i : ad){
            System.out.println(i);
        }
    }

}
