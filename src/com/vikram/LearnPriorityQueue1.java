package com.vikram;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class LearnPriorityQueue1 {
    public static void main(String[] args){

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(20);
        pq.add(15);
        pq.add(10);
        pq.add(7);

        System.out.println(pq);
        System.out.println(pq.element());
        System.out.println(pq.peek());

        System.out.println("Iterating the queue elements: ");
        Iterator<Integer>itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        pq.remove();
        pq.poll();
        System.out.println(pq);

    }
}
