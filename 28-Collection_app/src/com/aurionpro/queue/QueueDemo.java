package com.aurionpro.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
        Queue<String> queue = new LinkedList();


        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);


        System.out.println("Peek: " + queue.peek());


        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}
