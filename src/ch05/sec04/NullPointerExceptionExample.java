package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[3];
		intArray[0] = 10;
		
		int[] intArr = null;
		if(intArr != null) {
			intArr[0] = 10;
		};
		String str = "홍길동";
		System.out.println("총 문자 수 : "+str.length());
	}

}
