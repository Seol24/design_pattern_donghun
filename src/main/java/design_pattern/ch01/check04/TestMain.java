package design_pattern.ch01.check04;

public class TestMain {
	public static void main(String[] args) {
		//현재 학생의 수강신청 목록을 출력해보세요...
		// "Java", "android", "Database", "Html"
		
		Course c1 = new Course("Java");
		Course c2 = new Course("android");
		Course c3 = new Course("Database");
		Course c4 = new Course("Html");
		
		Student sdh = new Student("설동훈");
		sdh.registerCourse(c1);// "SDH의 학생이 수강한 과목은 "Java", "DataBase"
		sdh.registerCourse(c3);
		sdh.registerCourse(c3);
		sdh.dropCourse(c3);
		sdh.registerCourse(c3);
		
		System.out.println(sdh);// "SDH의 학생이 수강한 과목은 "Java", "DataBase"
	}
}
