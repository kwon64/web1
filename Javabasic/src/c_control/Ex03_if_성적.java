package c_control;

public class Ex03_if_성적 {

	public static void main(String[] args) {

		// 0. 국,영,수 점수 입력받아서 총점, 평균 출력
		// 1. 평균을 보고 평균에 따라 학점(A~F) 출력
		// *** if문 이용

		int kor = 98, eng = 87, math = 78;
		int total = kor + eng + math;
		double avg = total / 3.0;

		System.out.println("총점: " +  total ); 
		System.out.println("평균: " +  avg ); 

		if(avg >= 90) {
			System.out.println("학점 : A");
		}else if(avg < 90 & avg >= 80) {
			System.out.println("학점 : B");
		}else if(avg < 80 & avg >=70) {
			System.out.println("학점 : C");
		}else if(avg < 70 & avg >=60) {
			System.out.println("학점 : D");
		}else if(avg < 60) {
			System.out.println("학점 : F");
		}
		}

}



