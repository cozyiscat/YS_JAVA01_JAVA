package ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>(); //TreeSet 똑같이 동작
		
		//객체 추가
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		//객체를 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			//객체를 하나 가져오기
			String element = iterator.next();
			System.out.println(element);
			
			//가져온 객체를 컬렉션에서 제거
			if(element.equals("JSP")) {
				iterator.remove();
			}
			
		}
		System.out.println("----------");
		
		//객체 제거
		set.remove("Spring");
		
		//객체를 하나씩 가져와서 처리
		for(String element : set) {
			System.out.println(element);
		}
	}

}
