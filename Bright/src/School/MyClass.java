package School;
public class MyClass{
   	
	public static void main(String[] args) {
	Teacher mark = new Teacher();
	
	mark.name="John";
	mark.id=25;
	mark.age=18;
	System.out.println( mark.name + " is "  + mark.age + " years old");
	Teacher  dev = new Teacher();// dev is instanece or object
	
	dev.name="Jay";
	dev.id=25;
	dev.age=40;
System.out.println( dev.name + " is "  + dev.age + " years old");
}
}


