package day_10;

public class MethodTest01
{	
	double getAvg(int[] ar)
	{
		int total = 0;
		for(int i = 0; i<ar.length; ++i)
		{
			total += ar[i];
		}
		return ((double)total) / ar.length;
	}
	
	static boolean login(String userName, int passWord)
	{
		if(userName.equals("admin") && (passWord == 1234))
		{
			return true;
		}		
		return false;
	}
	
	
public static void main(String[] args)
	{ // 5개의 정수 평균값을 반환하는 메소드
		
		int[] ar = {2,2,2,3,2};
	
		MethodTest01 mt = new MethodTest01();
		// 패키치 역참조후 메소드 호출 인듯 하다.
		System.out.println(mt.getAvg(ar));
	
		
		// 아이디 비밀번호 로그인 하기;
		if(mt.login("admin", 1234))
		{
			System.out.println("관리자님 환영합니다.");
			
		}else
		{
			System.out.println("잘못된 정보입니다.");
		}
		
		// return값 있게 매게변수 있게 하세요
		
		// 메소드 login
		
		
		
		
	}	

}
