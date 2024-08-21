package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sbr = new StringBuilder();
		sbr.append("DEF");
		System.out.println(sbr.toString());
		sbr.insert(1,"ABC");
		System.out.println(sbr.toString());
		sbr.delete(3,4);//3~4까지 (3이상 4미만)
		System.out.println(sbr.toString());
		
	}

}
