package temp;

import java.lang.reflect.Array;

public class Practice {

	public static void main(String[] args) {

		//문제 : 각 행의 값들의 합이 가장 큰 행을 출력하기

		int a[][]=new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
		int []sum=new int[a.length];
		//합 구하기
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				sum[i] += a[i][j];
				
			}
//			System.out.print(sum[i]+" ");
		}
		
		//가장 큰행 출력
//		int max[];
//		for(int i =0; i<a.length;i++) {
//			if(sum[i]>max) {
//				max[i] = sum[i];
//			}
//		}
//		System.out.print(max[i]);
//		


	}

}
