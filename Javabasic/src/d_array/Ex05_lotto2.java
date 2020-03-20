package d_array;

public class Ex05_lotto2 {

	public static void main(String[] args) {
		
		int [][]lotto = new int[5][6];
		
		for(int i=0;i<5;i++) { // 줄		
			
			
			for(int j = 0; j<6 ; j++) { // 칸
				
				lotto[i][j] = (int) (Math.random()*45)+1;
				
				// 중복제거
				for(int k =0; k<j; k++) {
					if(lotto[i][k]==lotto[i][j]) {
						j--;
					}
				}
			}
		
		// 정렬
			for(int j=lotto[i].length-1;j>0;j--) {
				for(int k=0;k<j;k++) {
					//swapping
					if(lotto[i][k]>lotto[i][k+1]) {
						int temp=0;
						temp = lotto[i][k];
						lotto[i][k] = lotto[i][k+1];
						lotto[i][k+1] = temp;
					}
				}
			}
			
		}
		
		
		//출력
		for(int i=0;i<5;i++) {
			for(int j = 0; j<6 ; j++) {
				System.out.print(lotto[i][j]+"/");
			}
			System.out.println();
		}
		
	}
}
