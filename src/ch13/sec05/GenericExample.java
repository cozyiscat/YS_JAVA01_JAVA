package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		//모든사람이 신청 가능
		Course.regCourseAll(new Applicant<Person>(new Person()));
		Course.regCourseAll(new Applicant<Worker>(new Worker()));
		Course.regCourseAll(new Applicant<Student>(new Student()));
		Course.regCourseAll(new Applicant<HighStudent>(new HighStudent()));
		Course.regCourseAll(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();

//		Course.regCourseStudent(new Applicant<Person>(new Person()));
//		Course.regCourseStudent(new Applicant<Worker>(new Worker()));
		Course.regCourseStudent(new Applicant<Student>(new Student()));
		Course.regCourseStudent(new Applicant<HighStudent>(new HighStudent()));
		Course.regCourseStudent(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		Course.regCourseWorker(new Applicant<Person>(new Person()));
		Course.regCourseWorker(new Applicant<Worker>(new Worker()));
//		Course.regCourseWorker(new Applicant<Student>(new Student()));
//		Course.regCourseWorker(new Applicant<HighStudent>(new HighStudent()));
//		Course.regCourseWorker(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
	}

}
