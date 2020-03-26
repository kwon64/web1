package e_method;

import java.util.Scanner;

public class Ex00_복습3 {
	
	static int sum=0;
	static double avg=0;

	public static void main(String[] args) {
		int score[] = input();
		calScore(score);
		output();
	}
	//총점, 평균 출력
	static void output() {

		System.out.println("총점:"+sum+"평균:"+avg);
		
	}
	
	//입력받은 국영수 점수로 총점, 평균을 구하기
	static void calScore(int score[]) {
//		int sum=0; 
//		double avg=0;
		for(int i=0; i<score.length;i++) {
			sum += score[i];
		}
		avg = (double)sum/score.length;
	}
	
	//국영수 점수를 입력받기
	static int[] input() {
		Scanner input = new Scanner(System.in);
		int kor=0, eng=0, amth=0;
		int score[]	= new int [3];
		for(int i=0; i<3; i++) {			
		System.out.println("점수 입력 :");
		score[i] = input.nextInt();
		
		}
		System.out.println("국어"+score[0]+"영어"+score[1]+"수학"+score[2]);
		return score;
	}
	
}
