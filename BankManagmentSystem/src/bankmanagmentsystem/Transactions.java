
package bankmanagmentsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Transactions extends JFrame  implements ActionListener {
    
    JButton  deposit , pinChange , exit , miniStatement , balance , fastcash , withdrawl;
    JLabel text ;
    String pinNumber;
    Transactions (String pinNumber) {
        this.pinNumber = pinNumber;

        setLayout(null);
        
        
        //Icon adding at set size 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        
        
        text = new JLabel ("Please select your Transaction");
        text.setBounds(220 , 300 ,700 , 35);
        text.setForeground(Color.GREEN); // цвет шрифта 
        text.setFont(new Font("System" , Font.BOLD , 16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(165, 415, 150, 30);
        deposit.setForeground(Color.GREEN);
        deposit.setBackground(Color.BLACK);
        deposit.addActionListener(this); //привязывает кнопку и действие 
        image.add(deposit);//добавляет кнопку поверх картинки !!!!
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.setForeground(Color.GREEN);
        withdrawl.setBackground(Color.BLACK);
        withdrawl.addActionListener(this); 
        image.add(withdrawl);//добавляет кнопку поверх картинки !!!!
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(165, 450, 150, 30);
        fastcash.setForeground(Color.GREEN);
        fastcash.setBackground(Color.BLACK);
        fastcash.addActionListener(this); 
        image.add(fastcash);//добавляет кнопку поверх картинки !!!!
        
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(355, 450, 150, 30);
        miniStatement.setForeground(Color.GREEN);
        miniStatement.setBackground(Color.BLACK);
        miniStatement.addActionListener(this); 
        image.add(miniStatement);//добавляет кнопку поверх картинки !!!!
        
        pinChange = new JButton("Pin Change");
        pinChange.setBounds(165, 485, 150, 30);
        pinChange.setForeground(Color.GREEN);
        pinChange.setBackground(Color.BLACK);
        pinChange.addActionListener(this); 
        image.add(pinChange);//добавляет кнопку поверх картинки !!!!
        
        balance = new JButton("Current Balance");
        balance.setBounds(355, 485, 150, 30);
        balance.setForeground(Color.GREEN);
        balance.setBackground(Color.BLACK);
        balance.addActionListener(this); 
        image.add(balance);//добавляет кнопку поверх картинки !!!!
        
        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.setForeground(Color.GREEN);
        exit.setBackground(Color.BLACK);
        exit.addActionListener(this); 
        image.add(exit);//добавляет кнопку поверх картинки !!!!
        
        //Window size setter
        setSize(900 , 900);
        setLocation (300 , 0);
        setUndecorated(true);  // уберает панель управления сверху 
        setVisible(true);
        
    }
    
    public static void main ( String args []) {
        
        
      new Transactions("").setVisible(true);
      
    }

    @Override // привязывает действия к клавищам !!
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit ) {
            System.exit(0); // выключает программу !!!!!
        } else if ( ae.getSource() == deposit){
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
            
        } else if (ae.getSource() == withdrawl ){
            setVisible(false);
            new Withdrawal(pinNumber).setVisible(true);
        } else if (ae.getSource() == fastcash) {
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        } else if (ae.getSource() == pinChange) {
            setVisible(false);
            new PinChange(pinNumber).setVisible(true);
        } else if (ae.getSource() == balance) {
            setVisible(false);
            new BalanceEnquiry(pinNumber).setVisible(true);
        } else if (ae.getSource() == miniStatement) {
            setVisible(false);
            new MiniStatement(pinNumber).setVisible(true);
        }
    
    }
}
