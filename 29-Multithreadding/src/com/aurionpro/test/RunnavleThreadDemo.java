package com.aurionpro.test;

import com.aurionpro.model.RunnableThread;

public class RunnavleThreadDemo {
	public static void main(String[] args) {
		RunnableThread thread1 = new RunnableThread();
		RunnableThread thread2 = new RunnableThread();
		RunnableThread thread3 = new RunnableThread();
		

		
		
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
			
			
		}
		try {
			thread1.getThread().join();
			thread2.getThread().join();
			thread3.getThread().join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		

		
	}
}
