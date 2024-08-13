package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car myCar1 = new Car();
		System.out.println("제작 회사명1: "+myCar1.company);
		Car myCar2 = new Car("자가용");
		System.out.println("제작 회사명2: "+myCar2.company+"/ 모델2: "+myCar2.model);
		Car myCar3 = new Car("자가용","빨강");
		System.out.println("제작 회사명3: "+myCar3.company+"/ 모델3: "+myCar3.model+"/ 색깔3: "+myCar3.color);
		Car myCar4 = new Car("택시","검정",200);
		System.out.println("제작 회사명4: "+myCar4.company+"/ 모델4: "+myCar4.model+"/ 색깔4: "+myCar4.color+"/ 최대속도: "+myCar4.maxSpeed);
	}

}
