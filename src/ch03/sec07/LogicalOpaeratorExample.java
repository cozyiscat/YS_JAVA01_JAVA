package ch03.sec07;

public class LogicalOpaeratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'a';
		
		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자이군요..");
		}
		if( (97<=charCode) & (charCode<=122) ) {
			System.out.println("소문자이군요..");
		}
		if( (48<=charCode) & (charCode<=57) ) {
			System.out.println("0~9 숫자이군요..");
		}
		
		int value = 7;
		if((value%2 == 0) | (value%3 == 0)) {
			System.out.println("2또는 3의 배수인듯");			
		}
		
		boolean result = (value%2 ==0) || (value%3 == 0);
		if (!result) {
			System.out.println("2또는 3의 배수아님");						
		}
	}

}
