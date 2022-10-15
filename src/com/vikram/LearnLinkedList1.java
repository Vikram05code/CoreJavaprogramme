package com.vikram;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class LearnLinkedList1 {
    public static void main(String[] args){

        List<Integer> li = new LinkedList<>();
        li.add(20);
        li.add(30);
        li.add(60);
        li.add(24);
        li.add(12);

        Iterator<Integer> itr = li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
