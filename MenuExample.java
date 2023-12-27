package java_548;
import java.awt.*;
import java.awt.event.*;
public  class MenuExample extends Frame{
	 MenuExample() {
		Frame f = new Frame("BVRITH College");
		MenuBar mb = new MenuBar();
		Menu m = new Menu("Departments");
		Menu CSE = new Menu("CSE");
		Menu ECE = new Menu("ECE");
		Menu IT = new Menu("IT");
		Menu EEE=new Menu("EEE");
		Menu AIML = new Menu("AIML");
		Menu CSE1=new Menu("CSE1");
		Menu CSE2=new Menu("CSE2");
		Menu CSE3=new Menu("CSE3");
		Menu CSE4=new Menu("CSE4");
		
		Menu ECE1=new Menu("ECE1");
		Menu ECE2=new Menu("ECE2");
		Menu ECE3=new Menu("ECE3");
		Menu ECE4=new Menu("ECE4");
		
		Menu IT1=new Menu("IT1");
		Menu IT2=new Menu("IT2");
		Menu IT3=new Menu("IT3");
		Menu IT4=new Menu("IT4");
		
		MenuItem EEE1=new MenuItem("EEE1");
		MenuItem EEE2=new MenuItem("EEE2");
		MenuItem EEE3=new MenuItem("EEE3");
		MenuItem EEE4=new MenuItem("EEE4");
		
		MenuItem AIML1=new MenuItem("AIML1");
		MenuItem AIML2=new MenuItem("AIML2");
		MenuItem AIML3=new MenuItem("AIML3");
		MenuItem AIML4=new MenuItem("AIML4");
		
		MenuItem CSE_1A=new MenuItem("CSE_A");
		MenuItem CSE_1B=new MenuItem("CSE_B");
		MenuItem CSE_1C=new MenuItem("CSE_C");
		
		MenuItem CSE_2A=new MenuItem("CSE_A");
		MenuItem CSE_2B=new MenuItem("CSE_B");
		MenuItem CSE_2C=new MenuItem("CSE_C");
		
		MenuItem CSE_3A=new MenuItem("CSE_A");
		MenuItem CSE_3B=new MenuItem("CSE_B");
		MenuItem CSE_3C=new MenuItem("CSE_C");
		
		MenuItem CSE_4A=new MenuItem("CSE_A");
		MenuItem CSE_4B=new MenuItem("CSE_B");
		MenuItem CSE_4C=new MenuItem("CSE_C");
		
		MenuItem ECE_A=new MenuItem("ECE_A");
		MenuItem ECE_B=new MenuItem("ECE_B");
		
		MenuItem ECE_1A=new MenuItem("ECE_A");
		MenuItem ECE_1B=new MenuItem("ECE_B");
		
		MenuItem ECE_2A=new MenuItem("ECE_A");
		MenuItem ECE_2B=new MenuItem("ECE_B");
		
		MenuItem ECE_3A=new MenuItem("ECE_A");
		MenuItem ECE_3B=new MenuItem("ECE_B");
		
		MenuItem ECE_4A=new MenuItem("ECE_A");
		MenuItem ECE_4B=new MenuItem("ECE_B");
		
		MenuItem IT_1A=new MenuItem("IT_A");
		MenuItem IT_1B=new MenuItem("IT_B");
		
		MenuItem IT_2A=new MenuItem("IT_A");
		MenuItem IT_2B=new MenuItem("IT_B");
		
		MenuItem IT_3A=new MenuItem("IT_A");
		MenuItem IT_3B=new MenuItem("IT_B");
		
		MenuItem IT_4A=new MenuItem("IT_A");
		MenuItem IT_4B=new MenuItem("IT_B");
		
		CSE1.add(CSE_1A);
		CSE1.add(CSE_1B);
		CSE1.add(CSE_1C);
		
		CSE2.add(CSE_2A);
		CSE2.add(CSE_2B);
		CSE2.add(CSE_2C);
         
		CSE3.add(CSE_3A);
		CSE3.add(CSE_3B);
		CSE3.add(CSE_3C);
		
		CSE4.add(CSE_4A);
		CSE4.add(CSE_4B);
		CSE4.add(CSE_4C);
		
		CSE.add(CSE1);
		CSE.add(CSE2);
		CSE.add(CSE3);
		CSE.add(CSE4);
		
		ECE1.add(ECE_1A);
		ECE1.add(ECE_1B);
		
		ECE2.add(ECE_2A);
		ECE2.add(ECE_2B);
         
		ECE3.add(ECE_3A);
		ECE3.add(ECE_3B);
		
		ECE4.add(ECE_4A);
		ECE4.add(ECE_4B);
		
		ECE.add(ECE1);
		ECE.add(ECE2);
		ECE.add(ECE3);
		ECE.add(ECE4);
		
	    IT1.add(IT_1A);
		IT1.add(IT_1B);
		
		IT2.add(IT_2A);
		IT2.add(IT_2B);
		
		IT3.add(IT_3A);
		IT3.add(IT_3B);
		
		IT4.add(IT_4A);
		IT4.add(IT_4B);
		
		IT.add(IT1);
		IT.add(IT2);
		IT.add(IT3);
		IT.add(IT4);
		
		AIML.add(AIML1);
		AIML.add(AIML2);
		AIML.add(AIML3);
		AIML.add(AIML4);
		
		EEE.add(EEE1);
		EEE.add(EEE2);
		EEE.add(EEE3);
		EEE.add(EEE4);
		
		m.add(CSE);
		m.add(ECE);
		m.add(IT);
		m.add(AIML);
		m.add(EEE);
		
		mb.add(m);
		
		f.setMenuBar(mb);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  

	f.addWindowListener(new WindowAdapter(){
		 public void windowClosing(WindowEvent e) {
			 System.exit(0);
		 }
	 });
	 }
	public static void main(String args[]) {
		new MenuExample();
	}

}
