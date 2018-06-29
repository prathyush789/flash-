import java.util.*;
class Book {
int id;
String name, author,publisher;

public Book(int id, String name, String author, String publisher) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
}

}

public class DemoForAll {

	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<Book>();
		// create books
		Book b1 = new Book(01,"SDLC","JOHN","Ample");
		Book b2 = new Book(02,"ADS","SAm","sop");
		//add books
		list.add(b1);
		list.add(b2);
		
		for(Book b:list) {
		System.out.println(b1.id+" "+b1.name+" " +b1.author+ " "+b1.publisher);
		
	}
	}
	}


