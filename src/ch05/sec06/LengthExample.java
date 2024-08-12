package ch05.sec06;

public class LengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "9506241230123";
		int len = ssn.length();
		System.out.println("문자열 길이 : "+len);

		if(len == 13) {
			System.out.println("주민등록 자릿수가 맞습니다.");
		}else {
			System.out.println("주민등록 자릿수가 다릅니다.");			
		}

		
		String oldStr = "홍길동은 어려서 집을 나왔습니다. 그래서 홍길동은 어렵게 성장했습니다.";
		System.out.println(oldStr);
		//알고보니 홍길동은 홍씨가 아니라 고씨였습니다. 이름은 몰라
		String newStr = oldStr.replace("홍길동은","고몰라는");
		System.out.println(newStr);
		
		//문자열 잘라내기 (substring(시작) substring(시작,끝);
		ssn = "880102-1234567";
		String birthDay = ssn.substring(2,6);
		System.out.println("생일: "+birthDay);
		
		//1988-01-02
		char sex = ssn.charAt(7);
		String date = (sex=='1' || sex =='2')? "19":"20";
		date += ssn.substring(0,2) + "-"+ssn.substring(2,4) + "-"+ssn.substring(2,4);
		System.out.println(date);
		
		//문자열 찾기(indexOf)
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		boolean bool = subject.contains("자바");
		System.out.println(bool);
		
		//
		String date1 = "2024년08월12일 18:45:23";
		String date2 = "2024-08-12 pm 05:11:25";
		String date3 = "24/08/12 am 06:25:13";
		
		calculateDate(date1);
		calculateDate(date2);
		calculateDate(date3);
		//8/12 오후 9시 정각까지 몇시 몇분 몇초 남았는지 구하세요
		//8/12일 오후 9시정각까지 xx시 xx분 xx초가 남았습니다.
		
//		//기준시간
//		int stdHour = 20;
//		int stdMinute = 59;
//		int stdSec = 60;
//		
//		String strDate = date2;
//		int hour = 0;
//		int minute = 0;
//		int sec = 0;
//		if(strDate.contains("pm")) {
//			hour += 12;
//		}
//		int hourIndex = strDate.indexOf(":")-2;
//		String strHour = strDate.substring(hourIndex, hourIndex+2);
//		hour += Integer.parseInt(strHour);
//		System.out.println(hour);
//		String strMinute = strDate.substring(hourIndex+3, hourIndex+5);
//		minute += Integer.parseInt(strMinute);
//		String strSec = strDate.substring(hourIndex+6, hourIndex+8);
//		sec += Integer.parseInt(strSec);
//		System.out.println("8/12 오후 9시 정각까지"+hour+"시"+minute+"분"+sec+"초가 남았습니다.");
//		System.out.printf("8/12 오후 9시 정각까지 %02d시 %02d분 %02d초가 남았습니다.(%02d:%02d:%02d)",
//				stdHour-hour,stdMinute-minute,stdSec-sec,hour,minute,sec);
	}
	public static void calculateDate(String strDate) {
		//기준시간
		int stdHour = 20;
		int stdMinute = 59;
		int stdSec = 60;
		
		
		int hour = 0;
		int minute = 0;
		int sec = 0;
		if(strDate.contains("pm")) {
			hour += 12;
		}
		int hourIndex = strDate.indexOf(":")-2;
		String strHour = strDate.substring(hourIndex, hourIndex+2);
		hour += Integer.parseInt(strHour);
		System.out.println(hour);
		String strMinute = strDate.substring(hourIndex+3, hourIndex+5);
		minute += Integer.parseInt(strMinute);
		String strSec = strDate.substring(hourIndex+6, hourIndex+8);
		sec += Integer.parseInt(strSec);
		System.out.println("8/12 오후 9시 정각까지"+hour+"시"+minute+"분"+sec+"초가 남았습니다.");
		System.out.printf("8/12 오후 9시 정각까지 %02d시 %02d분 %02d초가 남았습니다.(%02d:%02d:%02d)",
				stdHour-hour,stdMinute-minute,stdSec-sec,hour,minute,sec);
	}
	
}
