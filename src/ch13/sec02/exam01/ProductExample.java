package ch13.sec02.exam01;

public class ProductExample {

	public static void main(String[] args) {
		Product<Car,String> car1 = new Product<>();
		car1.setKind(new Car());
		car1.setModel("그랜저");
		System.out.printf("%s가", car1.getModel(),car1.getKind());
		car1.getKind().run();

		Product<Tv,String> tv1 = new Product<>();
		tv1.setKind(new Tv());
		tv1.setModel("스마트 Tv");
		
		Tv tv = tv1.getKind();
		String tvModel = tv1.getModel();
		
		System.out.printf("%s를", tvModel);
		tv.turnOn();
		
		
	}

}
