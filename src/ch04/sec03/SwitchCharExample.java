package ch04.sec03;
import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점수:");
		String input = scan.nextLine();
		
		int num = Integer.parseInt(input);
		int grade = num /10;
		
		switch(grade) {
		case 10:
		case 9:
		System.out.println("A");
		break;
		case 8:
			System.out.println("B");
		break;
		case 7:
			System.out.println("C");
		break;
		case 6:
			System.out.println("D");
		break;
		default:
			System.out.println("F");
		break;
		}
	}

}
