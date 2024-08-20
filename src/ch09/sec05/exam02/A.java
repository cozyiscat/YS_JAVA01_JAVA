package ch09.sec05.exam02;

public class A {
	//바깥클래스 인스턴스 필드
	String field = "A-field";
	
	//A 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	//바깥 클래스 정적 멤버
	static String staticField = "A-정적field";
	//A 인스턴스 메소드
	static void staticMethod() {
		System.out.println("A-정적method 실행 =>"+staticField);
	}
	
	//인스턴스 멤버 클래스
	class B{
		//B 인스턴스 필드
		String field = "B-field";
		//B 인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}
		//B 인스턴스 메소드
		void print() {
			//B 객체의 필드와 메소드 사용 (클래스 안)
			System.out.println(this.field);
			this.method();
			
			//A 객체의 필드와 메소드 사용 (바깥 메소드)
			System.out.println(A.this.field);
			A.this.method();
		}
	}
	
	//A의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
	
	static class C{
		void method2() {
			staticField = "A정적필드 변경";
			staticMethod();
		}
	}
}

