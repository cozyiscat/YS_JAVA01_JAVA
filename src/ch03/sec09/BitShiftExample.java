package ch03.sec09;

public class BitShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3);
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
		
		byte num3 = 2;
		int shift = 3;
		byte result5 = (byte)(num3 << shift);
		System.out.printf(" %d << %d = %d\n",num3, shift, result5);
		int num = Integer.parseInt(Integer.toBinaryString(num1 & 0xFF));
		int result = Integer.parseInt(Integer.toBinaryString(result5 & 0xFF));		
		System.out.printf("0b%08d << %d = 0b%08d\n",num, shift, result );
	}

}
