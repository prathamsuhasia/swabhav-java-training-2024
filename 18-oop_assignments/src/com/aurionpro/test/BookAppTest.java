package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BookAppModel;
import com.aurionpro.model.CricketPlayerModel;

public class BookAppTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	BookAppModel books[] = new BookAppModel[4];
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
		
		books[i] = new BookAppModel(bookID,name, author, price,publication);
		
	}

	for (int i =0; i< books.length; i++) {
		System.out.println("Book id : " + books[i].getBookId());
		System.out.println("Book Name: " + books[i].getName());
		System.out.println("Author name: " + books[i].getAuthor());
		System.out.println("book price: " + books[i].getPrice());
		System.out.println("Book publication " + books[i].getPublication());
	}
	printPriceInDescending(books);
}

private static void printPriceInDescending(BookAppModel[] books) {
	for (int i = 0; i < books.length - 1; i++) {
		for (int j = 0; j < books.length - 1 - i; j++) {
			if (books[j].getPrice() < books[j + 1].getPrice()) {

				BookAppModel temp = books[j+1];
				books[j+1] = books[j ];
				books[j ] = temp;
			}
		}
		
		
		
	}
	System.out.println("Books in descending order");
	for (int i =0; i< books.length; i++) {
		System.out.println("Book id : " + books[i].getBookId());
		System.out.println("Book Name: " + books[i].getName());
		System.out.println("Author name: " + books[i].getAuthor());
		System.out.println("book price: " + books[i].getPrice());
		System.out.println("Book publication " + books[i].getPublication());
	}
	
}

}
