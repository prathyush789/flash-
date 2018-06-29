
import java.util.Arrays;
import java.util.List;

public class DemoCollection {

	public static void main(String[] args) {
		
		List<Integer> c = Arrays.asList(1,2,3);
		 
		/*c.add(1);
		c.add(2);
		c.add(13);	*/
		
		/* 
		 {{      Anonymous inner class
		 add(1);
		 add(2);
		 add(3);
		 }};
		 	 */

		for(Integer o : c) {
			
			System.out.println(o);
		}
	}

}
