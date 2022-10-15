package com.vikram;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class LearnPriorityQueue {
    public static void main(String[] args){

        /*Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(23);
        pq.offer(43);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);*/


        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(23);
        pq.offer(43);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
    }
}
