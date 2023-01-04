package basic;

public class Exam01 {

	public static void main(String[] args)
	{ //C랑 같다고 봐야하네 구조체또는 클래스 헤더 참조 느낌쓰~
		Student studentName = new Student();
		Student studentName2 = new Student();
		
		studentName.c = 80;
		studentName.grade = "B학점";
		System.out.println(studentName.c);
		System.out.println(studentName.grade);
		
		studentName2.c = 100;
		studentName2.grade = "A+학점";
		System.out.println(studentName2.c);
		System.out.println(studentName2.grade);
	}

}
