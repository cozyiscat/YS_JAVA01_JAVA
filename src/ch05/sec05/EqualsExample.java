package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "홍길동";
		String name2 = "고길동";
		String name3 = "길동";
		String name4 = name1;
		String name5 = ("홍"+name3);
		String name6 = ("홍"+name3);
		
		//각 변수의 해시코드 출력
		System.out.println("name1 hashCode : "+System.identityHashCode(name1));
		System.out.println("name2 hashCode : "+System.identityHashCode(name2));
		System.out.println("name3 hashCode : "+System.identityHashCode(name3));
		System.out.println("name4 hashCode : "+System.identityHashCode(name4));
		System.out.println("name5 hashCode : "+System.identityHashCode(name5));
		System.out.println("name6 hashCode : "+System.identityHashCode(name6));
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals("홍"+name3));
		System.out.println(name1.equals(name4));
		System.out.println(name1 == name2);
		System.out.println(name1 == ("홍"+name3));
		System.out.println(name1 == name5);
		
		//-----------------------------------------------------
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String ("홍길동");
		String strVar4 = new String ("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
