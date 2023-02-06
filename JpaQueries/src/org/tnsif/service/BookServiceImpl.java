package org.tnsif.service;

import java.awt.print.Book;
import java.util.List;

import org.tnsif.dao.BookDao;
import org.tnsif.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{
    private BookDao dao;
    public BookServiceImpl() {
    	super();
    	dao=new BookDaoImpl();
    }
	@Override
	public Book getBookId(int id) {
		
		return dao.getBookId(id);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBooks(author);
	}

	@Override
	public int getBooksCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Book> getBookByPrice(int low, int high) {
		// TODO Auto-generated method stub
		return dao.getBookByPrice(low, high);
	}

}
