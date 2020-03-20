package a_datatype;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
//나이와 키를 입력받아서 출력
		
		Scanner input = new Scanner(System.in);
		System.out.println("나이를 입력하시오 :");
		int old = input.nextInt();
		System.out.println("키를 입력하시오 :");
		double het = input.nextDouble();

//	이름을 입력받으려면??
		System.out.println("이름을 입력하시오 : ");
		input.nextLine();
		String name = input.nextLine();

		System.out.println("나이 :" + old+", 키 : "+ het+", 이름 : "+name);

	}

}
