package ch05.sec08;

public class ArrayStringExample {
	public static void main(String[] args) {
		String[] strArray = new String[4];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String ("java");
		strArray[3] = strArray[0];
		
//		int iTempo = System.identityHashCode(strArray[0]);
//		System.out.println(iTempo);
//		iTempo = System.identityHashCode(strArray[1]);
//		System.out.println(iTempo);
//		iTempo = System.identityHashCode(strArray[2]);
//		System.out.println(iTempo);
		
//		printArr(strArray);
//		System.out.println("----------------------------");
//		System.out.println(strArray[0] == strArray[1]);
//		System.out.println(strArray[2] == strArray[1]);
//		System.out.println(strArray[2].equals(strArray[1]));
//		System.out.println("----------------------------");
//		strArray[0] = "javaScript";
//		strArray[1] = "c++";
//		printArr(strArray);
//		System.out.println("----------------------------");
		
//		String[] newArray = strArray; //얕은 복사
//		strArray[0] ="c++"; //따라 바뀜

//		String[] newArray = new String[4]; //깊은 복사(수동)
//		for(int i = 0; i<newArray.length; i++) {
//			newArray[i] = strArray[i];
//		}
		String[] newArray = new String[4];
		System.arraycopy(strArray, 0, newArray, 0, 3);
		//순서 : 원본 배열, 원본배열 복사 시작 인덱스, 새배열, 새배열 붙여넣기 시작 인덱스, 복사 항목 수
		printArr(strArray);
		System.out.println("----------------------------");
		printArr(newArray);
	}
	
	public static void printArr(String[] Arr) {
		for(int idx = 0; idx<Arr.length; idx++) {
			int iTempo = System.identityHashCode(Arr[idx]);
			System.out.printf("주소:%d, 값:%s\n",iTempo,Arr[idx]);
		}
	}
}
