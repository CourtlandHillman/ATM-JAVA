
package bankmanagmentsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener {
    
   String pinNumber;
   JLabel  mini , bank , card ,  balance;

    
    MiniStatement (String pinNumber ){
        
        setTitle("Mini Statement");
        
        setLayout(null);
        
        mini = new JLabel();
        mini.setForeground(Color.GREEN);
        mini.setBounds(20 , 140 , 400 , 500);
        add(mini);
        
        bank = new JLabel("Necrantir Bank");
        bank.setBounds(150 , 20 , 100 , 20);
        bank.setForeground(Color.GREEN);
        add(bank);
        
        card = new JLabel();
        card.setBounds(20 , 80 , 300 , 20);
        card.setForeground(Color.GREEN);
        add(card);
        
        balance = new JLabel();
        balance.setBounds(20, 500, 300, 20);
        balance.setForeground(Color.GREEN);
        add(balance);
        
        try{
            
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pinNumber = '"+pinNumber+"'");
            while(rs.next()) {
               card.setText("Card Number : "+ rs.getString("cardNumber").substring(0,4)+"-XXXX-XXXX-" + rs.getString("cardNumber").substring(12)); 
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try{
            Conn c = new Conn();
            int bal = 0 ;
            ResultSet rs = c.s.executeQuery("select * from bank where pinNumber = '"+pinNumber+"' ");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount")+ "<br><br><html>");
            if (rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your current account balance is $ " + bal);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        setSize(400 , 900);
        setLocation(20 ,20);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
    public static void main ( String args []){
        
        new MiniStatement("").setVisible(true);
    }

    
}
