package javaprograms;
import javax.swing.*;  
public class Simple2 extends JFrame{
JFrame f;  
Simple2(){  
JButton b=new JButton();//create button  
b.setBounds(130,100,100, 40);  
 b.setText("ouch!");
add(b);//adding button on frame  
setSize(400,500);  
setLayout(null);  
setVisible(true); 
b.getText();
}  
public static void main(String[] args) {  
new Simple2();  
}}  