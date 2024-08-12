package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JuminNum = "011222-3051454";
		char sex = JuminNum.charAt(7);
		System.out.println("성별: "+sex);
		
		char[] juminArr = {'0','1','1','2','2','2','-','3','0','5','1','4','5','4'};
		char sex2 = juminArr[7];
		System.out.println("성별: "+sex2);
		
//		미성년자인지? 경로우대사항인지?
//		지하철 요금 과금 (만 18세 미만 500원, 만 60세이상 0원, 일반인 1000원)
		String juminNum = "111222-1051454"; //문자열
		char szSex = juminNum.charAt(7);
		int iYear = (szSex == '1' || szSex == '2')? 1900:2000; //앞에 1/2 이면 1900년도 사람 아니면 2000년도
		String strYear = ""+juminNum.charAt(0)+juminNum.charAt(1); //juminNum의 앞 두자리 추출 11
		iYear += Integer.parseInt(strYear); //값을 숫자로 바꾼 값 더함
		String strDate = ""+juminNum.charAt(2)+juminNum.charAt(3)+juminNum.charAt(4)+juminNum.charAt(5); //3,4,5,6,번째자리 추출
		int iDate = Integer.parseInt(strDate);			
		
		int today=20240812;	//오늘날짜 - 연월일
		
		double age = (today - (iYear*10000)+iDate)/10000.0; //만을 나눠야 2024 까지 추출됨
		
		if(age < 18) {
			System.out.println("당신은 500원입니다. 나이: "+age);
		} else  if(age > 60) {
			System.out.println("당신은 0원입니다. 나이: "+age);
		} else {
			System.out.println("당신은 1,000원입니다. 나이: "+age);
		}
	}

}
