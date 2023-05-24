package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book> showBooks() {
		List<Book> books = Arrays.asList(
		new Book("Java", "Kathy", 1, 900, "Tech"),
		new Book("Spring in action", "Kathy", 2, 900, "Tech"),
		new Book("Life afterlife", "Robert", 3, 900, "Fiction"),
		new Book("Leadership", "Robin", 4, 900, "selfhelp"),
		new Book("5amCub", "Robin", 5, 900, "Tech"));
		return books;
	}
}
