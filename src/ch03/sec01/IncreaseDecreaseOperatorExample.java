package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int a = 10;
		int b = 10;
		int z;
		
		System.out.printf("연산 전 x:%d, y:%d\n", x,y);
		System.out.println(++x); //증가 후 출력
		System.out.println(y++); //출력 후 증가
		System.out.printf("최종 x:%d, y:%d\n", x,y);
		
		x=10; y=10;
		
		System.out.printf("연산 전 x:%d, y:%d\n", x,y);
		System.out.println(--x); //감소 후 출력
		System.out.println(y--); //출력 후 감소
		System.out.printf("최종 x:%d, y:%d\n", x,y);
		
		x++;
		++x;
		System.out.println("x =" + x);
	}

}
