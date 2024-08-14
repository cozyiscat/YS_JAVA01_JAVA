package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllseasonTire;
public class Car {
	public static void main(String[] args) {
		//바퀴 1 2  1/한국스노우 2/한국일반
		//바퀴 3 4  3/금호 전천후 4/금호일반
		SnowTire t1 = new SnowTire();
		ch06.sec12.hankook.Tire t2 = new ch06.sec12.hankook.Tire();
		AllseasonTire t3 = new AllseasonTire();
		ch06.sec12.kumho.Tire t4 = new ch06.sec12.kumho.Tire();
		
		System.out.println("1: "+t1.color);
		System.out.println("2: "+t2.color);
		System.out.println("3: "+t3.color);
		System.out.println("4: "+t4.color);
	}
}