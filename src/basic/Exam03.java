package basic;

public class Exam03
{	//메모장 3번 참고
	//객체를 생성하기 위한 틀, 설계도
	
	public static void main(String[] args)
	{
		 
		//클래스를 만들어서 사용할 때 클래스 자체에 값을 저장해서
		//사용한다면?
		int num1 = 3; 
		int num2 = 6; // 변수에 값 넣은것과 같다.
		
		Student MANG = new Student();
		Student JJAN = new Student();
		
		MANG.java = 50;
		JJAN.java = 50;
		
		System.out.println(MANG.java + JJAN.java);
		
	}

}
