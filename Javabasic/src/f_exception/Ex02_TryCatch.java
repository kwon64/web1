package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data2.txt");
			System.out.println("파일 연결");
			fis.read();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일없음예외");
		}catch(IOException e) {
			System.out.println("읽을 때 예외발생");
		} catch(Exception e) {
			System.out.println("그 외 예외처리");
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {}
		}
	}

	
}
