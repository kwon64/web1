package c_control;

import java.util.Scanner;

public class Temp1 {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		System.out.println("높이 :");
//		int height = input.nextInt();
//		System.out.println("넓이 :");
//		int width = input.nextInt();
		
//		int height = 0;
//		int width = 0;
		
//		for(int i = 1; i<=height*width ;i++) {
//			System.out.print(i+" ");
//			if(i % width == 0) {
//				System.out.println();				
//			}
//		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("n :");
		int num = input.nextInt();
		int n = num;
		
		for(int j = 1; j<=num; j++) {
			System.out.print(j+" ");
			
			for(int i = j; i<=/*num*num*/50 ;i++) {
				
				System.out.print(i+" ");
				
				i += (n-1);
				
				if(i == ((n-1)*num)+num) {
					System.out.println();				
				}
			}
		}
		
		
		
		
		
		
		
		
	}
}