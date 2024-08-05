package javaprograms;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Events {
	public static void main(String[] args) {
		EventFrame frame = new EventFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class EventFrame extends JFrame implements ItemListener, ActionListener{
	JLabel l, s;
	JComboBox<String> box, states;
	Map<String, List<String>> statesList;
	Container c = getContentPane();
	JButton bs;
	public EventFrame() {
		statesList = new HashMap<String, List<String>>();
		statesList.put("India", Arrays.asList("Andhra Pradesh","Telangana","Maharastra"));
		statesList.put("US", Arrays.asList("New Jersey","San fransico","Chicago"));
		statesList.put("China", Arrays.asList("Beijing","ABC","DEF"));
		
		bs = new JButton("Get State");
		l = new JLabel("Select Country:");
		s = new JLabel("Select State:");
		box = new JComboBox<String>();
		states = new JComboBox<String>();
		
		box.addItem("India");
		box.addItem("China");
		box.addItem("US");
		
		
		c.add(l);
		c.add(box);
		c.add(s);
		
		box.addItemListener(this);
		bs.addActionListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		states.removeAllItems();
		String item =(String) box.getSelectedItem();
		List<String> st = statesList.get(item);
		
		Iterator<String> itr = st.iterator();
		while(itr.hasNext()) {
			String state = itr.next();
			states.addItem(state);
		}
		c.add(states);
		c.add(bs);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, (String) states.getSelectedItem());
	}
}

