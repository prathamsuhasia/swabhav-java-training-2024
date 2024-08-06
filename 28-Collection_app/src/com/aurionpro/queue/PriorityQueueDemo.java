package com.aurionpro.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	 public static void main(String[] args) {
	        PriorityQueue<Integer> pq = new PriorityQueue<>();


	        pq.offer(10);
	        pq.offer(5);
	        pq.offer(20);
	        pq.offer(15);

	        System.out.println("PriorityQueue: " + pq);

	        System.out.println("Peek: " + pq.peek());

	        System.out.println("Removed: " + pq.poll());
	        System.out.println("PriorityQueue after removal: " + pq);
	    }

}
