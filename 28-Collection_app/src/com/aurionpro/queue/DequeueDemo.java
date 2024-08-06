package com.aurionpro.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueDemo {
	public static void main(String[] args) {
        Deque<String> deque = new LinkedList();


        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");
        deque.addLast("D");

        System.out.println("Deque: " + deque);


        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from end: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);
    }
}
