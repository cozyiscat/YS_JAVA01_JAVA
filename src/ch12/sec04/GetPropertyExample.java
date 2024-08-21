package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//운영체계 정보
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println("운영체계: "+osName);
		System.out.println("유저네임: "+userName);
		System.out.println("유저홈: "+userHome);
		
		System.out.println("------------------------");
		System.out.println("key: value");
		System.out.println("------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String)objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n",key,value);
		}
		
	}

}
