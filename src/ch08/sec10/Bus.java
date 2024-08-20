package ch08.sec10;

public class Bus implements Vehicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달린다.");
	}
	
	public void checkFare() {
		System.out.println("승차 요금을 체크합니다.");
	}

}
