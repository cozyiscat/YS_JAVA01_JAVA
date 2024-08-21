package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		try {
			// abc 라는 문자열을 Integer로 변환 시도
			int value = Integer.parseInt("abc");

			// 숫자가 아닌 것을 숫자로 바꾸려 할 때 Exception 발생
		} catch (NumberFormatException e) {
			System.out.println("예외 발생");
			// 발생한 예외 클래스의 인스턴스에 저장된 메세지를 얻을 수 있음
			System.err.println(e.getMessage());
		}
	}

}
