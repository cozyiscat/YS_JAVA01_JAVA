package ch06.sec15;

public class Car {
	public void func(){
	Singleton obj3 = Singleton.getInstance();
	
	System.out.printf("obj3 => %s\n",obj3.color);
	}
}