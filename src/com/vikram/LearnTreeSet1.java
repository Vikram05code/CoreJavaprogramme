package com.vikram;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;

public class LearnTreeSet1 {
    public static void main(String[] args){

        SortedSet<Integer> s1 = new TreeSet<>();

        s1.add(20);
        s1.add(28);
        s1.add(12);
        s1.add(5);
        s1.add(3);

        Iterator<Integer> itr = s1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
