package javaprograms;

import java.awt.Container;
import java.awt.Frame;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.text.AbstractDocument.Content;

public class Ex1 {
	
	public static void main(String[] args) {
		C1 frame=new C1();
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setBounds(50, 100, 300, 150);
		
	}
	

}
class  C1 extends Frame{
	JComboBox<String> country,states;
	Map<String, List<String>> stateMap;
	JButton button;
	JLabel jLabel,jLabel2;
		Container container=getContentPane();

	public C1() {
		stateMap=new HashMap<String, List<String>>();
		stateMap.put("india",Arrays.asList("ap","tn","ts"));
		stateMap.put("america",Arrays.asList("1","2","3"));
		stateMap.put("french",Arrays.asList("a","b","c"));
		button=new JButton("successful");
		jLabel=new JLabel("country");
		jLabel=new JLabel("states");
		country=new JComboBox<String>();
		states=new JComboBox<String>();
		country.addItem("india");
		country.addItem("america");
		country.addItem("french");
		container.add(button);
		container.add(jLabel);
		container.add(jLabel2);
		container.add(country);
		
		
	}
	
}