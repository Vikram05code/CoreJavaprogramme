package com.vikram;
import java.util.Set;
import java.util.HashSet;
public class LearnHashSet {
    public static void main(String[] args){

        Set<Integer> hq = new HashSet<>();

        hq.add(20);
        hq.add(30);
        hq.add(40);
        hq.add(12);
        hq.add(5);

        for(int i : hq){
            System.out.println(i);
        }
    }
}
