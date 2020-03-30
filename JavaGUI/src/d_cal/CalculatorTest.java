package d_cal;

import java.awt.*;
import javax.swing.*;

public class CalculatorTest extends JFrame {
	//1. 멤버변수 선언
	JTextArea ta;
	JButton bequal, bsum, bmul, bdiv, bde;
	JLabel l;
	JButton[] b = new JButton [10];
	
	//2. 객체 생성
	public CalculatorTest() {
		ta = new JTextArea();
		for(int i=0;i<10;i++) {
			b[i] = new JButton(String.valueOf(i)); 
		}

		bequal = new JButton("=");
		bsum = new JButton("+");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bde = new JButton("-");
	}
	//3. 화면 구성 및 출력하기
	public void display() {
		setLayout(new BorderLayout());
		add(ta,BorderLayout.NORTH);
		JPanel p = new JPanel(new GridLayout(5,3));
		
		for(int i=1; i<10; i++) {
			p.add(b[i]);
		}

		p.add(bsum);
		p.add(b[0]);
		p.add(bequal);
		p.add(bde);
		p.add(bmul);
		p.add(bdiv);
		add(p,BorderLayout.CENTER);
		
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		CalculatorTest t = new CalculatorTest();
		t.display();

	}

}
