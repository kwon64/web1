package b_operator;

import java.util.Scanner;

/**
 *  두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

// 나머지 연산자 활용 - 홀/짝수 구하기

public class Ex03_Arithmetic {

	public static void main(String[] args) { 
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("a의 정수를 입력하시오 : ");
//		int a = input.nextInt();
//		System.out.println("b의 정수를 입력하시오 : ");
//		int b = input.nextInt();
////		System.out.println("덧셈 : "+ (a+b));
////		System.out.println("뺄셈 : "+ (a-b));
////		System.out.println("곱셈 : "+ (a*b));
////		System.out.println("나눗셈 : "+ (a/b));
////		System.out.println("나머지 값: " + (a%b));
//		
//		if (a%2==1) {
//			System.out.println("홀수");		
//		}else {
//			System.out.println("짝수");
//		}
//		if (b%2==1) {
//			System.out.println("홀수");		
//		}else {
//			System.out.println("짝수");
//		}
		
		// (1) 정수형 변수 su 선언
		int su;
		// (2) Scanner 선언
		Scanner input = new Scanner(System.in);
		// (3) 화면에 "정수를 입력하세요" 출력
		System.out.println("정수를 입력하세요");
		// (4) 입력받은 정수를 su 변수에 저장
		su = input.nextInt();
		// (5) 입력받은 수가 홀/짝수 구하기
		if (su%2==0) {
			System.out.println("짝수");		
		}else {
			System.out.println("홀수");
		}
		
		// (6) 입력받은 수가 3의 배수인지 아닌지 확인
		if (su%3==0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수가 아님");
		}
		
		int i=0;
		if (i%400==0) {
			System.out.println("윤년");
		}else if (i%100==0){
				System.out.println("평년");
		}else if(i%4==0) {
				System.out.println("윤년");
		}
		
		
	}

}
