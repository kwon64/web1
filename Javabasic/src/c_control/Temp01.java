package c_control;

import java.util.Scanner;

public class Temp01 {

	public static void main(String[] args) {
		
		// 1부터 3까지 출력
		
//		for(int i=1; i<=3; i++) {
//			System.out.print(i);
//		}
		
//		for( int i = 0 ; i<3 ; i++ ) {
//			for( int j = 0 ; j<2 ; j++ ) {
//		
//				System.out.printf("< %d, %d>",i,j);
//				
//			}
//			System.out.println();
//		}

		Scanner input= new Scanner(System.in);
		System.out.println("숫자를 입력: ");
		int num = input.nextInt();
		
		for( int i = 1 ; i<=6 ; i++ ) {
			for( int j = 1 ; j<=6 ; j++ ) {
				if(i+j==num) {
					System.out.printf("%d %d",i,j);
					System.out.println();
				}
			}
			
		}
		
		
		
		
		
	}

}
