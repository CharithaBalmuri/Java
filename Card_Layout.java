package java_548;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Card_Layout extends JFrame implements ActionListener {
	CardLayout crd;     
	JButton btn1, btn2, btn3,btn4 , btn5,btn6,btn7;    
	Container cPane;     
	Card_Layout()  
	{    
	  
	cPane = getContentPane();    
	crd = new CardLayout();    
	  
	cPane.setLayout(crd);    
	
	btn1 = new JButton("Sunday");    
	btn2 = new JButton("Monday");    
	btn3 = new JButton("Tuesday");   
	btn4 = new JButton("Wednesday");
	btn5 = new JButton("Thursday");
	btn6 = new JButton("Friday");
	btn7 = new JButton("Saturday");
	   
	btn1.addActionListener(this);    
	btn2.addActionListener(this);    
	btn3.addActionListener(this); 
	btn4.addActionListener(this);
	btn5.addActionListener(this);
	btn6.addActionListener(this);
	btn7.addActionListener(this);
	
	  
	cPane.add("a", btn1);   
	cPane.add("b", btn2); 
	cPane.add("c", btn3);
	cPane.add("d", btn4);
	cPane.add("e", btn5);
	cPane.add("f", btn6);
	cPane.add("g", btn7);
	            
	}    
	public void actionPerformed(ActionEvent e)   
	{    

	crd.next(cPane);    
	}    
	   
	public static void main(String argvs[])   
	{     
	
	Card_Layout crdl = new Card_Layout();   
	       
	crdl.setSize(300, 300);    
	crdl.setVisible(true);    
	crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);    
	}    

}
