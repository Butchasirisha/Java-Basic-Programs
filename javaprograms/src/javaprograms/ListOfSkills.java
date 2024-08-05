package javaprograms;


import java.awt.Container;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListOfSkills {

	public static void main(String[] args) {
		
		ListFrame frame = new ListFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class ListFrame extends JFrame implements ListSelectionListener{
	
	JList<String> skills;
	String skill[] = {"Java","Python","Ruby","Scala"};
	
	public ListFrame() {
		skills = new JList<String>(skill);
		Container c = getContentPane();
		c.add(skills);
		skills.addListSelectionListener(this);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		List<String> values = skills.getSelectedValuesList();
		System.out.println(values);
	}
}
