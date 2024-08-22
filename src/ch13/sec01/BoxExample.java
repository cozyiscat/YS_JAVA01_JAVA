package ch13.sec01;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "연세 IT"; //문자열만
		String strTempo = box1.content;
		
		Box<Integer> box2 = new Box<>();
		box2.content = 123; //숫자만
		int value = box2.content;
	}

}
