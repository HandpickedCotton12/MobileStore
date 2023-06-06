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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Payments extends JFrame{
    //Object of Login Class
    Login loginobj= new Login();
    
    
    //Creating Borders for Lables Panles and Buttons etc
    Border TextField = BorderFactory.createLineBorder(Color.RED, 1,true);
    Border brdr= BorderFactory.createLineBorder(Color.YELLOW, 3, true);
              Border panelbrdr= BorderFactory.createLineBorder(Color.RED, 3, true);
              Border buttonbrdr= BorderFactory.createLineBorder(Color.MAGENTA, 3, true);
    
              
              //Creating Page Frame
     JFrame pgframe = new JFrame("Payments");
     
      Double price;
     String AccountNumber,Items;
      
     
     //Creating panels
      JPanel AccontLogin = new JPanel(null);
      JPanel AccontDetails = new JPanel(null);
    
      
     
     
      
       //Creating Labels
        JLabel ACCPIN= new JLabel("ACCOUNT No: ");
      JLabel PIN= new JLabel("PIN: ");
      JLabel Username= new JLabel("Account Holder: ");
      JLabel AccNo= new JLabel("Account No.: ");
      JLabel Bill = new JLabel("Bill: ");
        JLabel bill= new JLabel();
      JLabel paying= new JLabel("Payment Details");
       JLabel dtls=new JLabel("  ID                          Name                   Price                             Specs");
        JLabel backgrnd = new JLabel();
       
        
        //Creating Text Fields
      JTextField username = new JTextField();
      JTextField accNo = new JTextField();
        JTextArea accpin= new JTextArea();
        JPasswordField pin= new JPasswordField();
        
    
       //Creating Buttons
         JButton Login = new JButton("Login");
           JButton confirm = new JButton("Confirm Payment");
               JButton save = new JButton("Save and Exit");
                JButton Track = new JButton("Track Order");
             
                
                Timer timer;
                int Seconds=0;
        
     public Payments(String item,Double price)
     {
         
         
         
         //Frame Properties
            this.Items=item;
            this.price=price;
         pgframe.setLayout(null);
        pgframe.setSize(1200, 700);
        pgframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          pgframe.setLocation(50, 30);
         
          
        
         
          
         //Designing Labels and TextFields
         AccontLogin.setBounds(20, 20, 340, 280);
         AccontLogin.setBorder(brdr);
         AccontLogin.setBackground(new Color(202,0,42,80));
         
         
         
         ACCPIN.setFont(new Font("Plain", Font.BOLD, 18));
           ACCPIN.setForeground(Color.YELLOW);
           ACCPIN.setBounds(80, 40,140, 25);
         AccontLogin.add(ACCPIN);
       
         accpin.setBorder(TextField);
         accpin.setFont(new Font("ARIal",Font.PLAIN,17));
         accpin.setBounds(95, 70, 180, 35);
         accpin.setBackground(Color.BLACK);
         accpin.setForeground(Color.WHITE);
          
       
         PIN.setFont(new Font("Plain", Font.BOLD, 18));
           PIN.setForeground(Color.YELLOW);
           PIN.setBounds(80, 120,100, 25);
         AccontLogin.add(PIN);
         
         
         pin.setBorder(TextField);
         pin.setFont(new Font("ARIal",Font.PLAIN,19));
         pin.setBounds(95, 150, 180, 35);
         pin.setBackground(Color.BLACK);
         pin.setForeground(Color.WHITE);
         
         
         Login.setFont(new Font("Plain", Font.BOLD, 15));
            Login.setBackground( Color.GREEN);
           Login.setForeground(Color.BLACK);
           Login.setBorder(buttonbrdr);
           Login.setBounds(120, 210, 120, 35);
           
           
           AccontDetails.setBounds(450, 100, 600, 400);
           AccontDetails.setBackground(new Color(47,141, 255, 80));
           AccontDetails.setBorder(panelbrdr);
              
           paying.setBounds(200, 20, 200, 35);
           paying.setForeground(Color.BLACK);
           paying.setFont(new Font("  ",Font.ROMAN_BASELINE,26));
           paying.setBorder(brdr);
           AccontDetails.add(paying);
           
           Username.setFont(new Font("Plain", Font.BOLD, 18));
           Username.setForeground(Color.YELLOW);
           Username.setBounds(130, 100,200, 25);
         AccontDetails.add(Username);
           
           username.setBorder(TextField);
         username.setFont(new Font("ARIal",Font.BOLD,18));
         username.setBounds(145, 130, 200, 35);
        username.setBackground(Color.BLACK);
         username.setForeground(Color.WHITE);
         username.setText(" "+loginobj.Username);
           AccontDetails.add(username);
           
           
           AccNo.setFont(new Font("Plain", Font.BOLD, 18));
           AccNo.setForeground(Color.YELLOW);
           AccNo.setBounds(130, 180,200, 25);
         AccontDetails.add(AccNo);
         
         accNo.setBorder(TextField);
         accNo.setFont(new Font("ARIal",Font.BOLD,15));
         accNo.setBounds(145, 210, 200, 35);
         accNo.setBackground(Color.BLACK);
         accNo.setForeground(Color.WHITE);
         
         AccontDetails.add(accNo);
         
         
         Bill.setFont(new Font("Plain", Font.BOLD, 18));
           Bill.setForeground(Color.YELLOW);
           Bill.setBounds(130, 260,100, 25);
         AccontDetails.add(Bill);
         
         bill.setFont(new Font("Plain", Font.BOLD, 18));
           bill.setForeground(Color.BLACK);
           bill.setBounds(160, 300,170, 30);
           bill.setBorder(brdr);
           bill.setText("  "+price+" PKR");
         AccontDetails.add(bill);
         
         
         
         //Designing Buttons
         confirm.setFont(new Font("Plain", Font.BOLD, 15));
            confirm.setBackground( Color.GREEN);
           confirm.setForeground(Color.BLACK);
           confirm.setBorder(buttonbrdr);
           confirm.setBounds(390, 350, 200, 35);
           AccontDetails.add(confirm);
           
         AccontDetails.setVisible(false);
         AccontLogin.add(accpin);
         AccontLogin.add(pin);
         AccontLogin.add(Login);
         pgframe.add(AccontLogin);
         pgframe.add(AccontDetails);
         
         
         pgframe.setVisible(true);
     
         
         
         
         //Button event of Login button
         Login.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                     //To change body of generated methods, choose Tools | Templates.
                     
                     if(e.getSource()==Login)
                     {
                         
                         AccountNumber =accpin.getText();
                         accNo.setText("  "+AccountNumber);
                         
                        AccontLogin.setVisible(false);
                        AccontDetails.setVisible(true);
                     }
                }
         });
         
         //Button event of Confirm Button
       confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  
                    
                    
                    if (e.getSource()==confirm) {
                        JOptionPane.showMessageDialog(null,"Receipt Generated SuccessFully");
                           new Payments(Items,price,0);
                           pgframe.dispose();
                    }
                }
       });
     }
 public Payments(String catchItem, Double catchprice,int a)
 {
 
     String catchedproduct=catchItem;
     Double catcehdprice = catchprice;
     
     
     
     //Creating Frame
   JFrame pgframe1= new JFrame();
     pgframe1.setTitle("Receipt");
       pgframe1.setLayout(null);
        pgframe1.setSize(900, 700);
        pgframe1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          pgframe1.setLocation(50, 30);
     
          
          
                     
                     
                     //Desiging Labels, Panles and Text Fields
                     AccontDetails.setBounds(40, 30, 740, 600);
           AccontDetails.setBackground(new Color(230,0, 255, 80));
           AccontDetails.setBorder(panelbrdr);
                     
           
            ACCPIN.setFont(new Font("Plain", Font.BOLD, 18));
           ACCPIN.setForeground(Color.BLACK);
           ACCPIN.setText("RECEIPT DETAILS");
 
           ACCPIN.setBounds(280, 30,170, 25);
           ACCPIN.setBorder(brdr);
         AccontDetails.add(ACCPIN);
           
                     Username.setFont(new Font("Plain", Font.BOLD, 20));
           Username.setForeground(Color.BLACK);
           Username.setText("NAME: ");
 
           Username.setBounds(50, 100,150, 30);
         AccontDetails.add(Username);
         
         
         
          AccNo.setFont(new Font("Plain", Font.BOLD, 18));
           AccNo.setForeground(Color.WHITE);
          AccNo.setText("  "+loginobj.Username);
            AccNo.setBorder(TextField);
         AccNo.setBackground(Color.BLACK);
         AccNo.setOpaque(true);
           AccNo.setBounds(250, 100,220, 30);
         AccontDetails.add(AccNo);
         
         
                     
         PIN.setFont(new Font("Plain", Font.BOLD, 20));
           PIN.setForeground(Color.BLACK);
           PIN.setText("CONTACT No.: ");
 
           PIN.setBounds(50, 160,150, 30);
         AccontDetails.add(PIN);
         
         
          Bill.setFont(new Font("Plain", Font.BOLD, 18));
           Bill.setForeground(Color.WHITE);
          Bill.setText("  "+loginobj.Usercontact);
            Bill.setBorder(TextField);
         Bill.setBackground(Color.BLACK);
         Bill.setOpaque(true);
           Bill.setBounds(250, 160,220, 30);
         AccontDetails.add(Bill);
         
        JLabel adress = new JLabel();
         adress.setFont(new Font("Plain", Font.BOLD, 20));
           adress.setForeground(Color.BLACK);
          adress.setText("Address: ");
      AccontDetails.add(adress);
           adress.setBounds(50, 220,150, 30);
         AccontDetails.add(PIN);
         
         
          bill.setFont(new Font("Plain", Font.BOLD, 18));
           bill.setForeground(Color.WHITE);
          bill.setText("  "+loginobj.Useradress);
            bill.setBorder(TextField);
         bill.setBackground(Color.BLACK);
         bill.setOpaque(true);
           bill.setBounds(250, 220,220, 30);
         AccontDetails.add(bill);
         
         
         
         dtls.setBounds(30, 280, 720, 20);
           dtls.setFont(new Font("Plain", Font.BOLD, 18));
          
                   
           dtls.setForeground(Color.BLACK);
         AccontDetails.add(dtls);
         
         JLabel itemdetails= new JLabel();
          itemdetails.setBounds(17, 310, 717, 25);
           itemdetails.setFont(new Font("Plain", Font.PLAIN, 15));
          itemdetails.setText(catchedproduct);
            itemdetails.setBorder(TextField);
         itemdetails.setBackground(Color.BLACK);
         itemdetails.setOpaque(true);
                   
           itemdetails.setForeground(Color.CYAN);
         AccontDetails.add(itemdetails);
        
         
         
         JLabel amount= new JLabel("Ammount Paid:");
         
         amount.setFont(new Font("Plain", Font.BOLD, 19));
           amount.setForeground(Color.BLACK);
          
     
           amount.setBounds(50,360 ,220, 30);
         AccontDetails.add(amount);
         
         
         JLabel price= new JLabel();
                 
           price.setFont(new Font("Plain", Font.BOLD | Font.ITALIC, 18));
           price.setForeground(Color.WHITE);
          price.setText("    "+catcehdprice+" PKR");
            price.setBorder(TextField);
         price.setBackground(Color.BLACK);
         price.setOpaque(true);
           price.setBounds(250, 360,220, 30);
         AccontDetails.add(price);
         
         
         JLabel Thanks= new JLabel("THANKS FOR SHOPPING");
         
                  Thanks.setFont(new Font("Plain", Font.BOLD, 20));
           Thanks.setForeground(Color.BLACK);
          
     
           Thanks.setBounds(235,460 ,245, 30);
           Thanks.setBorder(TextField);
         AccontDetails.add(Thanks);
         
         JLabel Logo= new JLabel("A & S MOBILE STORE");
         
         Logo.setFont(new Font("Plain", Font.BOLD, 19));
           Logo.setForeground(Color.BLACK);
          
     
           Logo.setBounds(500,490 ,220, 30);
         AccontDetails.add(Logo);
         
         
         //Designing Button
         save.setFont(new Font("Plain", Font.BOLD, 15));
            save.setBackground( Color.GREEN);
           save.setForeground(Color.BLACK);
           save.setBorder(buttonbrdr);
           save.setBounds(100, 530, 170, 35);
         AccontDetails.add(save);
         
          //Designing Button
         Track.setFont(new Font("Plain", Font.BOLD, 15));
            Track.setBackground( Color.GREEN);
           Track.setForeground(Color.BLACK);
           Track.setBorder(buttonbrdr);
           Track.setBounds(510, 530, 170, 35);
         AccontDetails.add(Track);
         
         
         
         
         
                     pgframe1.add(AccontDetails);
                     
                     
                    
         pgframe1.setVisible(true);
         
         
         
         //Button event of Save button
         save.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
              //To change body of generated methods, choose Tools | Templates.
              
              if(e.getSource()==save)
              {
              
              JOptionPane.showMessageDialog(null,"Receipt Saved SuccessFully");
              pgframe1.dispose();
              System.exit(0);
                      
              }
         }
         });
         
         
         
         
         
         Track.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             //To change body of generated methods, choose Tools | Templates.
         
            
             
          new Payments(0);
         }
         });
         
         
        }
 
 
 
 
 public Payments(int a)
 {
 
  //Creating Frame
   JFrame pgframe1= new JFrame();
     pgframe1.setTitle("Receipt");
       pgframe1.setLayout(null);
        pgframe1.setSize(350, 200);
        pgframe1.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
          pgframe1.setLocation(200, 100);
     JLabel Name = new JLabel("Enter Product ID: ");
       Name.setFont(new Font("Plain", Font.BOLD, 15));
           Name.setForeground(Color.BLACK);
           Name.setBounds(30, 10, 300, 50);
        
           
           JTextField nameTxt= new JTextField();
          nameTxt.setFont(new Font("Arial", Font.BOLD, 19));
           nameTxt.setBackground(Color.BLACK);
           nameTxt.setForeground(Color.white);
           nameTxt.setBounds(110, 50, 100, 30);
            nameTxt.setBorder(TextField);
 
              JButton Track= new JButton("Track");
             Track.setFont(new Font("Plain", Font.BOLD, 15));
            Track.setBackground( Color.GREEN);
           Track.setForeground(Color.BLACK);
           Track.setBorder(buttonbrdr);
           Track.setBounds(110, 85, 170, 35);
           
           JButton Exit= new JButton("E X I T");
             Exit.setFont(new Font("Plain", Font.BOLD, 15));
            Exit.setBackground( Color.GREEN);
           Exit.setForeground(Color.BLACK);
           Exit.setBorder(buttonbrdr);
           Exit.setBounds(110, 120, 170, 35);
         
           
          
           
           
           Track.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           //To change body of generated methods, choose Tools | Templates.
      
           if(e.getSource()==Track)
           {
               
               
               
               
           String proID=nameTxt.getText();
           Double ProductId=Double.parseDouble(proID);
            
             timer = new Timer(100,new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                    Seconds++;
                 }
             });
             
             timer.start();
       
  
           
           
              
           
           
           if((ProductId>=0)&&(ProductId<100))
           {
           
           
               if((Seconds>=0)&&(Seconds<100))
               
                   JOptionPane.showMessageDialog(null,"Order Confirmed");
           
           
               
               else if((Seconds>=101)&&(Seconds<300))
               
                   JOptionPane.showMessageDialog(null,"Order is Departing from Store");
               
                
               else if((Seconds>=301)&&(Seconds<500))
               
                   JOptionPane.showMessageDialog(null,"Order is On the Way");
               
                
               else if((Seconds>=501)&&(Seconds<1000000000))
               
                   JOptionPane.showMessageDialog(null,"Order picked Up");
               
           }
           
           
           else
           {
           
           JOptionPane.showMessageDialog(null, "Sorry! Enter a Valid Product ID  ","ERROR",JOptionPane.ERROR_MESSAGE);
           
           }
           }
       
       
       
       }
           });
           
           Exit.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           //To change body of generated methods, choose Tools | Templates.
      
       pgframe1.dispose();
       pgframe.dispose();
       
       
       }
           });
           
           
           
            pgframe1.add(Track);
            pgframe1.add(Exit);
            pgframe1.add(Name);
            pgframe1.add(nameTxt);
            pgframe1.setVisible(true);
            
 }
     }

    

