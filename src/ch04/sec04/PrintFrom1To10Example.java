package ch04.sec04;

import java.util.Scanner;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("--------구구단--------");
		int n = scan.nextInt();
		
		for(int i =1 ; i<=10; i++) {
			System.out.println(n+ "x" + i + "="+(n*i));
		}
	}

}
