package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
	ArrayList list = method();
	//여기서 출력
	for(int i=0;i<list.size();i++) {
		Student data = (Student)list.get(i);
		System.out.println(data);
	}

	}
	static ArrayList method() {
		//세명의 학생 정보를 저장 : ArrayList 이용
		Student a = new Student("홍길동", 25);
		Student b = new Student("홍길자", 26);
		Student c = new Student("홍길이", 27);
		
		ArrayList list = new ArrayList();
		list.add(a);
		list.add(b);
		list.add(c);
		
		return list;
	}
}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
