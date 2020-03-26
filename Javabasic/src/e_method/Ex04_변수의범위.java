package e_method;

public class Ex04_변수의범위 {
	// 멤버변수
	static int a,b;
	static int sum;
	
	public static void main(String[] args) {
		int a = 10;
		b = 20;
		add(a);
		System.out.println("합 : "+ sum);
	}
	
	static void add(int a) {
	//입력받은 데이터의 합을 구해서 출력
		sum = a+b;
		
		
	}

}
