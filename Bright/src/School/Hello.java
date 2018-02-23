package School;

import java.util.Scanner;

public class Hello {
	/* My first program */

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a name");
		String user_input=scan.nextLine();
		System.out.println("The entered name is " + user_input);
		
	}

}
