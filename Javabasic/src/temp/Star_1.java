package temp;

import java.util.Scanner;

public class Star_1 {

	public static void main(String[] args) {	
		input();
//		output();
	}
	
	//입력
	static void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("후보 수 :");
		int num1 = input.nextInt();
		System.out.println("유권자 수 :");
		int num2 = input.nextInt();
		
		int []votes = new int[num2];
		for(int i = 0; i<votes.length; i++) {
			System.out.println("투표 번호 :");
			votes[i] = input.nextInt();
			
		}
		makesolution(num1, votes);
	}
	static void makesolution(int num1, int votes[]) {
		int total[]= new int [num1];
		int max = 0;
		for(int i =0; i<num1; i++) {
			for(int j =0; j<votes.length;j++) {
				if((i+1) == votes[j]) {
					total[i] ++;
				}
			} // for j end
			if(total[i]>max) {
				max = total[i];
			}
		}
		
		
	}
}
