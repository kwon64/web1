package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_while개념 {

	public static void main(String[] args) {
		
		// 1~10까지의 합을 출력
//		int sum=0;
//		int i = 1;
//		// for( ; i<=10 ; ) {
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
		// 숫자하나 입력받기 -> 구구단 출력
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자입력: ");
//		int num = input.nextInt();
//		
//		int i = 1;
//		while(i<10) {
//				System.out.printf("%d * %d = %d \n",num,i,i*num);
//			i++;
//			}
		
		// 문장을 입력받아 단어로 나눠서 출력
		// "빨리 코로나 끝났으면 좋겠습니다."  (90/80/70/60)
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요");
		String line = input.nextLine();
		StringTokenizer st = new StringTokenizer(line," ");  // 10 20 30 55 66 77 88 99 100 15
		int hol = 0;
		int jja = 0;
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			int su = Integer.parseInt(temp); // String -> int
			if(su%2==1) {
			hol++;
			}
			else if(su%2==0) {
			jja++;
			}
		}
		System.out.println("홀수:"+ hol);
		System.out.println("짝수:"+ jja);
		
		
	}

}