/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagmentsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Withdrawal  extends JFrame implements ActionListener{

    JButton withdrawal , back , exit;
    JTextField amount;
    JLabel label , text1 ;
    String pinNumber;
    
    Withdrawal (String pinNumber){
        this.pinNumber = pinNumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        // sizeof the window:
        Image i2 =  i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        // creatint another one icon for casting
        ImageIcon i3 = new ImageIcon(i2);
        label = new JLabel( i3);
        //icon size :
        label.setBounds(0, 0, 900, 900);
        add(label);        
        
        
        text1 = new JLabel("Please enter you want to Withdrawal !");
        text1.setForeground(Color.GREEN);
        text1.setFont(new Font("System" , Font.BOLD , 16));
        text1.setBounds(170 , 300 , 400 ,20);
        label.add(text1);
        
        amount = new JTextField();
        amount.setForeground(Color.GREEN);
        amount.setFont(new Font("System" , Font.BOLD , 22));
        amount.setBounds(170, 350, 320, 20);
        amount.setBackground(Color.BLACK);
        label.add(amount);
        
        withdrawal = new JButton ("Withdrawl");
        withdrawal.setForeground(Color.GREEN);
        withdrawal.setFont(new Font("System" , Font.BOLD , 16));
        withdrawal.setBounds(355, 485, 150, 30);
        withdrawal.setBackground(Color.BLACK);
        withdrawal.addActionListener(this);
        label.add(withdrawal);
        
        back = new JButton("Back");
        back.setFont(new Font("System" , Font.BOLD , 16));
        back.setForeground(Color.GREEN);
        back.setBounds(170, 485, 150, 30);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        label.add(back);
        
        exit = new JButton("Exit");
        exit.setFont(new Font("System" , Font.BOLD , 16));
        exit.setForeground(Color.GREEN);
        exit.setBounds(170, 520, 150, 30);
        exit.setBackground(Color.BLACK);
        exit.addActionListener(this);
        label.add(exit);
        
        setSize(900 , 900);
        setLocation(300 , 0);
        setVisible(true);
    }
    
    
    
    
    
    
     @Override
     public void actionPerformed(ActionEvent ae){
        try{        
            String number = amount.getText();
            Date date = new Date();
            if(ae.getSource()== withdrawal){
                if(amount.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdrawl");
                }else{
                    Conn c1 = new Conn();
                    //ResultSet rs = c1.s.executeUpdate("select * from bank where pin = '"+pinNumber+"'");
                    
                    
                    c1.s.executeUpdate("insert into bank values('"+pinNumber+"', '"+date+"', 'Withdrawl', '"+number+"')");
                    JOptionPane.showMessageDialog(null, amount+" Withdrawled Successfully");
                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);
                }
            }else if(ae.getSource()== back){
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            }
             else if(ae.getSource() == exit) {
             System.exit(0);
             }
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    
    public static void main ( String args []){
        new Withdrawal("");
        System.out.println("");
    }
    
    
}
