package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BookModel;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BookModel books[] = new BookModel[2];
		for(int i = 0 ; i<books.length; i++) {
			System.out.println("Enter book id");
			int bookID = sc.nextInt();
			System.out.println("Enter Book Name");
			String name = sc.next();
			System.out.println("Enter Book author name");
			String author = sc.next();
			System.out.println("Enter book price");
			double price = sc.nextDouble();
			System.out.println("Enter Book Publication");
			String publication = sc.next();
			
			books[i] = new BookModel(bookID,name, author, price,publication);
			
		}

		for (int i =0; i< books.length; i++) {
			System.out.println("Book id : " + books[i].getBookId());
			System.out.println("Book Name: " + books[i].getName());
			System.out.println("Author name: " + books[i].getAuthor());
			System.out.println("book price: " + books[i].getPrice());
			System.out.println("Book publication " + books[i].getPublication());
		}

	}
}
