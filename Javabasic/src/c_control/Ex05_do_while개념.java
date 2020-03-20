package c_control;

import java.util.Scanner;

public class Ex05_do_while개념 {

	public static void main(String[] args) {
		
		String result="";
		do{			
			Scanner input = new Scanner(System.in);
			System.out.println("숫자입력: ");
			int num = input.nextInt();
			
			for(int i = 1;i<10;i++) {
					System.out.printf("%d * %d = %d \n",num,i,i*num);	
				}
			System.out.println("구구단 다시 할까요?");
			result = input.next();
		//	if(result.equals("N")|result.equals("n"))break;
		}while(result.equals("Y")|result.equals("y"));
	}

}