package b_operator;

import java.util.Scanner;

// 이진논리 : &(and)  |(or)  ^(xor)


public class Ex07_BinaryLogical {

	public static void main(String[] args) {
//		
//		int a = 15; 1111
//		int b = 10; 1010
//		
//		System.out.println(a & b); // 1010 10
//		System.out.println(a | b); // 1111 15
//		System.out.println(a ^ b); // 0101 5
		
		
		int i = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("년도를 입력하시오");
		i = input.nextInt();
		
		if (i%400==0) {
			System.out.println("윤년");
		}else if(i%100==0){
			System.out.println("평년");
		}else if(i%4==0){
		System.out.println("윤년");
		}else {
			System.out.println("평년");
		}

	}

}
