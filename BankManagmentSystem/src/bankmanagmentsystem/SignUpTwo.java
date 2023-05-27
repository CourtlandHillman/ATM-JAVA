
package bankmanagmentsystem;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class SignUpTwo extends JFrame implements ActionListener {
    
    long random;
    
    JTextField   panNumberTextField ,ibanNumberTextField ;
       
    ImageIcon icon1 ,icon3 ;
    
    JComboBox religionBox  ,  categoryBox , educationalBox , incomeBox , occupationBox;
    
    JLabel label  , additionalDetails ,religion ,category ,income , 
       educational , qualification ,    occupation , panNumber , ibanNumber, 
            citizen , exsisting ;
    
    JButton next;
    
    String formNo;
    
    JRadioButton syes , sno  , eyes , eno;
    
     ButtonGroup yesOrNo  , yesOrNo2;
    
  
    
    SignUpTwo( String formNo){
        this.formNo = formNo;
        setLayout(null);
        
        setTitle("New Account Application Form - Page 2 ");
        //Icon path
        icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        // sizeof the window:
        Image image2 =  icon1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        
        // creatint another one icon for casting
        icon3 = new ImageIcon(image2);
        
        label = new JLabel( icon3);
        
        //icon size :
        label.setBounds(10, 10, 100, 100);
        
        add(label);
        // getting random number for user No.
       
        
        
        
        // Page 2
        additionalDetails = new JLabel ("Page 2 : Additional Details" );
        //style and size
        additionalDetails.setFont(new Font("raleway" , Font.BOLD , 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        
        //Religion
        religion = new JLabel ("Religion :" );
        //style and size
        religion.setFont(new Font("raleway" , Font.BOLD , 20));
        religion.setBounds(100, 140, 160, 30);
        add(religion);
        
        String valReligion [] = { "Hindu" , "Muslim" , "Sikh" , "Christian" , "Other"};
        religionBox = new JComboBox( valReligion);
        religionBox.setBounds(300, 140, 400, 30);
        religionBox.setBackground(Color.WHITE);
        add(religionBox);
        
     
        // Category 
        
       
        category = new JLabel ("Category :" );
        //style and size
        category.setFont(new Font("raleway" , Font.BOLD , 20));
        category.setBounds(100, 190, 160, 30);
        add(category);
        
        String valCategory [] = {"General" , "OBC" ,"SC" , "ST" , "Other" };
        categoryBox = new JComboBox (valCategory);
        categoryBox.setBounds(300, 190, 400, 30);
        categoryBox.setBackground(Color.WHITE);
        add(categoryBox);
        
        
        //Income:
        income = new JLabel(" Income :");
        income.setFont(new Font("Raleway" , Font.BOLD , 20));
        income.setBounds(100, 240, 160, 30);
        add(income);
        
        
        String valIncome [] = {"Null" , "<1,50,000" ,"<2,50,0000" , "< 5,50,0000" , "Higher 10,00,0000" };
        incomeBox= new JComboBox(valIncome);
        incomeBox.setBounds(300, 240, 400, 30);
        incomeBox.setBackground(Color.WHITE);
        add(incomeBox);
        
        
        
        //Education 
        educational = new JLabel("Educational ");
        educational.setFont(new Font("Raleway" , Font.BOLD , 20));
        educational.setBounds(100, 290, 160, 30);
        add(educational);
        
        String valEducation [] = {"Non Graduation ", "Middle School" , "High School" , "Bachelor" , "Master"};
        educationalBox = new JComboBox (valEducation);
        educationalBox.setBounds(300, 290, 160, 30);
        educationalBox.setBackground(Color.WHITE);
        add(educationalBox);
        
        //Qualification
        qualification = new JLabel("Qualification :");
        qualification.setFont(new Font("Raleway" , Font.BOLD , 20));
        qualification.setBounds(100, 310, 160, 30);
        add(qualification);
        
        
        
       
        
        //Occupation
        occupation = new JLabel("Occupation :");
        occupation.setFont(new Font("Raleway" , Font.BOLD , 20));
        occupation.setBounds(100, 390, 160, 30);
        add(occupation);
        
        String valOccupation [] = {"Salaried" , "Self Employed" , "Bissiness" , "Student" , "Retired" , "Other"};
        occupationBox = new JComboBox (valOccupation);
        occupationBox.setBackground(Color.WHITE);
        occupationBox.setBounds(300, 390, 160, 30);
        add(occupationBox);
        
        
        
        //PAN Number 
        panNumber = new JLabel("PAN Number :");
        panNumber.setFont(new Font("Raleway" , Font.BOLD , 20));
        panNumber.setBounds(100, 440, 160, 30);
        add(panNumber);
        
        panNumberTextField = new JTextField();
        panNumberTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        panNumberTextField.setBounds(300, 440, 400, 30);
        add(panNumberTextField);
        
        //IBAN Number
        ibanNumber = new JLabel("IBAN Number");
        ibanNumber.setFont(new Font("Raleway" , Font.BOLD , 20));
        ibanNumber.setBounds(100, 490, 160, 30);
        add(ibanNumber);
        
        ibanNumberTextField = new JTextField();
        ibanNumberTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        ibanNumberTextField.setBounds(300, 490 ,400, 30);
        add(ibanNumberTextField);
        
        //Senior Citizen 
        citizen = new JLabel("Senior Citizen :");
        citizen.setFont(new Font("Raleway" , Font.BOLD , 20));
        citizen.setBounds(100, 540, 160, 30);
        add(citizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300  , 540 , 50 , 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(360  , 540 , 50 , 30);
        sno.setBackground(Color.WHITE);
        add(sno);

         yesOrNo = new ButtonGroup();
         yesOrNo.add(syes);
         yesOrNo.add(sno);
         
        
        //Exsisting Account
        exsisting  = new JLabel("Exsisting Account :");
        exsisting.setFont(new Font("Raleway" , Font.BOLD , 20));
        exsisting.setBounds(100, 590, 200, 30);
        add(exsisting);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300  , 590 , 50 , 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(360  , 590 , 50 , 30);
        eno.setBackground(Color.WHITE);
        add(eno);

         yesOrNo2 = new ButtonGroup();
         yesOrNo2.add(syes);
         yesOrNo2.add(sno);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway" , Font.BOLD , 22));
        next.setBounds(620 ,790, 120 , 30 );
        next.addActionListener(this);
        add(next);
        
        //collor of the window
        getContentPane().setBackground(Color.WHITE);
        // size of the window
        setSize(900 , 900);
        setLocation(350 , 10);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String formNo = "" + random; // long
        String sreligion  = (String)religionBox.getSelectedItem(); // set text
        String scategory = (String)categoryBox.getSelectedItem();
        String sincome = (String)incomeBox.getSelectedItem();
        String seducational = (String) educationalBox.getSelectedItem();
        String soccupation = (String) occupationBox.getSelectedItem();
        String span = panNumberTextField.getText();
        String sban = ibanNumberTextField.getText();
        
        
        String ssenior = null;
        if ( syes.isSelected()) {
            ssenior = "Yes";
        } else if (sno.isSelected()){
            ssenior = "No";
        } 
        
        
        String sexsisting = null;
        if (eyes.isSelected()) {
            sexsisting = "Yes";  
        } else if (eno.isSelected()){
            sexsisting = "No";
        }
        
        
        try {
                Conn c = new Conn();
                String query = "Insert into signupTwo values ('"+formNo+"', '"+sreligion+"' , '"+scategory+"' , '"+sincome+"' , '"+seducational+"' , '"+soccupation+" ' , ' "+span+" ' , '"+sban+"' , '"+ssenior+"' , '"+sexsisting+"') ";
                c.s.executeUpdate(query);
                
            // SignUpThree 
            setVisible(false);
            new SignUpThree(formNo).setVisible(true);
                
                
        } catch ( Exception e){
            System.out.println(e);
        }
        
    }
    
   
    
    public static void main (String args []){
        
        //start loading 
        new SignUpTwo("");
    }
}
