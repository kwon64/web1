package temp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class temppp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("테스트 케이스 입력");
		int num = input.nextInt();
		
		int grade[][]= new int[num][];
	      double total[] = new double[num];
	      double ave[] = new double[num];
	      for(int i=0; i<num; i++) {
	         System.out.print("학생 수 입력: ");
	         int student = input.nextInt();
	         input.nextLine();
	         System.out.print("점수 입력: ");
	         String str = input.nextLine();
	         StringTokenizer stt = new StringTokenizer(str);
	         grade[i] = new int[stt.countTokens()];
	         for(int j=0; j<student; j++) {
	            grade[i][j]=Integer.parseInt(stt.nextToken());
	            total[i]+=grade[i][j];
	         }
	         //System.out.println("total = "+total[i]);
	         ave[i]=total[i]/student;
	         System.out.println("ave= "+ave[i]);
	         double smart = 0.0;
	         for(int k=0;k<student; k++) {
	            if(grade[i][k]>ave[i]) {
	               System.out.println(grade[i][k]);
	               smart++;
	            }
	         }
	         double show_me = (double)(smart/student*100);
	         System.out.printf("%d번 케이스의 비율: %f%%\n",i+1,show_me);
	      }

	}

}
