package java_548;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Flow_Layout extends JFrame {
	JFrame frameObj;    
	Flow_Layout()  
	{    
	   
	    frameObj = new JFrame();    
	        
	    JButton b1 = new JButton("1");    
	    JButton b2 = new JButton("2");    
	    JButton b3 = new JButton("3");    
	    JButton b4 = new JButton("4");    
	    JButton b5 = new JButton("5");  
	    JButton b6 = new JButton("6");    
	    JButton b7 = new JButton("7");    
	    JButton b8 = new JButton("8");    
	    JButton b9 = new JButton("9");    
	    JButton b10 = new JButton("10");    
	    
	              
	    frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);      
	    frameObj.add(b5); frameObj.add(b6);  frameObj.add(b7);  frameObj.add(b8);    
	    frameObj.add(b9);  frameObj.add(b10);      
	       
	    frameObj.setLayout(new FlowLayout());    
	        
	    frameObj.setSize(300, 300);    
	    frameObj.setVisible(true);   
	    frameObj.addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);
			 }
		 });
	}    
	  
	public static void main(String argvs[])   
	{    
	    new Flow_Layout();  
	}    
    
}
