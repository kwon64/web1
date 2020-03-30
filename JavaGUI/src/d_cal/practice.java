package d_cal;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class practice extends JFrame {
	//멤버 변수
	JButton [] b= new JButton[26];
	
	public practice() {
	//객체 생성
	int num = 65;
	for(int i=0;i<26;i++) {
		if(i+65 == num) {
			char ch = (char)num;
			b[i] = new JButton(String.valueOf(ch));
			
			num++;
		}
	}
	
	
	
	}
	void display() {
	//화면 구성 및 출력
		setLayout(new BorderLayout());
		JPanel p = new JPanel(new GridLayout(2,13));
		for(int i=0;i<26;i++) {
			p.add(b[i]);
		}
		add(p,BorderLayout.CENTER);
		
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		practice t = new practice();
		t.display();

	}

}
