package c_control;

import java.util.Scanner;

public class Ex04_for중첩 {

	public static void main(String[] args) {

		// *

		//		for(int i = 0; i<6 ; i++) {
		//			for( int j = 0 ; j<i ; j++) {
		//				System.out.print(" ");
		//			}
		//			for(int j = 0 ; j<6-i; j++) {
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}

		//--------------------------------------------
		// A~Z 한줄에 출력
		//		for(int j = 0 ; j <= 25 ; j++ ) {
		//			for(char i = 'A' ; i <='A'-j  ; i++ ) {
		//				System.out.print(i);
		//			}
		//				System.out.println();
		//		}

		//		for(int j = 0 ; j <= 25 ; j++ ) {
		//			for(int i = 0 ; i<j ; i++ ) {
		//			System.out.print(" ");
		//			}
		//		
		//			for(char i = (char) ('A'+j) ; i <='Z' ; i++ ) {
		//				System.out.print(i);
		//			}
		//				System.out.println();
		//		}
		//		Scanner input = new Scanner(System.in);
		//		System.out.println("입력 :");
		//		String str = input.nextLine();
		//		int a_str = str.length();
		//
		//		for( int i = a_str ; i>0 ; i-- ) {
		//			System.out.print(str.charAt(i-1));
		//		}



		//		Scanner input = new Scanner(System.in);
		//		System.out.println("입력 :");
		//		int num = input.nextInt();
		//		
		//		for(int i = 0 ; i<num ; i++ ) {
		//			for(int j = num-1 ; j>i ; j-- ) {
		//				System.out.print(" ");
		//			}
		//			for( int j = 1 ; j<i+2 ; j++ ) {
		//				System.out.print(j);
		//			}
		//			System.out.println();
		//		}

//		Scanner input = new Scanner(System.in);
//		System.out.println("입력 :");
//		int num = input.nextInt();
//		int temp = 0;
//		
//		for(int i = 0 ; i<num ; i++ ) {
//			for(int j = 0 ; j<i+1 ; j++ ) {
//				System.out.print(" ");
//			}
//			for( int j = 0 ; j<num-i ; j++ ) {
//				temp++;
//				System.out.print(temp);
//			}
//			System.out.println(" ");
//		}

//		Scanner input = new Scanner(System.in);
//		System.out.println("높이 :");
//		int height = input.nextInt();
//		System.out.println("넓이 :");
//		int wide = input.nextInt();
//		
//		int temp = 0;
//		
//		for(int j = 1; j<=height ; j++) {
//			for(int i = 1; i<=wide ; i++ ) {
//				temp++;
//			System.out.print(temp);
//			System.out.print(" ");
//			}
//			System.out.println(" ");
//		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("자연수 :");
		int num = input.nextInt();
//		
		int temp = 1;
		
		
		for(int j = 0; j<num; j++) {
			for( int i = 0 ; i<num ;i++) {
					
					System.out.print(temp%10);
					temp+=2;
				}
			System.out.println();
			}
		
		
		
		
	}

}

