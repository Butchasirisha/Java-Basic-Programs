package javaprograms;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LabTfBut  extends JFrame implements ActionListener{
 JFrame f;
 JTextField tField,tField1,tf3;
 JButton button,button1;
 JLabel label2;
	public LabTfBut() {
		// TODO Auto-generated constructor stub
		JLabel label=new JLabel("addition");
		label.setBounds(500, 450, 500, 250);
		button=new JButton("+");
		button.setBounds(500, 450, 500, 250);
		JLabel label1=new JLabel("subtraction");
		label1.setBounds(500, 450, 500, 250);
		 button1=new JButton("-");
		button1.setBounds(500, 450, 500, 250);
		 tField=new JTextField(150);
		 tField1=new JTextField(150);
		 tf3=new JTextField(150);
		 tf3.setEditable(false);  
		 JLabel label2=new JLabel();
	    button.addActionListener(this);
	    button1.addActionListener(this);
	    setVisible(true);
	    setSize(100,150);
	    setLayout(new FlowLayout());
	    add(tField1);
	    add(tField);
	    add(tf3);
	    add(button);
	    add(button1);
	    add(label);
	    add(label1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1=tField.getText();
		String s2=tField1.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		if(e.getSource()==button)
		{
		c=a+b;	
		}
		else if(e.getSource()==button1)
		{
			c=a-b;
		}
		String res=String.valueOf(c);
		  tf3.setText(res);  
		
		
	}

	
	
	
	public static void main(String[] args) {
		
new LabTfBut();
	}

	
}
