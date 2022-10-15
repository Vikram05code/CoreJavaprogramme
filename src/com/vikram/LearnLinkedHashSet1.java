package com.vikram;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LearnLinkedHashSet1 {
    public static void main(String[] args){

        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(20);
        lhs.add(10);
        lhs.add(6);
        lhs.add(12);

        Iterator<Integer> itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
