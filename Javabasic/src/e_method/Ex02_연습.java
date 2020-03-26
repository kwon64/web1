package e_method;

import java.util.Scanner;

public class Ex02_연습 {
	
//	(문제 1) 영문자를 입력하여 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오.
//	  함수명 : checkLower
//	  인자 : char
//	  리턴(반환) : boolean
	  
//	public static void main(String[] args) {
//		//문자 입력
//		Scanner input = new Scanner(System.in);
//		System.out.println("문자 입력:");
//		char ch = input.next().charAt(0);
//		
//		boolean result = checkLower(ch);
//		
//		// 소문자인지 대문자인지 출력
//		if(result) System.out.println("소문자");
//		else System.out.println("대문자");
//	}
//
//	static boolean checkLower(char ch) {
//		// 넘겨 받은 인자 ch값이 소문자라면 return true;
//		// 그렇지 않으면 return false;
//		if(ch >= 'a' & ch <= 'z') {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
//	(문제 2) 영문자를 입력하여 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오.
//	  함수명 : checkUpper
//	  인자 : char
//	  리턴(반환) : char
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("문자 입력:");
		char ch = input.next().charAt(0);
		
		char result1 = checkUpper(ch);
		System.out.println(result1);
	}
	
	static char checkUpper(char ch){
		int temp = (int)ch;
	
		if(ch >= 'a' & ch <= 'z') {
				ch -= 32;
			return ch;
		}else {
			return ch;
		}
	}
	
	
	
}