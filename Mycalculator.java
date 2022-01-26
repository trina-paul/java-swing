package calculator;
 import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event. ActionEvent;
import java.awt.event .ActionEvent;
public class Mycalculator extends JFrame implements ActionListener {
	JFrame f;
	double a = 0,b=0;
	int flag = 0 ;
	JPanel panel1,panel2,panel3;
	JTextField txt;
	JButton bt1, bt2, bt3, bt4, 
	bt5,bt6,bt7,bt8,bt9,bt0,btDot,btEqual,btClr,btAdd,btSub,btMulti,btDivision ;
	
	public Mycalculator(){
		setSize(500,600);
		
		setLayout(null);
	setTitle("Calculator");
		setLocationRelativeTo(null);
		
		Font font = new Font("Arial",Font.BOLD,18);
		
		panel1 = new JPanel();
		panel1.setBounds(0,0,500,80);
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(null);
		
		add(panel1);
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4,3,4,5));
		panel2.setBounds(5,80,300,470);
		
		panel2.setBackground(Color.BLACK);
		
		add(panel2);
		
		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(5,1,3,3));
		panel3.setBounds(300,80,200,470);
		panel3.setBackground(Color.BLACK);
		
		add(panel3);
		
		txt = new JTextField("");
		txt.setText(null);
		txt.setBounds(5,5,475,70);
		txt.setFont(font);
		panel1.add(txt);
		
		
		bt1 = new JButton("1");bt1.setFont(font);panel2.add(bt1);bt1.addActionListener(this);
		bt2 = new JButton("2");bt2.setFont(font);panel2.add(bt2);bt2.addActionListener(this);
		bt3 = new JButton("3");bt3.setFont(font);panel2.add(bt3);bt3.addActionListener(this);
		bt4 = new JButton("4");bt4.setFont(font);panel2.add(bt4);bt4.addActionListener(this);
		bt5 = new JButton("5");bt5.setFont(font);panel2.add(bt5);bt5.addActionListener(this);
		bt6 = new JButton("6");bt6.setFont(font);panel2.add(bt6);bt6.addActionListener(this);
		bt7 = new JButton("7");bt7.setFont(font);panel2.add(bt7);bt7.addActionListener(this);
		bt8 = new JButton("8");bt8.setFont(font);panel2.add(bt8);bt8.addActionListener(this);
		bt9 = new JButton("9");bt9.setFont(font);panel2.add(bt9);bt9.addActionListener(this);
		bt0 = new JButton("0");bt0.setFont(font);panel2.add(bt0);bt0.addActionListener(this);
		btDot = new JButton(".");btDot.setFont(font);panel2.add(btDot);btDot.addActionListener(this);
		btEqual = new JButton("=");btEqual.setFont(font);panel2.add(btEqual);btEqual.addActionListener(this);
		btAdd = new JButton("+");btAdd.setFont(font);panel3.add(btAdd);btAdd.addActionListener(this);
		btSub = new JButton("-");btSub.setFont(font);panel3.add(btSub);btSub.addActionListener(this);
		btMulti = new JButton("*");btMulti.setFont(font);panel3.add(btMulti);btMulti.addActionListener(this);
		btDivision = new JButton("/");btDivision.setFont(font);panel3.add(btDivision);btDivision.addActionListener(this);
		btClr = new JButton("C");btClr.setFont(font);panel3.add(btClr);btClr.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true) ; }
		
		@Override
		public void actionPerformed(ActionEvent e) {
				
		  
		if(e.getSource()==bt1)
      
           {
        	txt.setText(txt.getText()+"1"); 
        	}
  
        if(e.getSource()==bt2)
        
           {
        	txt.setText(txt.getText()+"2");
        	}
        
        if(e.getSource()==bt3) 
    
        {
        	txt.setText(txt.getText()+"3");
        	}
    
        if(e.getSource()==bt4) 
   
        { 
        	txt.setText(txt.getText()+"4");
        }
   
        if(e.getSource()==bt5) 
   
        {
        	txt.setText(txt.getText()+"5");
        }
   
        if(e.getSource()==bt6) 
   
        {  
        	txt.setText(txt.getText()+"6"); 
        }
   
        if(e.getSource()==bt7) 
   
        { 
        	txt.setText(txt.getText()+"7");
        }
   
        if(e.getSource()==bt8) 
   
       {  txt.setText(txt.getText()+"8");
        }
        
        if(e.getSource()==bt9) 
   
        {
        	txt.setText(txt.getText()+"9");
        	}
   
        if(e.getSource()==bt0) 
   
	    { 
        	txt.setText(txt.getText()+"0");
	    }
        
        if(e.getSource()== btDot)
        {
        	txt.setText(txt.getText()+".");
        }
   
//   if(e.getSource()==btequal) 
//   
//      text.setText(text.getText()+"=");
//   
//   if(e.getSource()==btclr) 
//   
//      text.setText(text.getText()+"c");
        
   if(e.getSource()==btAdd) {
   String s = txt.getText();
   a = Double.parseDouble(s);
   txt.setText("");
   flag=1;
    }
   ;
   if(e.getSource()==btSub){
	   String s = txt.getText();
	   a = Double.parseDouble(s);
	   txt.setText("");
	   flag=2;
	    }
   
   Object btmulti;
  if(e.getSource()==btMulti){
	   String s = txt.getText();
	   a = Double.parseDouble(s);
	   txt.setText("");
	   flag=3;
	    }
   
   if(e.getSource()==btDivision){
	   String s = txt.getText();
	   a = Double.parseDouble(s);
	   txt.setText("");
	   flag=4;
	    } 

   if(e.getSource()==btClr){
	   String s = txt.getText();
	   a = Double.parseDouble(s);
	   txt.setText("");
	   flag=5;
	   
	    } 
      if(e.getSource()==btEqual) {
    	  
    		  if(flag ==1) {
    			  String s2 = txt.getText();
    			  b = Double.parseDouble(s2);
    			  double c =a + b;
    			  txt.setText(Double.toString(c));
    			  }
    		  if(flag == 2) {
    			  String s2 = txt.getText();
    			  b = Double.parseDouble(s2);
    			  double c = a - b;
    			  txt.setText(Double.toString(c));
    			  }
    		  if(flag ==3) {
    			  String s2 = txt.getText();
    			  b = Double.parseDouble(s2);
    			  double c = a * b;
    			  txt.setText(Double.toString(c));
    			  }
    		  if(flag ==4) {
    			  String s2 = txt.getText();
    			  b = Double.parseDouble(s2);
    			  double c =a / b;
    			  txt.setText(Double.toString(c)); }

    			  if(flag ==5) {
        			 
        			  double c = 0;
        			  txt.setText(Double.toString(c));


    		  
   		    	 }
  }
			
		}		
		public static void main(String[] args) {
			new Mycalculator();
	     
	}

}
 
