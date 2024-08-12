package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[]{83,90,87,70};
		int sum1 = sum(scores);
		for(int i =0; i<3;i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 ; "+sum1);
		double avg = (double)sum1/3;
		System.out.println("평균 ; "+avg);
		
		printItem(scores);
	}
	public static int sum(int[] scores) {
		int sum1 = 0;
		for(int i =0; i<scores.length;i++) {
			sum1 += scores[i];
		}
		return sum1;
	}
	public static void printItem(int[] scores) {
		for(int i =0; i<scores.length;i++) {
			System.out.println("scores["+i+"]:"+scores[i]);
		}
	}
}
