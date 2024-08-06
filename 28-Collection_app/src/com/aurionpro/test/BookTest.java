package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.comparator.BookComparator;
import com.aurionpro.comparator.BookComparator.BookTitleComparator;
import com.aurionpro.model.Book;

public class BookTest {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, 1925));
		books.add(new Book("1984", "George Orwell", 8.99, 1949));
		books.add(new Book("To Kill a Mockingbird", "Harper Lee", 7.99, 1960));
		books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 6.99, 1951));
		books.add(new Book("Moby-Dick", "Herman Melville", 12.99, 1851));

		System.out.println("Accordint to title ");
		Collections.sort(books, new BookComparator.BookTitleComparator());
		System.out.println(books);
		
		System.out.println("\nAccording to author");
		Collections.sort(books, new BookComparator.BookAuthorComparator());
		System.out.println(books);
		
		System.out.println("\nAccording to price");
		Collections.sort(books, new BookComparator.BookPriceComparator());
		System.out.println(books);
		
		System.out.println("\nAccording to publication  in descending order");
		Collections.sort(books, new BookComparator.BookPublicationYearComparator());
		System.out.println(books);

	}
}
