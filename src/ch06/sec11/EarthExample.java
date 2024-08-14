package ch06.sec11;

public final class EarthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상수 읽기
		System.out.println("지구의 반지름: "+ Earth.Earth_Radious+"km");
		System.out.println("지구의 표면적: "+ Earth.Earth_Surface_Area+"km^2");
		
		ch06.sec08.Car car08 = new ch06.sec08.Car();
		car08.color = "빨강";
		car08.printItem();
		ch06.sec09.Car car09 = new ch06.sec09.Car();
		car09.color = "RED";
		car09.printItem();
	}

}
