package e_method;

import java.util.Scanner;

public class Ex06_exam {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("후보는 몇명?: ");
		int num1 = input.nextInt();
		System.out.print("유권자는 몇명?: ");
		int num2 = input.nextInt();					//후보 및 유권자 수 입력		
		
		
		int [] votes=new int[num2];
		for(int i=0; i<votes.length;i++) {
			votes[i]=(int)((Math.random()*num1)+1);
			System.out.print(votes[i]+" ");
		}
		System.out.println();						// 유권자 수만큼 랜덤한 후보자 투표 생성	
		
		
		int result[]=solution(num1, votes);			// 결과값을 반환받고 당선된 후보자 출력
		for(int i=0; i<result.length;i++) {
			System.out.println(result[i]+"번 후보자 당선");
		}
		System.out.println();
	}							 // main end					
	
	static int[] solution(int N,int[] votes){		// 솔루션 메소드
		int []total = new int[N];
		StringBuffer str= new StringBuffer(" ");
		int max = 0;
		for(int i=0; i<N; i++) {
			for(int j=0;j<votes.length;j++) {
				if((i+1)==votes[j]) {
					total[i]++;
				}
			}//for j end
			if(total[i]>max) {						
				max=total[i];
				str.delete(0, str.length());
				str.append(i+1);
			}
			else if(total[i]==max) {
				str.append(i+1);
			}//if /else if end
		}//for i end
		int result[]=new int[str.length()];
		for(int i=0; i<str.length();i++) {
			result[i]=Character.getNumericValue(str.charAt(i));
		}
		return result;
	}//solution end
}
