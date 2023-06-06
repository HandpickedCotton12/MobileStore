/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.s.mobile.shop;

/**
 *
 * @author zahra
 */
import java.awt.Color;
import java.awt.Font;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
 

public class Login extends JFrame {
    
    //Creating Borders for Lables Panles and Buttons etc
     Border brdr= BorderFactory.createLineBorder(Color.YELLOW, 3, true);
                Border TextField = BorderFactory.createLineBorder(Color.RED, 1,true);
              Border buttonbrdr= BorderFactory.createLineBorder(Color.MAGENTA, 3, true);
    
    //Creating Frames
      JFrame frame2= new JFrame("OWNER LOGIN");
     JFrame frame =new  JFrame("USER LOGIN");
     JFrame frame3 = new JFrame("Sign Up Page");
      
     
     //Creating Text Fields for Account Sign Up
     JTextField emailTxtAc = new JTextField();
     JTextField emailTxtLogin = new JTextField();
     JTextField emailTxtOw = new JTextField();
     JTextField nameTxt = new JTextField();
     JTextField contactTxt = new JTextField();
     JTextField adressTxt = new JTextField();
     
     
     //Creating Labels
     JLabel backgrnd = new JLabel();
     JLabel UserEmail = new JLabel("Enter Your Email adress:");
     JLabel password = new JLabel("Enter Your Password:");
     JLabel Name = new JLabel("Enter Your Name:");
     JLabel Contact = new JLabel("Enter Your Contact Number:");
     JLabel adress = new JLabel("Enter Your Adress:");
     JLabel LOGIN = new JLabel("USER LOGIN");
     JLabel ownerLg= new JLabel("OWNER LOGIN");
     
     
     //Creating Passwords Fields
     JPasswordField  passlogin= new JPasswordField();
     JPasswordField passAc = new JPasswordField();
     JPasswordField passow= new JPasswordField();
     
     
     //Creating Buttons
     JButton button1 = new JButton("Login");
     JButton button2= new JButton("Create Account");
     JButton button = new JButton("Login");
     
     
    Color clr = new Color(170, 100, 80);
    
    
    
    //Declaring Strings for storing User data
 static String  checkemail,checkpass,Useremail,Username,Useradress,Usercontact,Userpswrd;
      
 
     
    String checkownerId,checkownerpass;
    
    
      
    public  void SignUp()
   {
          
       
       
       //Frame Properties
    frame3.setLayout(null);
        frame3.setSize(1200, 700);
        frame3.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          frame3.setLocation(50, 30);
         
          
       
        
         
                     
                     
                     //Desiging Labels
                      JLabel Signup = new JLabel("Sign Up");
          Signup.setFont(new Font("Ahadori", Font.PLAIN, 25));
          Signup.setBounds(560, 5, 110, 40);
          Signup.setForeground(Color.WHITE);
         
          
          frame3.add(Signup);
          
          //Creating Panel and Designing it
          JPanel cnr= new JPanel();
          cnr.setLayout(null);
          cnr.setBounds(400, 70,400 , 550);
          cnr.setBorder(brdr);
          cnr.setBackground(new Color(0,0,0,80));
          frame3.add(cnr);
          //Designing Labels and TextFields
          //And adding them to the Panels
          Name.setFont(new Font("Plain", Font.BOLD, 15));
           Name.setForeground(Color.WHITE);
           Name.setBounds(30, 10, 300, 50);
          cnr.add(Name);
          nameTxt.setFont(new Font("Arial", Font.ITALIC, 17));
           nameTxt.setBackground(clr);
           nameTxt.setForeground(Color.black);
           nameTxt.setBounds(100, 50, 220, 30);
            nameTxt.setBorder(TextField);
          
           cnr.add(nameTxt);
           
           
           
            Contact.setFont(new Font("Plain", Font.BOLD, 15));
           Contact.setForeground(Color.WHITE);
           Contact.setBounds(30, 110, 200, 50);
      cnr.add(Contact);
   
         contactTxt.setFont(new Font("Arial", Font.ITALIC, 15));
           contactTxt.setBackground(clr);
           contactTxt.setForeground(Color.black);
           contactTxt.setBounds(100, 150, 220, 30);
           contactTxt.setBorder(TextField);
         
           cnr.add(contactTxt);
         
         adress.setFont(new Font("Plain", Font.BOLD, 15));
           adress.setForeground(Color.WHITE);
           adress.setBounds(30, 210, 200, 50);
           
           cnr.add(adress);
         adressTxt.setFont(new Font("Arial", Font.ITALIC, 15));
           adressTxt.setBackground(clr);
           adressTxt.setForeground(Color.black);
           adressTxt.setBounds(100, 250, 220, 30);
          adressTxt.setBorder(TextField);
           
           cnr.add(adressTxt);
           
            UserEmail.setFont(new Font("Plain", Font.BOLD, 15));
           UserEmail.setForeground(Color.WHITE);
           UserEmail.setBounds(30, 310, 200, 50);
           cnr.add(UserEmail);
            emailTxtAc.setFont(new Font("Arial", Font.ITALIC, 15));
           emailTxtAc.setBackground(clr);
           emailTxtAc.setForeground(Color.black);
           emailTxtAc.setBounds(100, 350, 220, 30);
           emailTxtAc.setBorder(TextField);
             
               cnr.add(emailTxtAc);
               
              password.setFont(new Font("Plain", Font.BOLD, 15));
           password.setForeground(Color.WHITE);
           password.setBounds(30, 410, 200, 50);
           
           cnr.add(password);
           passAc.setFont(new Font("Arial", Font.ITALIC, 20));
           passAc.setBackground(Color.blue);
           passAc.setForeground(Color.black);
           passAc.setBounds(100, 450, 220, 30);
           passAc.setBorder(TextField);
          
           //Button and Adding to the Panel
           cnr.add(passAc);
            button2.setFont(new Font("Plain", Font.BOLD, 15));
            button2.setBackground( Color.GREEN);
           button2.setForeground(Color.BLACK);
           button2.setBorder(buttonbrdr);
           button2.setBounds(130, 500, 160, 40);
              cnr.add(button2);
              
              
              //Button Event of Create Account
           button2.addActionListener((ActionEvent e) -> {
               if(e.getSource()==button2)
               {
                   Username= nameTxt.getText();
                   Usercontact=contactTxt.getText();
                   Useradress=adressTxt.getText();
                   Useremail= emailTxtAc.getText();
                   Userpswrd=passAc.getText();
                   JOptionPane.showMessageDialog(null,"Account Has been Created Successfully Now Go to Login");
                   frame3.dispose();
                   
               }
    });
           
 
         
         
          frame3.setVisible(true);
   }
    
        
    
    
    
    
   
    
        
    
     public void UserLogin()
     {
         
         //Frame Propeties
        frame.setLayout(null);
        frame.setSize(370, 300);
        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          frame.setLocation(400, 100);
         
          
        
           
           
           //Designing Labels and Text Fields
           LOGIN.setFont(new Font("Arial",Font.BOLD,20));
           LOGIN.setBackground(new Color(0,0,0,80));
           LOGIN.setForeground(Color.BLACK);
           LOGIN.setBounds(110, 1, 200, 30);
           frame.add(LOGIN);
           frame.setBounds(0, 0, 370, 300);
           UserEmail.setFont(new Font("Plain", Font.BOLD, 15));
           UserEmail.setForeground(Color.BLACK);
           UserEmail.setBounds(60, 40, 200, 22);
           
           emailTxtLogin.setFont(new Font("Arial", Font.ITALIC, 20));
           emailTxtLogin.setBackground(clr);
           emailTxtLogin.setForeground(Color.black);
           emailTxtLogin.setBounds(62, 70, 220, 30);
            emailTxtLogin.setBorder(TextField);
           
            
           password.setFont(new Font("Plain", Font.BOLD, 15));
           password.setForeground(Color.BLACK);
           password.setBounds(60, 110, 200, 22);
           
            
           passlogin.setFont(new Font("Arial", Font.ITALIC, 20));
           passlogin.setBackground(clr);
           passlogin.setForeground(Color.black);
           passlogin.setBounds(62, 140, 220, 30);
           passlogin.setBorder(TextField);
           
      //LOGIN Button Designing
            button.setFont(new Font("Plain", Font.BOLD, 15));
            button.setBackground( Color.GREEN);
           button.setForeground(Color.BLACK);
           button.setBorder(buttonbrdr);
           button.setBounds(110, 200, 120, 35);
           
 
       //Button event of Login Button
            button.addActionListener((ActionEvent e) -> {
                //To change body of generated methods, choose Tools | Templates.
                if(e.getSource()==button)
                {
                    
                    
                    checkemail=emailTxtLogin.getText();
                    checkpass=passlogin.getText();
                    
                    if((checkemail.trim().equalsIgnoreCase(Useremail)) &&(checkpass.trim().equalsIgnoreCase(Userpswrd)) )
                    {
                        JOptionPane.showMessageDialog(null,"Congratulations! Logged in SuccessFully " );
                        HomePage homePage = new HomePage();
                        frame.dispose();
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Sorry!  Account does'nt Exist  ","ERROR",JOptionPane.ERROR_MESSAGE);
                        
                        

                        
                    }
                    
                }
        });
            
            //Adding Label to Frame
    
            
            //Adding Components to the Label
           frame.add(LOGIN);
          frame.add(emailTxtLogin);
           frame.add(UserEmail);
             frame.add(password);
             frame.add(passlogin);
             frame.add(button);
           
        
     
        frame.setVisible(true);
        
     
     
     
     
     }
   public void OwnerLogin()
   {
       
       //Frame properties
   frame2.setLayout(null);
        frame2.setSize(370, 300);
        frame2.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          frame2.setLocation(400, 100);
        
          
         
           
           //Designing Labels and Text Fields
           ownerLg.setFont(new Font("Arial",Font.BOLD,20));
           ownerLg.setBackground(new Color(0,0,0,80));
          ownerLg.setForeground(Color.PINK);
           ownerLg.setBounds(108, 0, 200, 30);
           frame2.add(ownerLg);
           
          
           
           
           UserEmail.setFont(new Font("Plain", Font.BOLD, 15));
           UserEmail.setForeground(Color.BLACK);
          
           UserEmail.setBounds(60, 40, 200, 22);
           UserEmail.setText("Enter Your ID");
           emailTxtOw.setFont(new Font("Arial", Font.ITALIC, 17));
           emailTxtOw.setBackground(clr);
           emailTxtOw.setForeground(Color.black);
           
           emailTxtOw.setBounds(62, 70, 220, 30);
           emailTxtOw.setBorder(TextField);
            
           password.setFont(new Font("Plain", Font.BOLD, 15));
           password.setForeground(Color.BLACK);
           password.setBounds(60, 120, 200, 22);
           
            
           passow.setFont(new Font("Arial", Font.ITALIC, 17));
           passow.setBackground(clr);
           passow.setForeground(Color.black);
           passow.setBounds(62, 150, 220, 30);
           passow.setBorder(TextField);
           
           //Login Button
            button1.setFont(new Font("Plain", Font.BOLD, 15));
            button1.setBackground( Color.GREEN);
           button1.setForeground(Color.BLACK);
           button1.setBounds(110, 200, 120, 35);
           button1.setBorder(buttonbrdr);
           
           
            //Button event of Login Button
             button1.addActionListener((ActionEvent e) -> {
                 //To change body of generated methods, choose Tools | Templates.
                 if(e.getSource()==button1)
                 {
 
                     checkownerId=emailTxtOw.getText();
                     checkownerpass=passow.getText();
                     
                     
                     if((checkownerId.trim().equalsIgnoreCase("admin")) &&(checkownerpass.trim().equalsIgnoreCase("787878")) )
                     {
                         JOptionPane.showMessageDialog(null,"Congratulations! Logged in SuccessFully " );
                         HomePage homePage = new HomePage(null);
                         frame2.dispose();
                         
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(null, "Sorry!  Account does'nt Exist  ","ERROR",JOptionPane.ERROR_MESSAGE);
                         
                         
                         
                         
                     }
                     
                 }
   });
            
            
            //Adding Label to Frame
      
            
            //Adding Components to Label
           frame2.add(UserEmail);
           frame2.add(emailTxtOw);
             frame2.add(password);
             frame2.add(passow);
            frame2.add(button1);
           
        
     
        frame2.setVisible(true);
        
   
   
   }
    
   
   
   
}

    

