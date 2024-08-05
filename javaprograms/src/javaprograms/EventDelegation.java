package javaprograms;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventDelegation {

	public static void main(String[] args) {
		CSEFrames frame = new CSEFrames();
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class CSEFrames extends JFrame implements ActionListener{
	JLabel tfl = null;
	JTextField tf = null;
	JButton b1;
	public CSEFrames() {
		tfl = new JLabel("Enter User Name");
		tf = new JTextField("", 30);
		JButton b1 = new JButton("Get");
		//b1.setBounds(50,50,110,130);
		Container c = getContentPane();
		c.add(tfl);
		c.add(tf);
		c.add(b1);
		
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*if(e.getActionCommand().equalsIgnoreCase("Get")) {
			JOptionPane.showMessageDialog(null, tf.getText().toString());*/
		if(e.getSource()==b1)
		{
		String string=tf.getText();	
		JOptionPane.showMessageDialog(null,string+ "got it!");
		}
		}
		
	}
