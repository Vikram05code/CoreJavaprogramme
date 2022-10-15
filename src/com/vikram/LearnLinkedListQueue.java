package com.vikram;
import java.util.Queue;
import java.util.LinkedList;

public class LearnLinkedListQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(25);
        queue.offer(27);
        queue.offer(18);
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

       System.out.println(queue.peek());
    }
}
