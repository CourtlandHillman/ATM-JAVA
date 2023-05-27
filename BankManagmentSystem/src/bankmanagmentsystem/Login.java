
package bankmanagmentsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JButton login , signup , clear ;
    JTextField cardTextField  ;
    JLabel  cardnumber , pin ;
    JPasswordField pinTextField; // Hide password digits
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE");
        // set icon at the left part of the window :
        setLayout(null);
        
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        // sizeof the window:
        Image image2 =  icon1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        
        // creatint another one icon for casting
        ImageIcon icon3 = new ImageIcon(image2);
        
        JLabel label = new JLabel( icon3);
        
        //icon size :
        label.setBounds(70, 10, 100, 100);
        
        add(label);
        // crearing greatings :
        JLabel text = new JLabel("Welcom to SOLLAR ATM ");
        text.setFont(new Font("Osward" , Font.BOLD , 38));
        text.setBounds(200, 40, 500, 40);
        add(text);
        //Creating card number field :
        cardnumber = new JLabel("Card No: ");
        cardnumber.setFont(new Font("Raleway" , Font.BOLD , 28));
        cardnumber.setBounds(120, 150, 150, 30);
        add(cardnumber);
        
        cardTextField = new JTextField ();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial" ,Font.BOLD ,  14));
        add(cardTextField);
        
        //Creating PIN field :
        pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway" , Font.BOLD , 28));
        pin.setBounds(120, 220, 230, 30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial" ,Font.BOLD ,  14));
        add(pinTextField);
        
        
        //button creation:
        login = new JButton("SIGN IN");
        login.setBounds(300 , 300 , 100 , 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430 , 300 , 100 , 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(365 , 360 , 100 , 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
         
        getContentPane().setBackground(Color.white);
        
        //SIZE OF WINDOW
        setSize(800 , 480);
        setVisible(true);
        setLocation(350 , 200);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
     
       
        
      if(ae.getSource() == clear){
          cardTextField.setText("");
          pinTextField.setText("");
      }else if(ae.getSource() == login){
          Conn c = new Conn();
          String cardNumber = cardTextField.getText();
          String pinNumber = pinTextField.getText();
          String query = "select * from login  where cardNumber = '"+cardNumber+"'and pinNumber = "+pinNumber+"'";
          
//          try{
//             ResultSet rs = c.s.executeQuery(query);
//            if(rs.next()){
                 setVisible(false);
                 new Transactions(pinNumber).setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(null, "Incorrect Card Number Or Pin Number");
//        }}
//          catch(Exception e){
//              System.out.println(e);
//         }
      }else if (ae.getSource() == signup){
          setVisible(false);
          new SignUpOne().setVisible(true);
      }else{
          
      }
    }
    
    public static void main (String args []){
        new Login();
    }
}
