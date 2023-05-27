
package bankmanagmentsystem;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignUpOne extends JFrame implements ActionListener {
    
    long random;
    
    JTextField fnameTextField , snameTextField , fatherNameTextField , emailNameTextField ,phoneNameTextField, addressNameTextField ,
    cityNameTextField , stateNameTextField , countryNameTextField , pinCodeNameTextField;
       
    ImageIcon icon1 ,icon3 ;
    
    JLabel label ,form , personDetails ,fname ,sname ,fathername , dateOfBirth , 
       gender , email ,  phoneNumber ,  maritalStatus , address , city , country ,
            state , pinCode ;
    
    JButton next;
    
    JDateChooser dateChoosen;
    
    JRadioButton male , female;
    
    JRadioButton single , married;
    
    ButtonGroup genderGroup1;
    
    SignUpOne(){
        
        setLayout(null);
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
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        form = new JLabel ("Application Form No. " + random);
        //style and size
        form.setFont(new Font("raleway" , Font.BOLD , 38));
        form.setBounds(140, 20, 600, 40);
        add(form);
        
        // Page 1
        personDetails = new JLabel ("Page 1 : Personal Details" );
        //style and size
        personDetails.setFont(new Font("raleway" , Font.BOLD , 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);
        
        
        //name
        fname = new JLabel ("First Name :" );
        //style and size
        fname.setFont(new Font("raleway" , Font.BOLD , 20));
        fname.setBounds(100, 140, 160, 30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        fnameTextField.setBounds(300, 140, 400, 30);
        add(fnameTextField);
        // name 
        sname = new JLabel ("Second Name :" );
        //style and size
        sname.setFont(new Font("raleway" , Font.BOLD , 20));
        sname.setBounds(100, 190, 160, 30);
        add(sname);
        
        snameTextField = new JTextField();
        snameTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        snameTextField.setBounds(300, 190, 400, 30);
        add(snameTextField);
        
        //father's name:
        fathername = new JLabel("Father's Name :");
        fathername.setFont(new Font("Raleway" , Font.BOLD , 20));
        fathername.setBounds(100, 240, 160, 30);
        add(fathername);
        
        fatherNameTextField = new JTextField();
        fatherNameTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        fatherNameTextField.setBounds(300, 240, 400, 30);
        add(fatherNameTextField);
        
        //Date of Brirth:
        
        dateOfBirth = new JLabel("Date Of Birth :");
        dateOfBirth.setFont(new Font("Raleway" , Font.BOLD , 20));
        dateOfBirth.setBounds(100, 290, 160, 30);
        add(dateOfBirth);
        
        dateChoosen = new JDateChooser();
        dateChoosen.setBounds(300, 290, 400, 30);
        dateChoosen.setForeground(new Color(105 , 105 , 105));
        add(dateChoosen);
        
        //Gender 
        gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway" , Font.BOLD , 20));
        gender.setBounds(100, 340, 160, 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 340, 100, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 340, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
         genderGroup.add(male);
         genderGroup.add(female);
         
        
        //email
        email = new JLabel("Email :");
        email.setFont(new Font("Raleway" , Font.BOLD , 20));
        email.setBounds(100, 390, 160, 30);
        add(email);
        
        emailNameTextField = new JTextField();
        emailNameTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        emailNameTextField.setBounds(300, 390, 400, 30);
        add(emailNameTextField);
        
        //phone number
        phoneNumber = new JLabel("Phone Number :");
        phoneNumber.setFont(new Font("Raleway" , Font.BOLD , 20));
        phoneNumber.setBounds(100, 440, 160, 30);
        add(phoneNumber);
        
        phoneNameTextField = new JTextField();
        phoneNameTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        phoneNameTextField.setBounds(300, 440, 400, 30);
        add(phoneNameTextField);
        
        //Marital starus
        maritalStatus = new JLabel("Marital Status :");
        maritalStatus.setFont(new Font("Raleway" , Font.BOLD , 20));
        maritalStatus.setBounds(100, 490, 160, 30);
        add(maritalStatus);
        
        single = new JRadioButton("Single");
        single.setBounds(300, 490, 100, 30);
        single.setBackground(Color.WHITE);
        add(single);
        
        married = new JRadioButton("Married");
        married.setBounds(450, 490, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        genderGroup1 = new ButtonGroup();
         genderGroup1.add(single);
         genderGroup1.add(married);
        
        
        
        //Address
        address = new JLabel("Address :");
        address.setFont(new Font("Raleway" , Font.BOLD , 20));
        address.setBounds(100, 540, 160, 30);
        add(address);
        
        addressNameTextField = new JTextField();
        addressNameTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        addressNameTextField.setBounds(300, 540, 400, 30);
        add(addressNameTextField);
        
        //city
        city = new JLabel("City :");
        city.setFont(new Font("Raleway" , Font.BOLD , 20));
        city.setBounds(100, 590, 160, 30);
        add(city);
        
        cityNameTextField = new JTextField();
        cityNameTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        cityNameTextField.setBounds(300, 590, 400, 30);
        add(cityNameTextField);
        
        //state
        state = new JLabel("State :");
        state.setFont(new Font("Raleway" , Font.BOLD , 20));
        state.setBounds(100, 640, 160, 30);
        add(state);
        
        stateNameTextField = new JTextField();
        stateNameTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        stateNameTextField.setBounds(300, 640, 400, 30);
        add(stateNameTextField);
        
        //country
        country = new JLabel("Country :");
        country.setFont(new Font("Raleway" , Font.BOLD , 20));
        country.setBounds(100, 690, 160, 30);
        add(country);
        
        countryNameTextField = new JTextField();
        countryNameTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        countryNameTextField.setBounds(300, 690, 400, 30);
        add(countryNameTextField);
        
        //pin code
        pinCode = new JLabel("Pin Code :");
        pinCode.setFont(new Font("Raleway" , Font.BOLD , 20));
        pinCode.setBounds(100, 740, 160, 30);
        add(pinCode);
        
        pinCodeNameTextField = new JTextField();
        pinCodeNameTextField.setFont(new Font("raleway" , Font.BOLD , 22));
        pinCodeNameTextField.setBounds(300, 740, 400, 30);
        add(pinCodeNameTextField);
        
        
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
        String fname1 = fnameTextField.getText(); // set text
        String sname1 = snameTextField.getText();
     
        String fatherName = fatherNameTextField.getText();
        String dob = ((JTextField)dateChoosen.getDateEditor().getUiComponent()).getText();
        String phone = phoneNameTextField.getText();
        String address1 = addressNameTextField.getText();
        String city1 = cityNameTextField.getText();
        String state1 = stateNameTextField.getText();
        String country1 = countryNameTextField.getText();
        String pinCode1 = pinCodeNameTextField.getText();
        String email1 = emailNameTextField.getText();
        
        String gender1 = null;
        if ( male.isSelected()) {
            gender1 = "Male";
        } else if (female.isSelected()){
            gender1 = "Female";
        } 
        
        String marital = null;
        if (single.isSelected()) {
            marital = "Single";  
        } else if (married.isSelected()){
            marital = "Married";
        }
        
        
        try {
            if(fname.equals("")) {
                JOptionPane.showMessageDialog(null , "Name is Required");
            } else {
                Conn c = new Conn();
                String query = "Insert into signupOne values ('"+formNo+"', '"+fname1+"' , '"+sname1+"' , '"+fatherName+"' , '"+dob+"' , '"+gender1+" ' , '"+email1+"' , '"+marital+"' , '" +phone+"' , '"+address1+"','"+city1+"' , '"+state1+" ','"+country1+ "' , '" +pinCode1+"') ";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUpTwo(formNo).setVisible(true);
                
            }
            
        } catch ( Exception e){
            System.out.println(e);
        }
        
    }
    
   
    
    public static void main (String args []){
        
        //start loading 
        new SignUpOne().setVisible(true);
    }
    
}
