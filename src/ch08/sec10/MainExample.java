package ch08.sec10;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
	
		vehicle.run();
		
//		((Bus)vehicle).checkFare();
		Bus bus = (Bus)vehicle;
		bus.checkFare();
		bus.run();
		
		Vehicle vehicle2 = new Taxi();
		
		Taxi taxi = (Taxi)vehicle2;
		taxi.run();
		taxi.destination();
		
		Vehicle vehicle3 = new Tank();
		
		Tank tank = (Tank)vehicle3;
		tank.run();
		tank.fire();
		
		//taxi 목적지를 정하다
		//tank 대포쏜
	}

}
