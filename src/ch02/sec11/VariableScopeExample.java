package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =15;
		if(a>10) {
			int b = a+1;
		}else {
			int b = a-1;
		}
//		int c = b+1 ;
	}

}
