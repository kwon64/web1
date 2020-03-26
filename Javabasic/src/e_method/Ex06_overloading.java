package e_method;

	//	오버로딩(overloading)
//		- 인자의 자료형과 갯수가 다른 동일한 함수들
//		- 리턴형만 다른 함수는 오버로딩이 아닙니다.
public class Ex06_overloading {

	public static void main(String[] args) {
		// 각각의 자료형의 변수의 값에 "화이팅!!!" 더하여 출력
		String str = new String("홍길순");
		StringBuffer sb = new StringBuffer("홍길자");
		char[]ch = new char[] {'홍','길','이'};
		
		fighting(str);
		fighting(sb);
		fighting(ch);
	}
	static void fighting(char[]ch) {
		String stt=new String();
		for(int i =0; i<ch.length;i++) {
			stt += ch[i];
		}
		System.out.println(stt+"화이팅!!!");
	}
	static void fighting(StringBuffer s) {
		System.out.println(s.append("화이팅!!!"));
	}
	
	static void fighting(String s) {
		System.out.println(s+"화이팅!!!");
	}

}
