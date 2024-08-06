package com.aurionpro.model;

public class RunnableThread implements Runnable {
	private Thread thread;

	public RunnableThread() {
		 thread =  new Thread(this);
		 thread.start();
	}
	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException exception) {
				exception.printStackTrace();
			}

		}

	}
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;
	}
	
}
