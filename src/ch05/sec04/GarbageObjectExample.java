package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = "여행";
		hobby = null; //여행에 해당하는 String객체를 쓰레기로 만듦
		String temp = "나의 취미: "+hobby;
		System.out.println("temp: "+temp);
		
		String kind1 = "자동차";
		String kind2 = kind1 ; //kind1 변수에 저장되어있는 번지를 kind2변수에 대입
		kind1 = null; //자동차에 해당하는 string 객체는 쓰레기가 아님
		System.out.println("kind1: "+kind1);
		System.out.println("kind2: "+kind2);
	}

}
