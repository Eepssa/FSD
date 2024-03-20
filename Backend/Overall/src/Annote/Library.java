package Annote;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;



public class Library {
	
	@BookType(type="Thriller")
	static Book b1 ;
	@BookType(type="Action")
	static Book b2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		b1 = new Book("hsxjs",1,"oi");
		b2 = new Book("mjh",2,"nmkl");
	    System.out.println(b1);
	    System.out.println(b2);
	    Library l=new Library();
	     Class bcl = l.getClass();
	     
	    for(Field fl:bcl.getDeclaredFields()) {
	     Annotation testAnn = fl.getAnnotation(BookType.class);
	     BookType bt = (BookType)testAnn;
	 
	     System.out.println("Book Types: " + bt.type());
	     }
	}

}
