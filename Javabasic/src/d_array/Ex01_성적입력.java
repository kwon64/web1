package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 학생 점수를 입력받아 평균과 총점을 출력
 * 
 * 입력형식 : 80/88/77
 * 출력형식 : 
 * 			총점 : xxxx
 * 			평균 : xxxx
 */

public class Ex01_성적입력 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);	
	System.out.println("점수를 입력하시오");
	String str = input.nextLine();
	StringTokenizer st = new StringTokenizer(str,"/");
//	int num = Integer.parseInt(st);
//	String []score = new String[st.countTokens()];
	
	int []score= new int[3];

	for(int i=0;st.hasMoreTokens();i++) {
		String token = st.nextToken();
		score[i] = Integer.parseInt(token);
	}
	int sum = 0;
	double avg = 0;
	for(int i = 0; i < score.length; i++) {
		sum += score[i];
		avg = sum / score.length;
	}
	System.out.println("총점 : "+ sum);
	System.out.println("평균 : "+ avg);
	}

}
