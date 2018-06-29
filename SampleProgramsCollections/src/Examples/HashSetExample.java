package Examples;


import java.util.Set;
import java.util.TreeSet;
class Magazine implements Comparable<Magazine>{

int id;
String name,author,publisher;
public Magazine(int id, String name, String author, String publisher) {
	
	this.id = id;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
	
	
	public int compareTo(Magazine m) {
		
		return this.id>m.id?-1:this.id<m.id?1:0;
	}
}
}



public class HashSetExample {

	public static void main(String[] args) {
		Set<Magazine> set= new TreeSet<Magazine>();
		//
		Magazine m1 = new Magazine(01,"sam","dev","afs");
		Magazine m2 = new Magazine(02,"sev","gev","hfs");
		//add
		set.add(m1);
		set.add(m2);
		
		for(Magazine m:set ) {
			System.out.println(m.id+" " +m.name+" " +m.author+" "+
		m.publisher);
		}
		
		
	}
}
