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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
 

public class Main extends JFrame{
    /**
     * @param args the command line arguments
     */
    
   
       //Creating object of Login Class
        Login loginObj= new Login();
       
        
        
       
             //Creating Borders for Lables Panels and Buttons etc
              Border buttonbrdr= BorderFactory.createLineBorder(Color.MAGENTA, 3, true);
              
              //Creating Labels
               JLabel l1,l2;
//Creating Buttons
    JButton B1 = new JButton("User Login");
    JButton B2 = new JButton("Owner Login");
    JButton B3 = new JButton("Sign Up");
       Main()
       {
      
           
           //Frame Properties
               setDefaultCloseOperation(EXIT_ON_CLOSE);
           setSize(400, 350);
         setLayout(null);
           setTitle("LOGIN PAGE");
           
           //Adding Image to the Label
         
          
          //Designing Buttons
          B1.setFont(new Font("TimesRoman",Font.BOLD | Font.ITALIC , 18));
          B1.setBounds(20, 50, 160, 60);
          B1.setBackground(Color.GREEN);
          B1.setBorder(buttonbrdr);
          B1.setForeground(Color.black);
          
           B2.setFont(new Font("Arial",Font.BOLD | Font.ITALIC, 18));
          B2.setBounds(190, 50, 160, 60);
          B2.setBackground(Color.GREEN);
          B2.setBorder(buttonbrdr);
          B2.setForeground(Color.black);
          
            B3.setFont(new Font("Arial",Font.TYPE1_FONT, 18));
          B3.setBounds(110, 160, 170, 60);
          B3.setBackground(Color.RED);
          B3.setForeground(Color.black);
          B3.setBorder(buttonbrdr);
          add(B1);
          add(B2);
          add(B3);
        setVisible(true);
       
       
       
       
      
               
           //Button Events of Buttons
              
              B1.addActionListener((ActionEvent e) -> {
                  loginObj.UserLogin();
               });
       
       
       
       
       
       
       
               
       
                     
              B2.addActionListener((ActionEvent e) -> {
                  loginObj.OwnerLogin();
               });
        B3.addActionListener((ActionEvent e) -> {
            loginObj.SignUp();
               });
       
       }
       
       
        
       
       
    public static void main(String[] args) {
        
  
  
   java.awt.EventQueue.invokeLater(() -> {
       //To change body of generated methods, choose Tools | Templates.
       
       Main obj1= new Main();
   });
   
   
   
    
    }
}


   
    

