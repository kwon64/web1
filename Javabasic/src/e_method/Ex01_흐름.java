package e_method;

public class Ex01_흐름 {

	static void method() {
		System.out.println("method 실행");
	}
	
	public static void main(String[] args) {
		System.out.println("main 시작");
		method();
		System.out.println("main 끝");
	}

	
}
/*명명 규칙
	1. 문자 + 숫자 + _ + $ 조합
	2. 길이제한 없음
	3. 첫글자에 숫자만 아니면 됨
	4. 대소문자 구별
	5. 예약어(keyword)는 안됨
	
권장사항
	- 클래스명의 첫글자는 대문자 시작
	- 변수와 메소드명의 첫글자는 소문자
	- 라벨명은 전부 대문자
	- 패캐지명은 전부 소문자
*/