package c_control;

import java.util.*;

public class Ex01_if_주민번호 {

	public static void main(String[] args) {

		String id = "951013-1234567";
		char sung = id.charAt(7);
		//1 이거나 3이거나 9일 경우 남자
		//2 이거나 4이거나 0일 경우 여자
		if(sung == '1'|sung == '3'|sung == '9') {
			System.out.println("남자");
		}else if(sung == '2'|sung == '4'|sung == '0') {
			System.out.println("여자");
		}
		
		//
		String nai = id.substring(0, 2); // start번째부터 end번째 앞까지
		// 나이 변수에 "95"
		// 문자열을 정수로 변환
		 int nai2 = Integer.parseInt(nai);
		 // nai2 = 95
		 int age = 0;
		 
		 //올해 년도 구하기
		 int year = Calendar.getInstance().get(Calendar.YEAR);
		 
		 if(sung == '1' |sung == '2') {
			 age = year - ( 1900 + nai2) +1;
			 System.out.println("나이:" + age);
		 }else if(sung == '3' |sung == '4') {
			 age = year - ( 2000 + nai2) +1;
			 System.out.println("나이:" + age);
		 }else if(sung == '0' |sung == '9') {
			 age = year - ( 1800 + nai2) +1;
			 System.out.println("나이:" + age);
		 }

		 
	}

}
