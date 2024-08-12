package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		// 순번, 과정, 내용, 강사
		String board = "1,자바학습,참조타입 String을 학습한다.,홍길동";
		String[] tokens = board.split(",");

		//-출력 예제-
		//번호 : 1 
		//제목 : 자바학습
		//내용 : 참조타입 String을 학습한다
		//성명 : 홍길동
		
		//하나씩 만드는법
		System.out.println("번호 : "+tokens[0]);
		System.out.println("제목 : "+tokens[1]);
		System.out.println("내용 : "+tokens[2]);
		System.out.println("성명 : "+tokens[3]);
	
		System.out.println("-------------------------");
		
		//한번에 만드는법
		String[] titles = {"번호","제목","내용","성명"};
		
		for(int i = 0; i<titles.length; i++) {
			System.out.printf("%s : %s\n",titles[i],tokens[i]);
		}
	}

}
