package javaprograms;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Buttonex  extends JFrame {

	JFrame frame;
	Buttonex(){
		JButton button=new JButton("click");
		button.setBounds(20,40,200,100);
		JTextField tField=new JTextField(10);
		tField.setBounds(150, 150, 130, 220);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			tField.setText("ouch!");
				
			}
		});
		add(tField);
		add(button);
		setSize(500, 500);
		setVisible(true);
		setLayout(new FlowLayout());
	}
	
	
	
	
	public static void main(String[] args)  {
		new Buttonex();

	}

}
