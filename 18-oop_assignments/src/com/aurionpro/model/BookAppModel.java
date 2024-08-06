package com.aurionpro.model;

public class BookAppModel {
	private int bookID;
	private String name;
	private String author;
	private double price;
	private String publication;

	public BookAppModel() {

	}

	public int getBookId() {
		return bookID;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}
	
	public String getPublication() {
		return publication;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}

	public BookAppModel(int bookID, String name, String author, double price, String publication) {
		this.bookID = bookID;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}
}
