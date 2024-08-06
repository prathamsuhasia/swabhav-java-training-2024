package com.aurionpro.model;

public class MyThread extends Thread{
	private Thread thread;

	public MyThread(String name) {
		super(name);
		start();
	}
	
	public void run() {
		
		for(int i = 5 ; i>0  ; i--) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
	}

	public Thread getThread() {
		// TODO Auto-generated method stub
		return thread;
	}
}
