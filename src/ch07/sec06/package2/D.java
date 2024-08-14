package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
	//생성자 선언
	public D() {
		//A()생성자 호출
		super();
	}
	
	//메소드1
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	//메소드2
//	public void method2() {
//		A a= new A();
//		a.field = "value";
//		a.method();
//	}
}
