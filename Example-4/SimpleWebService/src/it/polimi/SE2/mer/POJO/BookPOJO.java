package it.polimi.SE2.mer.POJO;

public class BookPOJO {
	
	public String authorName;
	public String bookName;
	public String format;
	public Integer price;
	
	public BookPOJO() {
		
	}
	
	public BookPOJO(String authorName, String bookName, String format, Integer price) {
		super();
		this.authorName = authorName;
		this.bookName = bookName;
		this.format = format;
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	

}
