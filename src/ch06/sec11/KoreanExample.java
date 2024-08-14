package ch06.sec11;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean yjh = new Korean();
		yjh.ssn = "961011-2151564";
		yjh.name = "김지민";
		
		System.out.printf("%s %s %s\n",
				yjh.nation,
				yjh.ssn,
				yjh.name);
		
		yjh.name = "홍지민";
		yjh.ssn = "000200-2222222";

		System.out.printf("%s %s %s\n",
				yjh.nation,
				yjh.ssn,
				yjh.name);
		
	}

}
