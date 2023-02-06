package org.tnsif.dao;

import java.awt.print.Book;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class BookDaoImpl implements BookDao {
	private EntityManager em;
	

	public BookDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	public Book getBookId(int id) {
		Book book=em.find(Book.class, id);
		return book;
	}

	@Override
	public List<Book> getAllBooks() {
		Query query=em.createNamedQuery("getAllBooks");
		List<Book>b1=query.getResultList();
		return b1;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		String query="Select book From Book book WHERE book.author=:pAuthor";
		TypedQuery<Book>query1=em.createQuery(query,Book.class);
		query1.setParameter("PAuthr", author);
		List<Book>b1=query1.getResultList();
		return b1;
	}

	@Override
	public int getBooksCount() {
		String query="SELECT COUNT(book.id)FROM BOOK book";
		TypedQuery<Integer>query1=em.createQuery(query,Integer.class);
		int count=query1.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getBookByPrice(int low, int high) {
		String query="SLECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book>query1=em.createQuery(query,Book.class);
		query1.setParameter("low", low);
		query1.setParameter("high", high);
		List<Book>b1=query1.getResultList();
		return b1;
	}

}
