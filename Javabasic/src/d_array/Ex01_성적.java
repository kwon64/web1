package d_array;

public class Ex01_성적 {

	public static void main(String[] args) {
		
//		int [] kor;
//		kor = new int[5];
		
//		int [] kor = new int[5];
//		kor[0] = 90;
//		kor[1] = 88;
//		kor[2] = 89;
//		kor[3] = 70;
//		kor[4] = 77;
		// kor[5] = 99;
		
		//배열 초기화
		// int []kor = new int[] {90, 88, 89, 70, 77};
		int []kor = {90, 88, 89, 70, 77};
		
		int total = 0;
		int avg = 0;
		for(int i = 0 ; i < kor.length ; i++) {
			// 총점구하기
			total += kor[i];
			avg = total / kor.length;
		}
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ avg);
		
		
	}

}
