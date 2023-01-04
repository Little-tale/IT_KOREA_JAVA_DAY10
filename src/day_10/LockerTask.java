package day_10;

import java.util.Scanner;

public class LockerTask {
// 메소드 정의 : setLockerPw, 매개변수o,리턴값도
	//비밀번호 설정 메소드
	
	//메소드란)
		// checkLockerPw, 매개변수 리턴값도
		// 비밀번호 설정 메소드
	   //메소드 정의 : setLockerPw, 매개변수o, 리턴값o
	   //비밀번호 설정 메소드
	   int[] setLockerPw(int length, Scanner sc) {
	      int[] arPw = new int[length];
	      String mainMsg = "번 사물함의 비밀번호 설정 : ";
	      
	      for(int i = 0; i < arPw.length; i++) {
	         System.out.println(i + 1 + mainMsg);
	         arPw[i] = sc.nextInt();
	      }
	      return arPw;
	   }
	   
	   
	   //메소드정의 : checkLockerPw, 매개변수o, 리턴값o
	   //비밀번호 일치여부 확인 메소드
	   String checkLockerPw(int lockerPw, int inputPw) {
	      String result = null;
	      if(lockerPw == inputPw) {
	         result = "비밀번호가 일치합니다";
	      }else {
	         result = "비밀번호가 일치하지 않습니다";
	      }
	      return result;
	      
	   }
	   
	   
	   public static void main(String[] args) {
	      LockerTask lt = new LockerTask();
	      String result = null;
	      String choiceMsg = "이용할 사물함 번호 입력 : ";
	      String inputMsg = "비밀번호 입력 : ";
	      int choice = 0, inputPw = 0;
	      
	      Scanner sc = new Scanner(System.in);
	      int[] arPw = lt.setLockerPw(3, sc);
	      
	      System.out.println(choiceMsg);
	      choice = sc.nextInt();
	      
	      System.out.println(inputMsg);
	      inputPw = sc.nextInt();
	      
	      result = lt.checkLockerPw(arPw[choice - 1], inputPw);
	      System.out.println(result);

	   }

	}
