package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 10;
		byte byteValue = (byte)intValue;
		System.out.println(intValue+ "=>"+byteValue);
		
		intValue = 128;
		byteValue = (byte)intValue;
		System.out.println(intValue+ "=>"+byteValue);
		
		intValue = 256;
		byteValue = (byte)intValue;
		System.out.println(intValue+ "=>"+byteValue);
		
		int var1 = 10;
		byte var2 = (byte)var1 ;
		System.out.println(var2); //강제 타입 변환 후 10이 유지
		
		long var3 = 300;
		int var4 = (int)var3 ;
		System.out.println(var4); //강제 타입 변환 후 300이 유지
		
		int var5 = 65;
		char var6 = (char)var5 ;
		System.out.println(var6); //A가 출력
		
		double var7 = 3.14;
		int var8 = (int)var7 ;
		System.out.println(var8); //3이 출력
		
	}

}
