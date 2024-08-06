package com.aurionpro.isp.violation.test;



import com.aurionpro.isp.violation.model.IWorker;
import com.aurionpro.isp.violation.model.Labour;
import com.aurionpro.isp.violation.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		IWorker labour = new Labour();
		
		labour.startwork();
		
		IWorker robot =  new Robot();
		
		robot.startwork();
		
	}
}
