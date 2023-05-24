package com.bookapp.main;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IBookService bookService = new BookServiceImpl();
		List<Book> book = bookService.getAll();
		for (Book books : book) {
			System.out.println(books);
		}
		
		System.out.println("---------------Get by category----------------");
		book = bookService.getAll();
		List<Book> bookByCategory=bookService.getByCategory("selfhelp");
		for (Book books : bookByCategory) {
			System.out.println(books);
		}
		
		System.out.println("---------------Get by Author----------------");
		book = bookService.getAll();
		List<Book> bookByAuthor=bookService.getByAuthor("Robert");
		for (Book books : bookByAuthor) {
			System.out.println(books);
		}
		
		System.out.println("---------------Get by id----------------");
		book = bookService.getAll();
		Optional<Book> bookByid=bookService.getById(2);
		System.out.println(bookByid);
	}
}
