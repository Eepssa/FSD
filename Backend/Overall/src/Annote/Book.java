package Annote;

public class Book {
	String name;
	int page;
	String author;
	
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", page=" + page + ", author=" + author + "]";
	}


	public Book(String name, int page, String author) {
		super();
		this.name = name;
		this.page = page;
		this.author = author;
	}
	
	

}
