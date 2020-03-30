package a_sample;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;


//-------------has-a방식

public class Test {

	// 멤버변수 선언
	Frame f;
	Button b;
	Label l;
	TextField tf;
	TextArea ta;
	Checkbox cb, cb2;
	List li;
	public Test() {
		// 객체 생성
		f = new Frame("나의 창");
		b = new Button("ok");
		l = new Label("Hello");
		tf = new TextField("이름은 5자 미만입니다",30);
		ta = new TextArea();
		cb = new Checkbox("man");
		cb2 = new Checkbox("woman",true);
		li = new List();
		li.add("Mercury");
		 li.add("Venus");
		 li.add("Earth");
		 li.add("JavaSoft");
		// 붙이기
		// Layout : 붙이는 방식
//		f.setLayout(new FlowLayout());
//		f.setLayout(new GridLayout(4,2));
		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.WEST);
		f.add(l, BorderLayout.EAST);
		f.add(tf, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
			Panel p = new Panel();
			p.setLayout(new GridLayout(2,1));
			p.add(cb);
			p.add(cb2);
		f.add(p,BorderLayout.SOUTH);
		f.add(li);
		// 화면 출력
		f.setSize(500, 400);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		

	}

}
