package d_array;

public class Ex05_lotto {

	public static void main(String[] args) {
		
		
		//랜덤 값
		int []lotto = new int[6];
		for(int j = 0; j<6 ; j++) {
			lotto[j] = (int) (Math.random()*45)+1;
			
		}
		//정렬
		for(int j=lotto.length-1;j>0;j--) {
			for(int i=0;i<j;i++) {
				if(lotto[i]>lotto[i+1]) {
					//swapping
					int temp = 0;
					temp = lotto[i];
					lotto[i] = lotto[i+1];
					lotto[i+1] = temp;
				}
		
			}
		}
		
		//출력
		for(int i=0; i<6;i++) {
			System.out.print(lotto[i]+"/");
		}
	}

}
