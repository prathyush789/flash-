package School;

public class SwitchCase {
	public static void main(String[] args) {
		int score =90;
		switch(score)
		{
		case 90:
			System.out.println("very good");
			break;
		case 70:
			System.out.println("good");
			break;
		case 45:
			System.out.println("poor");
			break;
		default:
			System.out.println("grade is not defined");
		}
	}
}
