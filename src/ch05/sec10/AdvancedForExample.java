package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 변수 선언과 배열 생성
		int[] scores = {95,71,84,93,87};
		//배열 항목 전체 합 구하기
		int sum = 0;
		for(int score : scores) {
			sum = sum+score;
		}
		//5개의 항목이 한번씩 score 변수에 저장되고 sum에 누적됨(5회 반복)
		System.out.println("점수 종합 = "+sum);
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = "+avg);
	}

}
