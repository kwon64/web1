package d_array;

public class Ex06_복습 {

	public static void main(String[] args) {
		
		// 2. 3X4의 char형 배열 ch 를 선언하기
		char [][]ch = new char [3][4];
		
		// 2. 값입력
//		for(char i = 0; i<ch.length;i++) {
//			for(char j = 0; j<ch[i].length; j++) {
//				ch[i][j] = 'z';
//			}
//		}
		
		char temp = 'A';
		for(char i = 0; i<ch.length;i++) {
			for(char j = 0; j<ch[i].length; j++, temp++) {
				ch[i][j] = temp;
				
				}
			}	
		
		// 3. 출력
		for(char i = 0; i<ch.length;i++) {
			for(char j = 0; j<ch[i].length; j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
