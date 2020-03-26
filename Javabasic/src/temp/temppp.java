package temp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class temppp {

	public static void main(String[] args) {
		int []number = new int [10];
		int []div = new int [10];
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("1000이하 자연수 10개 입력");
		for(int i=0;i<10;i++) {
			number[i] = input.nextInt();
		}
		for(int i=0;i<number.length;i++) {
			div[i] = number[i] % 42;
		}
		for(int i=0;i<number.length;i++) {
			int cnt = 0;
			for(int j=i+1;j<number.length;j++) {
				if(div[i]==div[j]) {
					cnt++;
				}
			}
				if(cnt==0) {
					count++;
			}
		}
		System.out.println(count);
	}

}
