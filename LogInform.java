package login;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LogInform extends JFrame{
        LogInform(){	
        
        JPanel p1, p2;
        setSize(600,450);
        setDefaultCloseOperation(2);
        setLayout(null);
        setLocationRelativeTo(null);
        
        
        p1 = new JPanel();
        p1.setBackground(Color.gray);
        p1.setBounds(5,5,490,60);
        add(p1);
       
       JLabel l1 = new JLabel("Log In Form");
       p1.setFont(new Font("Arial",Font.BOLD,30));
       p1.add(l1);
        
       p2 = new JPanel();
       p2.setBounds(5,70,490,425);
       p2.setLayout(null);
       add(p2);
       Font font1 = new Font("Arial",Font.BOLD,16);
       
       JLabel n = new JLabel("Name:");
       n.setBounds(130,5,100,25);
       p2.add(n);
       JTextField nt = new JTextField();
       nt.setBounds(200, 5, 200, 25);
       p2.add(nt);
       
       JLabel e = new JLabel("Email:");
       e.setBounds(130,40,200,25);
       p2.add(e);
       JTextField et = new JTextField();
       et.setBounds(200,50,200,25);
       p2.add(et);
       
       JButton rbtn = new JButton("Register");
       rbtn.setBounds(300,300,100,30);
       rbtn.setBackground(Color.green);
       rbtn.setFont(font1);
     
       p2.add(rbtn);
       JButton lbtn = new JButton("Login");
       lbtn.setBounds(100,300,100,30);
       lbtn.setBackground( Color.green);
       lbtn.setFont(font1);
       
       p2.add(lbtn);
       setVisible(true);
       rbtn.addActionListener(new ActionListener () {
          	@Override
          	public void actionPerformed(ActionEvent e) {
          		//new LogInform();
          		dispose();
          		new Registerform();
          	}
          
           });
           

        }
        
}
       
       