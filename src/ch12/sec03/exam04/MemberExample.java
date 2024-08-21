package ch12.sec03.exam04;

public class MemberExample {

	public static void main(String[] args) {
		Member m = new Member("winter","눈송이",25);
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		System.out.println(m.toString());

		Member m1 = new Member("winter","눈송이",25);
		Member m2 = new Member("winter","눈송이",25);
		System.out.println("해시코드m1 : "+m1.hashCode());
		System.out.println("해시코드m2 : "+m1.hashCode());
		
		System.out.println("m1 == m2 : "+(m1==m2));
		System.out.println("m1.equals(m2) : "+m1.equals(m2));
		
	}

}
