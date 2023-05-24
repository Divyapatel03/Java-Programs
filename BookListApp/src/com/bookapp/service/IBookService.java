package com.bookapp.service;

import java.util.List;
import java.util.Optional;

import com.bookapp.model.Book;

public interface IBookService {
	List<Book> getAll();

	List<Book> getByAuthor(String author);

	//it returns only one  value....id is only one
	Optional<Book> getById(int bookId);

	List<Book> getByCategory(String category);
}
