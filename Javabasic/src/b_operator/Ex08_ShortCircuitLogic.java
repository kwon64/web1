 package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		// ShortCircuitLogic : 일반논리
		// 하나의 조건으로 전체 조건이 판명되면 나머지 조건을 실행하지 않습니다.
		int a = 3;
		 
		if(a>3 & ++a > 3) {
		System.out.println("조건을 만족");
		}
		System.out.println("A = "+ a );
		
		if(a>1 | ++a > 3) {
			System.out.println("조건만족2");
		}
		System.out.println("A =:"+ a);
	}
}