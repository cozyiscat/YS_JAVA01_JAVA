package ch12.sec11;

import java.lang.reflect.*;

public class ClassExample {

	public static void main(String[] args) {
		// 1
//		Class clazz = Car.class;
		// 2
//		Class clazz = Class.forName("ch12.sec11.Car");
		// 3
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println("패키지: "+ clazz.getPackage().getName());
		System.out.println("클래스 간단이름: "+ clazz.getSimpleName());
		System.out.println("클래스 전체이름: "+ clazz.getName());
		
		//생성자 읽기
		System.out.println("생성자정보 ----------");
		Constructor[] constructors = clazz.getConstructors();
		for(Constructor constructor : constructors) {
			StringBuilder sbr = new StringBuilder();
			String strParams = "";
			Class[] params = constructor.getParameterTypes();
			for(int i = 0; i <params.length; i++ ) {
				if(strParams.length()>0) {
					strParams += ",";
				}
				strParams += params[i].getSimpleName()+" "+params[i].getName();
			}
			System.out.println(constructor.getName()+"( "+strParams+" )");
		}
		
		//필드 읽기
		System.out.println("필드정보 ----------");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName()+" "+field.getName());
		}
		
		//메소드 읽기
		System.out.println("메소드정보 ----------");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName()+"(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.print(")");
		}
	}

	private static void printParameters(Class[] parameters) {
		for(int i = 0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
	}

}
