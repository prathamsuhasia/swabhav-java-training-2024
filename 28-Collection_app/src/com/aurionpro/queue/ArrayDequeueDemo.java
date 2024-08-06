package com.aurionpro.queue;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
	public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();


        ad.addFirst("A");
        ad.addLast("B");
        ad.addFirst("C");
        ad.addLast("D");

        System.out.println("ArrayDeque: " + ad);


        System.out.println("Peek at front: " + ad.peekFirst());
        System.out.println("Peek at end: " + ad.peekLast());

        System.out.println("Removed from front: " + ad.removeFirst());
        System.out.println("Removed from end: " + ad.removeLast());
        System.out.println("ArrayDeque after removals: " + ad);
    }
}
