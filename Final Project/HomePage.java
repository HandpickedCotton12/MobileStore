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
import javax.swing.ButtonGroup;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
 
public class HomePage extends JFrame{
  
   //Object of Login Class
   Login lgnobj = new Login();
 
   
       //Creating Frames 
      JFrame pgframe= new JFrame("A & S Mobile Store");
      
      
      //Creating Lables
      JLabel backgrnd = new JLabel();
          JLabel Name= new JLabel("Name:");
           JLabel Contcat= new JLabel("Contact No:");
            JLabel Adress= new JLabel("Adress:");
             JLabel email= new JLabel("Email Adress:");
              JLabel username,usercontact,useradress,useremail;
              
              
              //Creating Radio Buttons and a Button Group
            ButtonGroup Grp1 = new ButtonGroup();
             JRadioButton HButton= new JRadioButton("H U A W E I");
             JRadioButton SButton= new JRadioButton("S A M S U N G");
             JRadioButton  IButton= new JRadioButton("I P H O N E");
              JButton products= new JButton("PRODUCTS");
             
             //Declaring Strings and getting info from Login Class
             String getname = lgnobj.Username;
             String getcontact = lgnobj.Usercontact;
             String getadress = lgnobj.Useradress;
            String getemail = lgnobj.Useremail;
            
             //Creating Borders for Lables Panles and Buttons etc
             Border brdr= BorderFactory.createLineBorder(Color.YELLOW, 3, true);
              Border panelbrdr= BorderFactory.createLineBorder(Color.BLACK, 3, true);
              Border buttonbrdr= BorderFactory.createLineBorder(Color.MAGENTA, 3, true);
            
            
            
            int index;
         
           
    public HomePage()
    {
        //initializing Lables
        this.username = new JLabel(getname);
       this.usercontact = new JLabel(getcontact);
        this.useradress = new JLabel(getadress);
        this.useremail = new JLabel(getemail);
    
        //Page Frame Properties
        pgframe.setLayout(null);
        pgframe.setSize(1200, 700);
        pgframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          pgframe.setLocation(50, 30);
         
          
            
           //Creating  a panels and setting it out and putting it in backgrnd label
          JPanel cnr= new JPanel();
          cnr.setLayout(null);
          cnr.setBounds(190, 180,400 , 400);
          cnr.setBorder(panelbrdr);
          cnr.setBackground(new Color(47,141,255,80));
          pgframe.add(cnr);
          
          
           JPanel cnr1= new JPanel();
          cnr1.setLayout(null);
          cnr1.setBounds(450, 30,300 , 100);
          cnr1.setBorder(panelbrdr);
          cnr1.setBackground(new Color(140,255,255,50));
          pgframe.add(cnr1);
          
          JPanel cnr2= new JPanel();
          cnr2.setLayout(null);
          cnr2.setBorder(panelbrdr);
          cnr2.setBounds(650, 400,220 , 50);
          cnr2.setBackground(new Color(255, 0, 0, 80));
          pgframe.add(cnr2);
          
          
          //Designing Labels
          JLabel strnm= new JLabel("A & S MOBILE STORE");
          JLabel Signup = new JLabel("WELCOME TO");
          JLabel ctgrs = new JLabel("Categories");
          
          
          //Designing Buttons
          HButton.setFont(new Font("FF", Font.BOLD, 15));
          HButton.setForeground(Color.BLACK);
       
          HButton.setBounds(690,470 , 130, 30);
          HButton.setBackground(Color.red);
          
          SButton.setFont(new Font("FF", Font.BOLD, 15));
          SButton.setForeground(Color.BLACK);
          SButton.setBounds(690,510 , 130, 30);
            SButton.setBackground(Color.CYAN);
            
            
          IButton.setFont(new Font("FF", Font.BOLD, 15));
          IButton.setForeground(Color.BLACK);
          IButton.setBounds(690,550 , 130, 30);
            IButton.setBackground(Color.GREEN);
            
            products.setBounds(700, 600, 110, 35);
            products.setFont(new Font("", Font.BOLD, 12));
           products.setBackground(Color.YELLOW);
           products.setForeground(Color.BLACK);
           products.setBorder(buttonbrdr);
          
           
           //Adding Buttons to the Label
          pgframe.add(HButton);
          pgframe.add(SButton);
          pgframe.add(IButton);
           pgframe.add(products);
          
           
           //Adding Radio Buttons to a button Group
          Grp1.add(HButton);
          Grp1.add(SButton);
          Grp1.add(IButton);
         
          
          //Designing Panles 
           ctgrs.setFont(new Font("Plain", Font.BOLD, 23));
           ctgrs.setForeground(Color.BLACK);
         
           
           ctgrs.setBounds(40, 2, 132, 45);
          cnr2.add(ctgrs);
        
          Signup.setFont(new Font("Ahadori", Font.BOLD,20));
          Signup.setBounds(75, 10, 200, 35);
          Signup.setForeground(Color.RED);
          cnr1.add(Signup);
          
          strnm.setFont(new Font("Ahadori", Font.BOLD,20));
          strnm.setBounds(38, 40, 230, 35);
          strnm.setForeground(Color.BLACK);
          cnr1.add(strnm);
          
          
          //Designing Labels and adding them to Panles 
          Name.setFont(new Font("Plain", Font.BOLD, 20));
           Name.setForeground(Color.BLACK);
           Name.setBounds(30, 70, 200, 50);
          cnr.add(Name);
          
         
           username.setFont(new Font("Plain", Font.BOLD, 17));
           username.setForeground(Color.WHITE);
         
           username.setBorder(brdr);
           username.setBounds(180, 70, 180, 50);
          cnr.add(username);
          
          
          
          Contcat.setFont(new Font("Plain", Font.BOLD, 20));
           Contcat.setForeground(Color.BLACK);
           Contcat.setBounds(30, 140, 150, 50);
          cnr.add(Contcat);
          
          
           usercontact.setFont(new Font("Plain", Font.ITALIC | Font.BOLD, 17));
           usercontact.setForeground(Color.CYAN);
           usercontact.setBorder(brdr);
           usercontact.setBounds(180, 140, 180, 50);
          cnr.add(usercontact);
           
          Adress.setFont(new Font("Plain", Font.BOLD, 20));
           Adress.setForeground(Color.BLACK);
           Adress.setBounds(30, 210, 150, 50);
          cnr.add(Adress);
          
          useradress.setFont(new Font("Plain", Font.BOLD, 16));
           useradress.setForeground(Color.BLACK);
           useradress.setBorder(brdr);
           useradress.setBounds(180, 210, 180, 50);
          cnr.add(useradress);
           
          email.setFont(new Font("Plain", Font.BOLD, 20));
           email.setForeground(Color.BLACK);
           email.setBounds(30, 280, 150, 50);
          cnr.add(email);
          
           useremail.setFont(new Font("Plain", Font.HANGING_BASELINE, 17));
           useremail.setForeground(Color.BLACK);
           useremail.setBorder(brdr);
           useremail.setBounds(180, 280, 180, 50);
          cnr.add(useremail);
          
          
          //Button event of Products Button
          products.addActionListener((ActionEvent e) -> {
              //To change body of generated methods, choose Tools | Templates.
              
              if (HButton.isSelected())
              {
                  Items items = new Items(0);
              }
              
              else if (SButton.isSelected())
              {
                  
                  
                  Items items = new Items(0, 0);
                  
              }
              else if (IButton.isSelected())
              {
                  Items items = new Items(0,0,0);
                  
              }
              
              else
              {
                  JOptionPane.showMessageDialog(null, "Sorry! No Category is Selected");
                  
              }
        });
          
          
       //Adding backgrnd label containing an image too to the page frame
          
         pgframe.setVisible(true);
    
    
    }
    
    
    
    public HomePage(String owner)
    {
        
        
        
        //Creating Labels
     JLabel strnm= new JLabel("A & S MOBILE STORE");
          JLabel Signup = new JLabel("WELCOME TO");
          JLabel ctgrs = new JLabel("C a t e g o r i e s");
          JLabel cnr3Backgrnd= new JLabel();
          
          
          //Frame Properties
     pgframe.setLayout(null);
        pgframe.setSize(1200, 745);
        pgframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          pgframe.setLocation(50, 0);
         
          
          
       
    
                     
    
                     
                     //Creating panles and designing them and adding them to labels
                     JPanel cnr1= new JPanel();
          cnr1.setLayout(null);
          cnr1.setBounds(420, 30,300 , 250);
          cnr1.setBorder(brdr);
          cnr1.setBackground(new Color(255,255,0,90));
          pgframe.add(cnr1);
                     
          JPanel cnr2= new JPanel();
          cnr2.setLayout(null);
         cnr2.setBorder(brdr);
          cnr2.setBounds(420, 370,290 , 50);
          cnr2.setBackground(new Color(255, 0, 0, 100));
          pgframe.add(cnr2);
          
          
        
          
          
          //Designing Labels
          Signup.setFont(new Font("Ahadori", Font.BOLD,22));
          Signup.setBounds(75, 30, 200, 35);
          Signup.setForeground(Color.RED);
          cnr1.add(Signup);
          
          strnm.setFont(new Font("Ahadori", Font.BOLD,23));
          strnm.setBounds(35, 170, 290, 35);
          strnm.setForeground(Color.BLACK);
          cnr1.add(strnm);
          
          
          ctgrs.setFont(new Font("Plain", Font.BOLD, 23));
           ctgrs.setForeground(Color.WHITE);
         
           
           ctgrs.setBounds(55, 2, 270, 45);
          cnr2.add(ctgrs);
          //Desiging Buttons
          HButton.setFont(new Font("FF", Font.BOLD, 15));
          HButton.setForeground(Color.BLACK);
       
          HButton.setBounds(110,580 , 190, 50);
          HButton.setText("    H   U   A   W   E   I   ");
          HButton.setBackground(Color.red);
         
          SButton.setFont(new Font("FF", Font.BOLD, 15));
          SButton.setForeground(Color.BLACK);
          SButton.setBounds(335,580 , 190, 50);
          SButton.setText("    S  A  M  S  U  N  G ");
            SButton.setBackground(Color.CYAN);
            
            
          IButton.setFont(new Font("FF", Font.BOLD, 15));
          IButton.setForeground(Color.BLACK);
          IButton.setBounds(558,580 , 190, 50);
          IButton.setText("    I   P   H   O   N   E");
            IButton.setBackground(Color.GREEN);
          
            
              products.setBounds(230, 660, 400, 35);
            products.setFont(new Font("", Font.BOLD, 18));
           products.setBackground(Color.YELLOW);
           products.setText(" M           O           D            I            F            Y");
           products.setForeground(Color.BLACK);
           products.setBorder(buttonbrdr);
          
           
           //adding Buttons to the Labels
          pgframe.add(HButton);
          pgframe.add(SButton);
         pgframe.add(IButton);
           pgframe.add(products);
          
           
           
           //Adding radio buttons to a Button Group
          Grp1.add(HButton);
          Grp1.add(SButton);
          Grp1.add(IButton);
            
            
        
        
          pgframe.setVisible(true);
          
          
          
          
          
          
          
          //Button event of Products Button
          products.addActionListener((ActionEvent e) -> {
              //To change body of generated methods, choose Tools | Templates.
              
              if (HButton.isSelected())
              {
                  Settings settings = new Settings();
              }
              
              else if (SButton.isSelected())
              {
                  
                  Settings settings=new Settings(0);
                  
                  
              }
              else if (IButton.isSelected())
              {
                  Settings settings=new Settings(0, 0);
                  
              }
              
              else
              {
                  JOptionPane.showMessageDialog(null, "Sorry! No Category is Selected");
                  
              }
     });
          
          
          
          
          
          
          
    }

    
    }




    

