package org.tnsif.service;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
	//abstract method
		Book getBookId(int id);
		List<Book>getAllBooks();
		List<Book>getAuthorBooks(String author);
		int getBooksCount();
		List<Book>getBookByPrice(int low,int high);

}
