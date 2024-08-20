package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: "+result);
	}
	
	public static void printLength2(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수: "+result);
		} catch(NullPointerException e) {
			System.out.println("예외 발생1: "+e.getMessage());
			System.out.println("---------------------------");

			System.out.println("예외 발생2: "+e.toString());
			System.out.println("---------------------------");
			e.printStackTrace();
			System.out.println("---------------------------");
			
		} finally {
			System.out.println("작업 종료");
			
		}
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		printLength2("안녕하세요");
		printLength2(null);
		System.out.println("프로그램 종료");
	}

}
