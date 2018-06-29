import java.util.Random;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		Random r = new Random();
		for(int i=0;i<5;i++) {
			nums[i] = r.nextInt(100);
		}
			for(int n: nums ) {
				System.out.println(n);
		}
		

	}

}
