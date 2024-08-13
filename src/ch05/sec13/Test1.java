package ch05.sec13;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------문제1---------");
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		System.out.println(array.length);
		System.out.println(array[2].length);
		System.out.println(array[2][4]);

		System.out.println("---------문제2---------");
		
		int[] array2 = {1,5,3,8,2};
		int sum1 = 0;
		for(int i=0; i<array2.length; i++) {
			sum1 += array2[i];
		}
		System.out.println("총합: "+sum1);
		
		System.out.println("---------문제3---------");
		
		int totalSum1 = 0;
		int totalSum2 = 0;
		for(int n=0; n < array.length; n++) {
			totalSum1 += array[n].length;
			for(int k = 0; k<array[n].length; k++) {
				totalSum2 += array[n][k];				
			}
		}
		double avg = (double) totalSum2/ totalSum1;
		System.out.println("총합: "+totalSum2);
		System.out.println("평균: "+avg);
		
		
	}

}
