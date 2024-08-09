package ch03.sec01;

public class SingOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		x = -x;
		System.out.println(x);
		
		byte b = 50;
		int y = -b;
		System.out.println("y:"+y);
		System.out.printf("%d\n",x+y);
		System.out.printf("%d\n",x-y);
		System.out.printf("%d\n",x*y);
		System.out.printf("%d\n",x/y);
		System.out.printf("%d\n",x%y);
	}

}
