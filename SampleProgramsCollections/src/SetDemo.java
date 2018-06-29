
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> values =new TreeSet<>();// Treeset fetches the results in ascending order
		System.out.println(values.add(25));
		System.out.println(values.add(37));
		System.out.println(values.add(72));// hashset uses an algorithm so that it doesnot fetch values in an order
	
		for(Integer i : values) {
			System.out.println(i);
		}
		
		
		

	}

}
