package ch06.sec14;

public class Car {
//	private String color;
//	private String name;
	private int speed;
	private boolean stop;
	
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;			
		}else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}

	//소스 컨스트럭트 쉽게만ㄷ르기
//	public Car(String color, String name) {
//		super();
//		this.color = color;
//		this.name = name;
//	}
//
//	public Car(String color) {
//		super();
//		this.color = color;
//	}

	
//	public Car(String color) {
//		this.color = color;
//	}
	
	//편리한.. 우클릭 소스 > 제너레이터 게터앤세터
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
	
//	public String getColor() {
//		return this.color;
//	}
//	public void setColor(String color) {
//		this.color = color ;
//	}
}
