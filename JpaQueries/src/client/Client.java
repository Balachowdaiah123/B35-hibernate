package client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookService service=new BookServiceImpl();
		System.out.println("Total No.of Books: "+service.getBooksCount());
		System.out.println("Total Book With ID: "+service.getBookId(12));
		System.out.println("The Book With specific author: "+service.getAuthorBooks("Bala"));
		System.out.println("The price between 2000 to 2400: "+service.getBookByPrice(2000, 2400));
		
	}

}
