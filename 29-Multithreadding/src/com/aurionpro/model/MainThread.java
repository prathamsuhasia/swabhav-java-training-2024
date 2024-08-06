package com.aurionpro.model;

public class MainThread {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);

		thread.setName("Mythrread");
		System.out.println(thread);

		for (int i = 0; i < 5; i++) {
			System.out.println(thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
	}

}
