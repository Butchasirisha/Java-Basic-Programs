package javaprograms;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Tabs {

	public static void main(String[] args) {
		
		College college = new College();
		college.setSize(300, 300);
		college.setVisible(true);
		college.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class College extends JFrame {
	public College() {
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Student", new StudentPanel());
		jtp.addTab("Faculty", new FacultyPanel());
		jtp.addTab("Library", new LibraryPanel());
		
		Container c = getContentPane();
		c.add(jtp);
		
	}
}

class StudentPanel extends JPanel implements ActionListener{
	JProgressBar jbp = new JProgressBar();
	public StudentPanel() {
		JButton jb = new JButton("Enter");
		JTextArea jta =new JTextArea(20,20);
		JSplitPane jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jta, jb);
		add(jsp);
		add(jbp);
		jb.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JProgressBar jbp = new JProgressBar(JProgressBar.HORIZONTAL, 10, 100);
		jbp.setValue(30);
	}
}


class FacultyPanel extends JPanel {
	public FacultyPanel() {
		JLabel l = new JLabel("Faculty");
		add(l);
	}
}


class LibraryPanel extends JPanel {
	public LibraryPanel() {
		JLabel l = new JLabel("Library");
		add(l);
	}
}
