package c_control;

import java.util.Scanner;

public class Ex04_for연습 {

	public static void main(String[] args) {

		//		Scanner input = new Scanner(System.in);
		//		System.out.println("숫자를 입력: ");
		//		int num = input.nextInt();
		//		
		//		for( int i=1 ; i<=num ; i++ ) {
		//			System.out.print(i);
		//			if(i%5==0) {
		//				System.out.println();
		//			}
		//		}
		
		// 2번 문제
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("알파벳를 입력: ");
//		String app = input.next();
//		char apb = app.charAt(0);
//
//
//		if(apb >= 97 & apb <= 122 ) {
//			for(char i = 97 ; i <= apb ; i++ ) {
//				System.out.print(i);
//			}
//		}
//
//		else if(apb >= 65 & apb <= 90 ) {
//			for(char i = apb ; i <= 90 ; i++ ) {
//				System.out.print(i);
//			}
//
//		}
		
		// 3번 문제
		
		Scanner input1 =new Scanner(System.in);
		System.out.println("문자열을 입력해 주세요");
		String line="";//입력받은 문자열 저장 변수
		line=input1.nextLine();//입력 받음
		int l_line= line.length();//문자열의 길이 입력 변수

		for(int j=l_line;j>0;j--) {
		System.out.print(line.charAt(j-1));
		}
		
		




	}

}

