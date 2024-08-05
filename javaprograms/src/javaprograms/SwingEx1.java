package javaprograms;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class SwingEx1 {

	public static void main(String[] args) {
		
	Frame frame=new Frame("first frame");
	frame.setVisible(true);
	frame.setSize(500, 400);
	frame.setLayout(new FlowLayout());
	JLabel l1=new JLabel("user name");
	frame.add(l1);
	JTextField t1=new JTextField(10);
	frame.add(t1);
	
	JLabel l2=new JLabel("password");
	frame.add(l2);
	JTextField t2=new JTextField(10);
	frame.add(t2);
	JButton button=new JButton("submit");
	frame.add(button);
	Checkbox bCheckbox=new Checkbox("tick the box", true);
	frame.add(bCheckbox);
	
 
	
	
	
	}

}
