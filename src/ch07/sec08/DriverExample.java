package ch07.sec08;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
		Bus bus = new Bus();
		driver.drive(bus);

		//매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}

}
