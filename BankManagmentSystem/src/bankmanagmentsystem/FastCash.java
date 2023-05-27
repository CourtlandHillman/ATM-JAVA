
package bankmanagmentsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;

public class FastCash extends JFrame  implements ActionListener {
    
    JButton  first , twenty , back , tenth , fifty , fifth , second;
    JLabel text ;
    String pinNumber;
    FastCash (String pinNumber) {
        this.pinNumber = pinNumber;

        setLayout(null);
        
        
        //Icon adding at set size 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        
        
        text = new JLabel ("SELECT WITHDRAWL AMOUNT ");
        text.setBounds(220 , 300 ,700 , 35);
        text.setForeground(Color.GREEN); // цвет шрифта 
        text.setFont(new Font("System" , Font.BOLD , 16));
        image.add(text);
        
        first = new JButton("$  100");
        first.setBounds(165, 415, 150, 30);
        first.setForeground(Color.GREEN);
        first.setBackground(Color.BLACK);
        first.addActionListener(this); //привязывает кнопку и действие 
        image.add(first);//добавляет кнопку поверх картинки !!!!
        
        second = new JButton("$  200");
        second.setBounds(355, 415, 150, 30);
        second.setForeground(Color.GREEN);
        second.setBackground(Color.BLACK);
        second.addActionListener(this); 
        image.add(second);//добавляет кнопку поверх картинки !!!!
        
        fifth = new JButton("$  500");
        fifth.setBounds(165, 450, 150, 30);
        fifth.setForeground(Color.GREEN);
        fifth.setBackground(Color.BLACK);
        fifth.addActionListener(this); 
        image.add(fifth);//добавляет кнопку поверх картинки !!!!
        
        tenth = new JButton("$  1000");
        tenth.setBounds(355, 450, 150, 30);
        tenth.setForeground(Color.GREEN);
        tenth.setBackground(Color.BLACK);
        tenth.addActionListener(this); 
        image.add(tenth);//добавляет кнопку поверх картинки !!!!
        
        twenty = new JButton("$  2000");
        twenty.setBounds(165, 485, 150, 30);
        twenty.setForeground(Color.GREEN);
        twenty.setBackground(Color.BLACK);
        twenty.addActionListener(this); 
        image.add(twenty);//добавляет кнопку поверх картинки !!!!
        
        fifty = new JButton("$  5000");
        fifty.setBounds(355, 485, 150, 30);
        fifty.setForeground(Color.GREEN);
        fifty.setBackground(Color.BLACK);
        fifty.addActionListener(this); 
        image.add(fifty);//добавляет кнопку поверх картинки !!!!
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.setForeground(Color.GREEN);
        back.setBackground(Color.BLACK);
        back.addActionListener(this); 
        image.add(back);//добавляет кнопку поверх картинки !!!!
        
        //Window size setter
        setSize(900 , 900);
        setLocation (300 , 0);
        setUndecorated(true);  // уберает панель управления сверху 
        setVisible(true);
        
    }
    
    public static void main ( String args []) {
        
        
      new FastCash("").setVisible(true);;
      
    }

    @Override // привязывает действия к клавищам !!
    public void actionPerformed(ActionEvent ae) {
          try {
            String amount = ((JButton)ae.getSource()).getText().substring(3); //k
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pinNumber = '"+pinNumber+"'");
            int balance = 0;
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            } String num = "17";
            if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }

            if (ae.getSource() == back) {
                this.setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            }else{
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+pinNumber+"', '"+date+"', 'Withdrawal', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "$. "+amount+" Debited Successfully");
                    
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
