package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		//클래스가 프라이빗이라 컴파일 에러
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();

		Singleton obj1 = Singleton.getInstance();
		obj1.color = "yellow";
		Singleton obj2 = Singleton.getInstance();
		System.out.printf("%s \n",obj2.color);
		System.out.printf("%s \n", System.identityHashCode(obj1));
		System.out.printf("%s \n", System.identityHashCode(obj2));
		Car car = new Car();
		car.func();
		System.out.println(obj1 == obj2);
	}

}
