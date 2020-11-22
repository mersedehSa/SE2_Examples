package it.polimi.SE2.mer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import it.polimi.SE2.mer.POJO.BookPOJO;

public class BookController {
	/*in this example for the sake of demonstration, we are creating in-memory list of books. For a real application
	 *you may create data source that is connected to you DB. Then within this controller you can manage the persistent unit
	 *similar to other examples
	 */
	public static List<BookPOJO> allBooks= new ArrayList<BookPOJO>();

	public BookPOJO getBookByName(String name) {
		BookPOJO theBook= new BookPOJO();
	
		Boolean isFound=false;
		for (BookPOJO b : allBooks) {
		    if (b.bookName.contentEquals(name))
		    {
		    	theBook=b;
		    	isFound=true;
		    }
		}
		if (isFound) {
			return theBook;
		}
		else {
    	return null;
		}

	}

	public List<BookPOJO> findAllbooks() {
		return allBooks;
	}
	

	
	public void insertBook(BookPOJO newBook) {
		
		BookPOJO book=getBookByName(newBook.getBookName());
		//To check that we don't have a book with same name already
		if (Objects.isNull(book)) {
		
		allBooks.add(newBook);
	  }
		
	}
	

	public void updateBook(BookPOJO updatedBook) {
			
		BookPOJO book=getBookByName(updatedBook.getBookName());
		if (Objects.nonNull(book)) {
			
			book.setAuthorName(updatedBook.getAuthorName());
	    	book.setFormat(updatedBook.getFormat());
	    	book.setPrice(updatedBook.getPrice());
			}
		
		
		}

	public Boolean removeBookByName(String name) {
		BookPOJO book=getBookByName(name);
		
		if (Objects.nonNull(book)) {
		
		allBooks.remove(book);
		return true;
	  }
		else return false;
		
	}

}
