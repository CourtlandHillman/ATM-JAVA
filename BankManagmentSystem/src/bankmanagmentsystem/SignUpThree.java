
package bankmanagmentsystem;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class SignUpThree extends JFrame implements ActionListener {
    
    JRadioButton r1 , r2 , r3 , r4;
    ButtonGroup typeGroup;
    JCheckBox c1 ,c2 ,c3 ,c4 ,c5 ,c6 ,c7;
    String formNo;
    
    JButton submit , cancel;
    JLabel cardNumber1 , label , label1 , type , number  , cardDetails, 
            pin , pnumber  , pinDetails , serReq ;
    
    SignUpThree(String formNo){
        this.formNo = formNo;
        
        setLayout(null);
        
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        // sizeof the window:
        Image image2 =  icon1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        
        // creatint another one icon for casting
        ImageIcon icon3 = new ImageIcon(image2);
        label = new JLabel( icon3);
        label.setBounds(10, 10, 100, 100);
        add(label);
        
        label1 = new JLabel("Page 3: Account Details");
        label1.setFont(new Font("Raleway" , Font.BOLD , 22) );
        label1.setBounds(280, 40, 400, 40);
        add(label1);
        
        type = new JLabel("Account Type");
        type.setFont(new Font("Raleway" , Font.BOLD , 22) );
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway" , Font.BOLD , 16) );
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway" , Font.BOLD , 16) );
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180, 250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway" , Font.BOLD , 16) );
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 160, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raleway" , Font.BOLD , 16) );
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220, 250, 20);
        add(r4);
        
        typeGroup = new ButtonGroup();
        typeGroup.add(r1);
        typeGroup.add(r2);
        typeGroup.add(r3);
        typeGroup.add(r4);
        
        cardNumber1 = new JLabel("Card Number :");
        cardNumber1.setFont(new Font("Raleway" , Font.BOLD , 22));
        cardNumber1.setBounds(100, 300, 200, 30);
        add(cardNumber1);
        
        number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway" , Font.BOLD , 22));
        number.setBounds(330, 300, 250, 30);
        add(number);
        
        cardDetails = new JLabel("Your 16 Digits Card Number");
        cardDetails.setFont(new Font("Raleway" , Font.BOLD , 12));
        cardDetails.setBounds(100, 330, 300, 20);
        add(cardDetails);
        
        pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway" , Font.BOLD , 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
        pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway" , Font.BOLD , 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);
        
        pinDetails = new JLabel("Your 4 Digits PIN-code");
        pinDetails.setFont(new Font("Raleway" , Font.BOLD , 12));
        pinDetails.setBounds(100, 400, 300, 20);
        add(pinDetails);
        
        serReq = new JLabel("Services Required :");
        serReq.setFont(new Font("Raleway" , Font.BOLD , 18));
        serReq.setBounds(100, 450, 200, 30);
        add(serReq);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway" , Font.BOLD , 16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway" , Font.BOLD , 16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway" , Font.BOLD , 16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway" , Font.BOLD , 16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway" , Font.BOLD , 16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway" , Font.BOLD , 16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("All Above");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway" , Font.BOLD , 16));
        c7.setBounds(100, 680, 450, 30);
        add(c7);
        
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font ("Raleway" , Font.BOLD , 14));
        submit.setBounds(250 , 720 , 100 ,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font ("Raleway" , Font.BOLD , 14));
        cancel.setBounds(420 , 720 , 100 ,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850 , 820);
        setLocation(350 , 0);
        setVisible(true);
        setBackground(Color.WHITE);
    }
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            } else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
            } else if(r3.isSelected()){
                accountType = "Current Account";
            } else if(r4.isSelected()){
                accountType = "Recurring Account";
            }
            
            Random random = new Random();
            long cardN = ((random.nextLong() % 900000000L) + 5040936000000000L);
            String cardNumber = "" + Math.abs(cardN);
            
            long pinN = ((random.nextLong() % 9000L) +1000L);
            String pinNumber = "" + Math.abs(pinN);
            
            String facility ="";
            if(c1.isSelected()){
                facility  = facility + "ATM Card";
            } else if (c2.isSelected()){
                facility = facility + "Internet Banking";
            } else if (c3.isSelected()){
                facility = facility + "Mobile Banking";
            } else if (c4.isSelected()){
                facility = facility + "Email & SMS Alerts";
            } else if (c5.isSelected()){
                facility = facility + "Check Book";
            } else if (c6.isSelected()){
                facility = facility + "E-Statement";
            } 
            try {
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else {
                    Conn c = new Conn();
                    String query1 = "Insert into signupThree values('"+formNo+"', '"+accountType+"' , '"+cardNumber+"' , '"+pinNumber+"' , '"+facility+"') ";
                    String query2 = "Insert into login values('"+formNo+"', '"+cardNumber+"' , '"+pinNumber+"' ) ";
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number" + cardNumber + "\n Pin: " + pinNumber);
                    
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }else if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    
    public static void main (String args []){
        new SignUpThree("");
    }
    
}
