package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println("------------------------");
		char char1 = 'A'; //65
		char char2 = 'B'; //66
		boolean result4 = (char1 <char2);
		System.out.println(result4);
		System.out.println("------------------------");
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 <= num4);
		System.out.println(result5);
		System.out.println("문자열 비교------------------------");
		String str1 = "자바";
		String str2 = "자바";
		boolean result6 = (str1.equals(str2));
		System.out.println(result6);
		boolean result7 = (str1 == str2);
		System.out.println(result7);

	}

}
