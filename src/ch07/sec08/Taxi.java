package ch07.sec08;

public class Taxi extends Vehicle {
	//재정의 오버라이딩
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
