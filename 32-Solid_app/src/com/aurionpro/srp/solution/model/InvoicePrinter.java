package com.aurionpro.srp.solution.model;

public class InvoicePrinter {

	private Invoice invoice;
	private TaxCalculator taxCalculator;
	
	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}

	public void printInvoice() {
		System.out.println("Id: " + invoice.getId());
		System.out.println("Desciption:" + invoice.getDescription());
		System.out.println("Amount " + invoice.getAmount());
		System.out.println("tax amount " + taxCalculator.calculateTax());
		System.out.println("Total amount " + (invoice.getAmount() + taxCalculator.calculateTax()));
	}
}
