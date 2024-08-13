package ch06.sec06;

public class Car {
	String company = "현대";
	String model = "그랜저";
	String color = "검정";
	boolean start;
	int maxSpeed = 350;
	int speed;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//생성자는 리턴형이 없음
	//생성자는 클래스 이름과 동일
	public Car() {
//		System.out.println("이 함수가 생략됬다고하는데 진실인가용");
//		this.company = "기아자동차";
		this("기아자동차",33);
	}
	public Car(String company) {
//		System.out.println("이 함수는 오버로드된 생성자 입니다.");
//		this.company = company; //this = 필드에 있는.. 		
		this("기아자동차",33);
	}
	public Car(int speed) {
//		System.out.println("이 함수는 오버로드된 생성자 입니다.");
//		this.speed = speed; //this = 필드에 있는.. 		
		this("기아자동차",33);
	}
	public Car(String company, int speed) {
		System.out.println("이 함수는 오버로드된 생성자 입니다.");
		this.speed = speed; //this = 필드에 있는.. 		
		this.company = company; //this = 필드에 있는.. 

	}
}
