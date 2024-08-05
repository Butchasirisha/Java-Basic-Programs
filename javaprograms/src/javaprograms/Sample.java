package javaprograms;



import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Sample {
	public static void main(String args[]) {
		Home home = new Home();
		home.setSize(500,500);

		home.setVisible(true);
	
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Home extends JFrame {
	 Home() {
		Container c = getContentPane();

		JTabbedPane jtb = new JTabbedPane();
		jtb.addTab("Branches", new Branches());
		jtb.addTab("Courses", new Courses());
		
		c.add(jtb);
	}
}

class Courses extends JPanel{
	Courses(){
		JButton b1 = new JButton("Java");
		JButton b2 = new JButton("Python");
		JButton b3 = new JButton("Ruby");
		
		add(b1);add(b2);add(b3);
	}
}

class Branches extends JPanel{
	Branches(){
		JButton b1 = new JButton("CSE");
		JButton b2 = new JButton("ECE");
		JButton b3 = new JButton("EEE");
		
		add(b1);add(b2);add(b3);
	}
}