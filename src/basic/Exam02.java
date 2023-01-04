package basic;

public class Exam02
{
	public static void main(String[] args)
	{
		Student Yuri = new Student();
		Student HunE = new Student();
		
		Yuri.c = 40;
		Yuri.java = 75;
		Yuri.python = 60;
		
		HunE.c = 20;
		HunE.java = 40;
		HunE.python = 100;
		
		System.out.println("유리의 점수 총합은 "+ Yuri.getTotal()+"입니다.");
		System.out.println("훈이의 점수 총합은 "+ HunE.getTotal()+"입니다.");
		
		//총 합을 구해주는 메소드

	}

}
