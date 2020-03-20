package d_array;

public class Ex02_최대값찾기 {

	public static void main(String[] args) {
		
		int []score = {87,45,60,70,91,10,55};
		
		int max = score[0];
		for(int i = 0 ; i < score.length; i++) {
			if(max<score[i]) {
				 max = score[i];
			}
		}
		System.out.println(max);
		
		
	}

}
