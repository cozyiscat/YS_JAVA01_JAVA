package ch12.sec10;
import java.util.regex.Pattern;


public class PatternExample {

	public static void main(String[] args) {
		//String regExp = "(02|010)-\\d{3,4}-\\d{4}";
	    String regExp = "(010-\\d{4}|011|016|017|019-\\d{3})-\\d{4}";
		String data = "010-1234-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치");
		} else {
			System.out.println("정규식과 불일치");
		}
	}

}
