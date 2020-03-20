package c_control;

public class Ex02_if_학번 {

	public static void main(String[] args) {

		String id = "2000212000";

		String year = id.substring(0,4);
		String num = id.substring(5,7);
		char uni = id.charAt(4);
		String colleage = "";
		String a = "";

		if(uni == '1') {
			colleage = "공대";
			//				if(num.equals("11")) {
			//					a = "컴퓨터학과";
			//				}
			//				else if(num.equals("12")) {
			//					a = "소프트웨어학과";
			//				}
			//				else if(num.equals("13")) {
			//					a = "모바일학과";
			//				}
			//				else if(num.equals("22")) {
			//					a = "자바학과";
			//				}
			//				else if(num.equals("33")) {
			//					a = "서버학과";
			//				}
			//			}
			switch(num){
			case "11" : a = "컴퓨터학과"; break;
			case "12" : a = "소프트웨어학과"; break;
			case "13" : a = "모바일학과"; break;
			case "22" : a = "자바학과"; break;
			case "33" : a = "서버학과"; break;
			}
		}

		else if(uni =='2') {
			colleage = "사회대";
			//				if(num.equals("11")) {
			//					a = "사회학과";
			//				}else if(num.equals("12")) {
			//					a = "경영학과";
			//				}else if(num.equals("13")) {
			//					a = "경제학과";			
			//				}

			switch(num){
			case "11" : a = "사회학과"; break;
			case "12" : a = "경영학과"; break;
			case "13" : a = "경제학과"; break;
			}
		}

		System.out.println(id+"는"+year+"년도에 입학한 "+colleage+" "+a+" 학생입니다.");
	}
}

