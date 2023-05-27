
package bankmanagmentsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PinChange extends JFrame implements ActionListener {
    
    JLabel image , text  , pintext , repintext;
    JPasswordField pin , repin;
    JButton change , back;
    String pinNumber;
    
    PinChange(String pinNumber){
        this.pinNumber = pinNumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.GREEN);
        text.setFont(new Font("System" , Font.BOLD , 16));
        text.setBounds(250 , 280 , 500 , 35);
        image.add(text);
        
        pintext = new JLabel("New PIN:");
        pintext.setForeground(Color.GREEN);
        pintext.setFont(new Font("System" , Font.BOLD , 16));
        pintext.setBounds(165 , 320 , 180 , 25);
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font ("Raleway" , Font.BOLD , 16));
        pin.setBounds(345, 320, 160, 25);
        pin.setForeground(Color.GREEN);
        pin.setBackground(Color.BLACK);
        image.add(pin);
        
        
        repintext = new JLabel("Re-Enter New PIN:");
        repintext.setForeground(Color.GREEN);
        repintext.setFont(new Font("System" , Font.BOLD , 16));
        repintext.setBounds(165 , 360 , 180 , 25);
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font ("Raleway" , Font.BOLD , 16));
        repin.setBounds(345, 360, 160, 25);
        repin.setForeground(Color.GREEN);
        repin.setBackground(Color.BLACK);
        image.add(repin);
        
        
        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.setForeground(Color.GREEN);
        change.setBackground(Color.BLACK);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.setForeground(Color.GREEN);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900, 900);
        setLocation(300 , 0);
        setVisible(true);
        setUndecorated(true); 
        
    }
    public static void main(String args []){
        
        new PinChange("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == change){
            
        try {
            String npin = pin.getText();
            String rpin = repin.getText();
            
            if(!npin.equals(rpin)) {
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
            return;
            }
            
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter New PIN ");
            return;
            }
            if(rpin.equals("") ){
                JOptionPane.showMessageDialog(null, "Please RE-Enter New PIN ");
            return;
            }
            Conn c = new Conn();
            String query1 = "update bank set pinNumber = '"+rpin+"' where pinNumber = '"+pin+"'";
            String query2 = "update login set pinNumber = '"+rpin+"' where pinNumber = '"+pin+"'";
            String query3 = "update signupThree set pinNumber = '"+rpin+"' where pinNumber = '"+pin+"'";
            
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            
             JOptionPane.showMessageDialog(null, " PIN Changed Successfully!");
            
             setVisible(false);
             new Transactions(pinNumber).setVisible(true);
            
        }   catch (Exception e ) {
            System.out.println(e);
          }
        } else {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
        
    }
}
