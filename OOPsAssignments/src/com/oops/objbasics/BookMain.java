package com.oops.objbasics;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book("Death of city", "Amrita Pritam", 400, "fiction");
		Book book1 = new Book("Heart of two states", "Anurag", 1000, "Non-Fiction");
		book.getDetails();
		book1.getDetails();
	}
}
