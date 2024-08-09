package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 2.0;
		double z1 = x/y;
		double z2 = x%y;
		
		System.out.println(z1);
		System.out.println(z2);
		
		System.out.println(z1+10);
		System.out.println(z2+10);
		
		if(Double.isInfinite(z1)) {
			System.out.println("정상적인 값이 아닙니다.");
		}else {
			System.out.println(z1+10);			
		}
		
		if(Double.isInfinite(z2)) {
			System.out.println("정상적인 값이 아닙니다.");
		}else {
			System.out.println(z2+10);			
		}
	}

}
