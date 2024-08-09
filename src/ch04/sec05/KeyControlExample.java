package ch04.sec05;
import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1:증속 2:감속 3:중지");
			System.out.println("--------------------------");
			System.out.println("선택 : ");
			
			String strInput = scanner.nextLine();
			if(strInput.equals("1")) {
				speed++;
			}else if(strInput.equals("2")) {
				speed--;
			}else if(strInput.equals("3")){
				run = false;
			}
			System.out.println("현재속도 : " + speed);
		}
		System.out.println("프로그램 종료");
	}

}
