package b_operator;

import java.util.Scanner;

/*
 *  논리연산자의 상태를 먼저 확인
 *  
 *  일반논리 : &&(and)  ||(or)
 */
public class Ex06_GeneralLogical {

	public static void main(String[] args) {
		
//		int 성적 = 75;
//		char 태도 = 'A';
//		
//		// 우등생 : 성적이 80점 이상이거나 태도가 'A' 조건
//		if (성적>=80 || 태도=='A') {
//			System.out.println("우등생");
//		}else {
//			System.out.println("우등생아님");
//		}
//
//		// 성적향상반 : 성적이 80점 이상이고 태도가 'A'조건
//		if (성적>=80 && 태도=='A') {
//			System.out.println("성적향상반"); 
//		}else {
//			System.out.println("성적향상반아님");
//		}
//		
//		65~90대문자
//		97~122소문자
		/*
		 *  [ 문제 1 ]
 			문자를 하나 입력받아서 그 문자가 대문자인지 소문자 인지 출력하기
 		 */
		
		char a;
		Scanner input = new Scanner(System.in);
		System.out.println("문자를 입력하시오");
		a = input.next().charAt(0);
		
		int byte_a = (int) a;
		
		if (byte_a>=65 && byte_a<=90) {
			System.out.println("대문자");
		}else if(byte_a>=97 && byte_a<=122) {
			System.out.println("소문자");
		}else {
			System.out.println("알파벳 아님");
		}
		
		

	}

}
