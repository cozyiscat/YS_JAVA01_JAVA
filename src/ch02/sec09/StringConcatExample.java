package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		int intResult = 10 + 2 +8;
		System.out.println(intResult);
		
		String result2 = 10 + 2 + "8";
		System.out.println(result2);
		String result3 = 10 + "2" + 8;
		System.out.println(result3);
		String result4 = "10" + 2 + 8;
		System.out.println(result4);
		String result5 = "10" + (2 + 8);
		System.out.println(result5);
	}
}
