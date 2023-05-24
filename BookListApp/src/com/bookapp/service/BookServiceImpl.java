package com.bookapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		List<Book> book=BookDetails.showBooks();
		return book;
	}

	@Override
	public List<Book> getByAuthor(String author) {
		List<Book> book=BookDetails.showBooks();
		List<Book> getByAuthor=book.stream()
				.filter(getauthor->getauthor.getAuthor().equals(author))
				.collect(Collectors.toList());
		return getByAuthor;
		
	}

	@Override
	public List<Book> getByCategory(String category) {
		List<Book> book=BookDetails.showBooks();
		List<Book> getByCategory=book.stream()
				.filter(getcategory->getcategory.getCategory().equals(category))
				.collect(Collectors.toList());
		return getByCategory;
	}

	@Override
	public Optional<Book> getById(int bookId) {
		List<Book> book=BookDetails.showBooks();
		Optional<Book> getById=book.stream()
				.filter(getid->((Integer)getid.getBookId()).equals((Integer)bookId))
				//after filtering any records are present or not
				.findAny();
						
		return getById;
	}

	
}
