package ch06.sec07.exam04;

public class Car {
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
			
		//생성자는 리턴형이 없음
		//생성자는 클래스 이름과 동일
		Car() {}
		Car(String model) {
			this.model = model; //this = 필드에 있는.. 		
		}
		Car(String model, String color) {
			this.model = model;
			this.color = color;
		}
		Car(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
	}