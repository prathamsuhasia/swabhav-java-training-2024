package com.aurionpro.srp.violation.test;

import com.aurionpro.srp.violation.model.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice bill = new Invoice(1, "Mobile phone", 10000, 10);
		
		bill.printInvoice();
	}

}
