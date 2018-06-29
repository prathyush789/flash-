import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;		

public class ListExample {

	public static void main(String[] args) {
		
		List<Integer> c = new ArrayList<>();
		Random r = new Random();
	for(int i=1;i<=10;i++) 
	{
		c.add(r.nextInt(50));
	}
	Collections.sort(c);// Only for list not valid for coolection
		
		for(Integer  o : c ) {
			
		
		System.out.println(o);
		

	}

}
}
