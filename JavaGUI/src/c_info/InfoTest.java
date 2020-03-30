package c_info;

import javax.swing.*;
import java.awt.*;
public class InfoTest extends JFrame {
	//1.멤버변수 선언
//	JFrame f;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bCancel, bDelete, bExit;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JLabel l;
	InfoTest(){
		//2.객체 생성
//		f = new JFrame("창");
		ta = new JTextArea();
		bAdd = new JButton("dd", new ImageIcon("src/c_info/imgs/cat1.PNG"));
		bAdd.setVerticalTextPosition(JButton.BOTTOM);
		bAdd.setHorizontalTextPosition(JButton.CENTER);
		bAdd.setRolloverIcon(new ImageIcon("src/c_info/imgs/cat2.PNG"));
		bAdd.setToolTipText("하나난나ㅏㄴ나");
		bAdd.setMnemonic('i');// alt+i
		
		bShow = new JButton("Show", new ImageIcon("src/c_info/imgs/cat2.PNG"));
		bShow.setVerticalTextPosition(JButton.BOTTOM);
		bShow.setHorizontalTextPosition(JButton.CENTER);
		bShow.setRolloverIcon(new ImageIcon("src/c_info/imgs/cat1.PNG"));
		bSearch = new JButton("Search",new ImageIcon("src/c_info/imgs/cat3.PNG"));
		bSearch.setVerticalTextPosition(JButton.BOTTOM);
		bSearch.setHorizontalTextPosition(JButton.CENTER);
		bCancel = new JButton("Cancel",new ImageIcon("src/c_info/imgs/cat4.PNG"));
		bCancel.setVerticalTextPosition(JButton.BOTTOM);
		bCancel.setHorizontalTextPosition(JButton.CENTER);
		bDelete = new JButton("Delete", new ImageIcon("src/c_info/imgs/food1.PNG"));
		bDelete.setVerticalTextPosition(JButton.BOTTOM);
		bDelete.setHorizontalTextPosition(JButton.CENTER);
		bExit = new JButton("Exit", new ImageIcon("src/c_info/imgs/food2.PNG"));
		bExit.setVerticalTextPosition(JButton.BOTTOM);
		bExit.setHorizontalTextPosition(JButton.CENTER);
		tfName = new JTextField();
		tfId = new JTextField();
		tfTel = new JTextField();
		tfSex = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();
		
	}
	
	void display() {
		//3.화면 구성 및 출력

		setLayout(new BorderLayout());
		add(ta, BorderLayout.CENTER);
		JPanel p = new JPanel(new GridLayout(1,6));
		JPanel p2 = new JPanel(new GridLayout(6,2));
		
		p.add(bAdd);
		p.add(bShow);
		p.add(bSearch);
		p.add(bCancel);
		p.add(bDelete);
		p.add(bExit);
		p2.add(new JLabel("name", new ImageIcon("src/c_info/imgs/food2.PNG"),JLabel.CENTER));
		p2.add(tfName);
		p2.add(new JLabel("Id", new ImageIcon("src/c_info/imgs/food2.PNG"),JLabel.CENTER));
		p2.add(tfId);
		p2.add(new JLabel("Tel", new ImageIcon("src/c_info/imgs/food2.PNG"),JLabel.CENTER));
		p2.add(tfTel);
		p2.add(new JLabel("Sex", new ImageIcon("src/c_info/imgs/food2.PNG"),JLabel.CENTER));
		p2.add(tfSex);
		p2.add(new JLabel("Age", new ImageIcon("src/c_info/imgs/food2.PNG"),JLabel.CENTER));
		p2.add(tfAge);
		p2.add(new JLabel("Home", new ImageIcon("src/c_info/imgs/food2.PNG"),JLabel.CENTER));
		p2.add(tfHome);
		add(p,BorderLayout.SOUTH);
		add(p2,BorderLayout.WEST);
		
		
		
		setLocation(200,200);
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		InfoTest t = new InfoTest();
		t.display();

	}

}
