package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도변경
		myCar.setSpeed(-50);
		System.out.println("현재속도: "+myCar.getSpeed());

		//올바른 속도변경
		myCar.setSpeed(60);
		System.out.println("현재속도: "+myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도: "+myCar.getSpeed());
		
		//		Car car = new Car("파란색");
//		String car_color = car.getColor();
//		System.out.printf("자동차 색상: %s \n",car_color);
//		
//		//getter / setter 게터세터
//		car.setColor("빨강");
//		car_color = car.getColor();
//		System.out.printf("자동차 색상: %s ",car_color);
	}

}
