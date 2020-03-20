package temp;

import java.util.Scanner;

public class Weekend {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("ox 숫자: ");
		int num = input.nextInt();
		input.nextLine();

		int j = 0;
		while(j<num) {


			System.out.println("정답입력:");
			char [] ch = input.nextLine().toCharArray();


			int score = 0;
			int k = 0;
			for(int i = 1; i<=ch.length;i++) {

				if(ch[i-1]=='o') {
					++k; score += k;
				}else {
					k = 0;
				}

			} //for end
			System.out.println("점수:" +score);

			j++;

		}
	}
}
