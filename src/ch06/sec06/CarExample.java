package ch06.sec06;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		System.out.println("제작 회사명1: "+myCar.company+"/ 속도: "+myCar.speed+"/ 색상: "+myCar.color);
		myCar.setColor("파란색");
		System.out.println("제작 회사명1: "+myCar.company+"/ 속도: "+myCar.speed+"/ 색상: "+myCar.color);
		Car myCar2 = new Car("삼성자동차");
		System.out.println("제작 회사명2: "+myCar2.company+"/ 속도: "+myCar2.speed);
		Car myCar3 = new Car(120);
		System.out.println("제작 회사명3: "+myCar3.company+"/ 속도: "+myCar3.speed);
		Car myCar4 = new Car("KGM",120);
		System.out.println("제작 회사명4: "+myCar4.company+"/ 속도: "+myCar4.speed);

		//car 객체의 필드값 읽기
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("시동여부: "+myCar.start);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed);
		
		myCar.speed = 60;
		myCar.model = "그랜다이저";
		System.out.println("수정된 모델명: "+myCar.model);
		System.out.println("수정된 현재속도: "+myCar.speed);
	}

}
