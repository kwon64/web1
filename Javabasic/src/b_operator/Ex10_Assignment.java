package b_operator;

import java.util.Scanner;

/*
 *  연산자와 대입연산자를 합치기
 *  	- 산술, 이진논리, 쉬프트
 */
public class Ex10_Assignment {

	public static void main(String[] args) {
		
		int  a = 10;
		int  b = 7;

//		a+= b;
//		System.out.println("+= 결과 : " + a ); // 17
//		a-= b;
//		System.out.println("-= 결과 : " + a ); // 10
//		a*= b;
//		System.out.println("*= 결과 : " + a ); // 70
//		a/= b;
//		System.out.println("/= 결과 : " + a ); // 10
//		a%= b;
//		System.out.println("%= 결과 : " + a ); // 3
	
		int ax;
		int ay;
		int az;
		
		Scanner input = new Scanner(System.in);
		System.out.println("x 정수 입력 :");
		ax = input.nextInt();
		System.out.println("y 정수 입력 :");
		ay = input.nextInt();
		System.out.println("z 정수 입력 :");
		az = input.nextInt();
		
		
}
}
