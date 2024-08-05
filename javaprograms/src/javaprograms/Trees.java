package javaprograms;


import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class Trees {

	public static void main(String[] args) {
		Directory frame = new Directory();
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Directory extends JFrame implements TreeSelectionListener{
	DefaultMutableTreeNode root, desktop, cdrive, drive;
	JTree jtree;
	
	public Directory() {
		root = new DefaultMutableTreeNode("Root");
		desktop = new DefaultMutableTreeNode("Desktop");
		cdrive = new DefaultMutableTreeNode("cdrive");
		drive = new DefaultMutableTreeNode("drive");
		
		root.add(desktop);
		root.add(cdrive);
		root.add(drive);
		
		jtree  =new JTree(root);
		
		Container c = getContentPane();
		c.add("West", jtree);
	
		jtree.addTreeSelectionListener(this);
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		
		
	}
}
