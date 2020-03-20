package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_숫자야구 {

	public static void main(String[] args) {
		int []baseball = new int[3];
		int []answer = new int[3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		String temp = input.nextLine();
		StringTokenizer st = new StringTokenizer(temp);
		
		
		int strike=0, ball=0;
		
		
		
//		while{
		
		// 1. 임의의 수를 3개 baseball 배열에 저장
		// 중복수 배제(###)
		for(int i=0;i<baseball.length;i++) {			
				baseball[i] = (int) (Math.random()*10);
				System.out.print(baseball[i]);
		}
		
		// 2. 사용자 입력값 받아서 answer에 저장
		for(int i=0;st.hasMoreTokens();i++) {
			String token = st.nextToken();
			baseball[i] = Integer.parseInt(token);
		}
		
		// 3. 값비교
		for(int i =0; i<3; i++) {
			for(int j =0; j<3; j++) {
				if(baseball[i] == answer[j]) {
					if(i==j) {
						strike++;
					}else
						ball++;
				}
			}
		}
		// 4. strike 와 ball 출력
		System.out.println("스트라이크 : "+ strike + "/ 볼 : "+ball);
		
		
		
		}// while end
		
	
}
