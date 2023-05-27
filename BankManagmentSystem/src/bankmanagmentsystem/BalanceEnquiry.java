
package bankmanagmentsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;




public class BalanceEnquiry extends JFrame implements ActionListener {
    
    JLabel image ,  text;
    JButton  back;
    ImageIcon i1 , i3;
    String pinNumber;
    
    
    BalanceEnquiry( String pinNumber) {
        
        this.pinNumber = pinNumber;
        
        
       setLayout(null);
        
        
       i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
       Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
       i3 = new ImageIcon(i2);
       image = new JLabel(i3);
       image.setBounds(0,0,900,900);
       add(image);
       
        
       back = new JButton("BACK");
       back.setFont(new Font("System" , Font.BOLD , 16));
       back.setBounds(420, 520, 100, 30);
       back.setBackground(Color.BLACK);
       back.setForeground(Color.GREEN);
       back.addActionListener(this);
       image.add(back);
       
       
            
       Conn c = new Conn();
       int balance = 0;
       try {
            ResultSet rs = c.s.executeQuery("select * from bank where pinNumber = '"+pinNumber+"'");
            
            
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            } 
       } catch (Exception e){
           System.out.println(e);
       }
       
       text = new JLabel("Your current balance is $" + balance);
       text.setForeground(Color.GREEN);
       text.setBackground(Color.BLACK);
       text.setBounds(170, 300, 400, 30);
       text.setFont(new Font("Raleway" , Font.BOLD , 16) );
       image.add(text);
       
       
       setSize(900 ,900);
       setLocation(300, 0);
       setUndecorated(true);
       setVisible(true);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
        setVisible(false);
        new Transactions(pinNumber).setVisible(true);
    }
    
    
    
    
    
    public static void main ( String args []){
        
        new BalanceEnquiry("");
    }

    
}
