package b_sample;

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
import javax.swing.*;
// AWT -> Swing

public class Test {

	// 멤버변수 선언
	JFrame f;
	JButton b;
	JLabel l;
	JTextField tf;
	JTextArea ta;
	JCheckBox cb, cb2;
	JList li;
	public Test() {
		// 객체 생성
		f = new JFrame("나의 창");
		b = new JButton("ok");
		l = new JLabel("Hello");
		tf = new JTextField("이름은 5자 미만입니다",30);
		ta = new JTextArea();
		cb = new JCheckBox("man");
		cb2 = new JCheckBox("woman",true);
		
		String[]data = {"Mercury","Venus","Earth","JavaSoft"};
//		li = new jList();

		// 붙이기
		// Layout : 붙이는 방식
//		f.setLayout(new FlowLayout());
//		f.setLayout(new GridLayout(4,2));
		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.WEST);
		f.add(l, BorderLayout.EAST);
		JPanel p2 = new JPanel();
		p2.add(tf);
		p2.add(li);
		
//		f.add(, BorderLayout.NORTH);
		
		f.add(ta, BorderLayout.CENTER);
			JPanel p = new JPanel();
//			p.setLayout(new GridLayout(2,1));
			p.add(cb);
			p.add(cb2);
		f.add(p,BorderLayout.SOUTH);
		f.add(p2,BorderLayout.NORTH);
		f.add(li);
		// 화면 출력
		f.setSize(500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		

	}

}
