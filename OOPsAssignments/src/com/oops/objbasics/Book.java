package com.oops.objbasics;

public class Book {
	String title;
	String author;
	double price;
	String category;

	public Book(String title, String author, double price, String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}

	void getDetails() {
		System.out.println("Title of book :" + title);
		System.out.println("Author of book :" + author);
		if (price > 500)
			System.out.println("Premium book with price:" + price);
		else
			System.out.println("Standard  book with price:" + price);
		System.out.println("Category of book :" + this.category);
		System.out.println("------------------------------------");

	}
}
