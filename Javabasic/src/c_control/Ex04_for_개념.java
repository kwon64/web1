package c_control;

public class Ex04_for_개념 {

	public static void main(String[] args) {
		
//		for(int i=0; i<5 ; i++ ) {
//			System.out.println("안녕하세요");
//		}
		
		// 1. 1~10까지의 합 구하기
//		int hap = 0;
//		for ( int i=1 ; i<=10 ; i++) {
//			hap += i;
//		}
//		System.out.println("합 ="+ hap); 
		
		// 2. 1 ~ 100까지 홀수의 합과 짝수의 합 구하기
//		int even = 0, odd = 0;
//		for ( int i=1 ; i<=100 ; i++) {
//			// 숫자 i가 홀수라면 odd에 합 구하기
//			// 그렇지 않다면 even 합구하기
//			if(i%2==0) {
//				even += i;				
//			}else {
//				odd += i;
//			}
//		System.out.println("짝수의 합="+ even);
//		System.out.println("홀수의 합="+ odd);
			
//		3. A ~ Z 출력
		for(char ch = 'A';ch<='Z'; ch++ ) {
			System.out.print(ch);
		}
		System.out.println();
		// 4. A~Z 출력 (2개씩 건너뛰기)
		for(char ch = 'A';ch<='Z'; ch+=2 ) {
			System.out.print(ch);
		}
		System.out.println();
		// 5. Z~A 출력
		for(char ch = 'Z'; ch>='A' ; ch-- ) {
			System.out.print(ch);
		}
		
		
		
		
	}

}
