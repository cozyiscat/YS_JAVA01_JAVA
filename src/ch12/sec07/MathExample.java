package ch12.sec07;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//큰 정수 또는 작은 정수 얻기
		double v1 = Math.ceil(5.3);
		double v2 = Math.floor(5.3);
		System.out.println("큰 정수 얻기 v1: "+v1);
		System.out.println("작은 정수 얻기 v2: "+v2);
		
		//큰값 또는 작은값 얻기
		long v3 = Math.max(3,7);
		long v4 = Math.min(3,7);
		System.out.println("큰값 얻기 v3: "+v3);
		System.out.println("작은값 얻기 v4: "+v4);
		
		//소수 이하 두자리 얻기
		double value = 12.3456;
		double temp1 = value*100;
		long temp2 = Math.round(temp1);
		double v5 = temp2 /100.0;
		System.out.println("소수 이하 두자리 얻기 v5: "+v5);
		
	}

}
