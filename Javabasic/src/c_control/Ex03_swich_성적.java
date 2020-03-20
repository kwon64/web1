package c_control;

public class Ex03_swich_성적 {

	public static void main(String[] args) {

		// 0. 국,영,수 점수 입력받아서 총점, 평균 출력
		// 1. 평균을 보고 평균에 따라 학점(A~F) 출력
		// *** switch문 이용

		int kor = 98, eng = 87, math = 78;
		int total = kor + eng + math;
		double avg = (total / 3.0);
		//String avgstr = Double.toString(avg);
		String score="";
		//		char a = avgstr.charAt(0);
		int a1 = (int)avg;

		System.out.println("총점: " +  total ); 
		System.out.println("평균: " +  avg ); 


		switch(a1/10) {
		case 10 :;
		case 9 : score = "A"; break;
		case 8 : score = "B"; break;
		case 7 : score = "C"; break;
		case 6 : score = "D"; break;
		default : score = "F"; break;
		}
		System.out.println("성적 :"+ score);



	}

}