package c_control;

public class Ex01_switch_주민번호 {

	public static void main(String[] args) {
		
		String id = "951013-1534567";
		char chul = id.charAt(8);
		String home = "";
		
		switch(chul) {
		case '0' : home = "서울"; break;
		case '1' : home = "인천/부산"; break;
		case '2' : home = "경기도"; break;
		default : home = "대한민국"; break;
		}
		System.out.println("출신지 : "+ home);
		
	}		
}


