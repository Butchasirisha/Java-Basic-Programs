package javaprograms;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.invoke.TypeDescriptor.OfField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingEx2 {

	public static void main(String[] args) {
	JFrame frame=new JFrame("button");
	frame.setVisible(true);
	frame.setSize(500, 600);
	frame.setLayout(new FlowLayout());
	JTextField tField=new JTextField(10);
	JButton button=new JButton("submit");
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tField.setText("submitted");
			button.getText();
			
		}
	});
	frame.add(button);
	frame.add(tField);
	}

}
