
package bankmanagmentsystem;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;


public class Deposit  extends JFrame implements ActionListener{

    JButton deposit , back , exit;
    JTextField amount;
    JLabel label , text1 ;
    String pinNumber;
    
    Deposit (String pinNumber){
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
        
        
        text1 = new JLabel("Please enter you want to deposit !");
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
        
        deposit = new JButton ("Deposit");
        deposit.setForeground(Color.GREEN);
        deposit.setFont(new Font("System" , Font.BOLD , 16));
        deposit.setBounds(355, 485, 150, 30);
        deposit.setBackground(Color.BLACK);
        deposit.addActionListener(this);
        label.add(deposit);
        
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
            if(ae.getSource()== deposit){
                if(amount.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pinNumber+"', '"+date+"', 'Deposit', '"+number+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
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
        new Deposit("");
        System.out.println("");
    }
    
    
}
