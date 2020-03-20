package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_성적2 {

	public static void main(String[] args) {
		
		//학생수를 입력받기
		Scanner input = new Scanner(System.in);
		System.out.println("학생수 입력:");
		int student = input.nextInt();
		input.nextLine();
		
		//점수를 저장할 변수를 학생수 만큼 선언
		int score[][] = new int [student][3];
		
		//입력
		for(int i =0; i<score.length; i++) {
			System.out.println((i+1)+ "번째 학생의 점수를 입력하세요 : ");
			String jumsu = input.nextLine();
			StringTokenizer str = new StringTokenizer(jumsu,"/");
			for(int j =0; str.hasMoreTokens() ;j++) {
					score[i][j] = Integer.parseInt(str.nextToken());
				
		}
			
		}
		
		//출력 각 학생 성적의 합과 평균
		for(int i =0; i<score.length; i++) {
			double sum = 0, avg = 0;
			for(int j =0; j<score[i].length;j++) {
				sum += score[i][j];
			}
			avg = sum/score[i].length;
			System.out.print((i+1)+"번째 학생의 총점 "+sum+"이고 평균은 "+avg+" 입니다");
			System.out.println();
		}
			
		// 과목별 합과 평균
		double []sum = new double[3];
		double []avg = new double[3];
		
		for(int i =0; i<score[i].length; i++) {
			for(int j =0; j<score.length;j++) {
				sum[i] += score[j][i];
			}
			avg[i] = sum[i]/score.length;
			System.out.print((i+1)+"번째 과목의 총점 "+sum[i]+"이고 평균은 "+avg[i]+" 입니다");
			System.out.println();
		
		}
			
	}

}
