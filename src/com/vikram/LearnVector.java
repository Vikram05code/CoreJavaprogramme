package com.vikram;
import java.util.Vector;
import java.util.Iterator;
public class LearnVector {
    public static void main(String[] args){

        Vector<Integer> v1 = new Vector<>();
        v1.add(30);
        v1.add(20);
        v1.add(24);
        v1.add(12);
        v1.add(34);

        Iterator<Integer> itr = v1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
