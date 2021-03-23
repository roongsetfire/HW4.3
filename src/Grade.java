import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		System.out.println("Please enter your score");
		Scanner myObj = new Scanner(System.in);
		
		String score_input = myObj.nextLine();
		int score = Integer.parseInt(score_input);
		switch(score) {
		case 80:
			System.out.println("A");break;
		case 70:
			System.out.println("B");break;
		case 60:
			System.out.println("C");break;
		case 50:
			System.out.println("D");break;
		case 40:
			System.out.println("F");break;
		default:
			System.out.println("E");
		}
//		System.out.println("your grade is "+userName);
	}
}
