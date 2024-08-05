package javaprograms;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lendi extends JFrame{
	Lendi frame;
public static void main(String[] args) {
		
new Lendi();
}

	public Lendi() {
		
		Lendi frame = new Lendi();
		setSize(500, 500);
		setTitle("Lendi Home Page");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		Container c = this.getContentPane();
		Font font = new Font("Arial",Font.BOLD, 50);
		Color color = Color.BLUE;
		
		JLabel message = new JLabel("Welcome to Lendi");
		message.setFont(font);
		message.setForeground(color);
		c.add(message);
	}

}

