package day_10;

import java.util.Scanner;

public class ProblemSolving
{	public static void main(String[] args)
	{
		//1. 0,1,2,3,4,0,1,2,3,4
		
		// 배열 선언
		int myNum [] = new int [10];
		// 10개 배열 선언
			// 반복문 선언과 출력을 동시에!
		for (int i = 0 ; i < myNum.length ; ++i)
		{
			myNum[i] = i%5;
			System.out.printf("%2d",myNum[i]);
		}
		
		//배열
		int[] arPw = new int [5];
		//변수와 함수호출
		Scanner sc = new Scanner(System.in);
		String mainMsg = "번 사물함의 비밀번호 설정 : ";
		String choiceMsg = "이용할 사물함 번호 입력 : ";
		String inputMsg = "비밀번호를 입력하세요 : ";
		String result = null;
		int choice = 0, inputPw = 0;
		System.out.println();
		
		// 반복문
		for(int i = 0; i<arPw.length ; ++i)
		{
			System.out.println(i + 1 + mainMsg);
			arPw[i] = sc.nextInt();
		}
		System.out.println(choiceMsg);
		inputPw = sc.nextInt();
		
		System.out.println(inputMsg);
		inputPw = sc.nextInt();
		
		if(arPw[choice] == inputPw)
		{
			result = "비밀번호 일치합니다.";
		}else
		{
			result = "틀림";
		}
		
		System.out.println(result);
	
	
	
	
	
	}

}
