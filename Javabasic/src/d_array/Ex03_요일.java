package d_array;

import java.util.Calendar;

public class Ex03_요일 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DATE);
		
		System.out.println(y+"년 "+(m+1)+"월 "+d+"일");
		
		//시분초 출력
		int hour =  cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		 System.out.println(hour+"시 "+minute+"분 "+second+"초");
		 
		 // 요일 일요일(1)~토요일(7)
		 String []yoil = {"일","월","화","수","목","금","토"};
		 System.out.println(yoil[cal.get(Calendar.DAY_OF_WEEK)-1]+"요일");
		 
		 
		 
		 
	}
}
