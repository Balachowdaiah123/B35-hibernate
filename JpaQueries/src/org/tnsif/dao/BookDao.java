package org.tnsif.dao;

import java.awt.print.Book;
import java.util.List;



public interface BookDao {
	
	//abstract method
	Book getBookId(int id);
	List<Book>getAllBooks();
	List<Book>getAuthorBooks(String author);
	int getBooksCount();
	List<Book>getBookByPrice(int low,int high);

}
