package ch12.sec05;

public class ValueCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//-128~127 초과할 경우
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		//-128 ~ 127 범위값일 경우
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
	}

}
