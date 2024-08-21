package ch12.sec05;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenExample {

	public static void main(String[] args) {
		String data1 = "홍길동 & 이수홍, 박연수";
		String[] arr = data1.split("&|,");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		for(String token : arr) {
			System.out.println(token);
		}
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2,"/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			}
	}
}