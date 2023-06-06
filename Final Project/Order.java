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
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
 
public class Order extends JFrame {
    
    //Creating frame
    JFrame frame1= new JFrame("Payment Methods");
    
    //Creating Text Field
    JTextArea Area = new JTextArea("Item Details");
    
        String Product;
    Double price;
    
    //Craeting panels
    JPanel Itemdetails = new JPanel(null);
    JPanel Pricedetails = new JPanel(null);
    JPanel PayMethods = new JPanel(null);
    JPanel Dtls= new JPanel(null);
     JPanel onln = new JPanel(null);
   
    //Creating Labels
    JLabel itemdetails = new JLabel("Product Details");
    JLabel dtls=new JLabel("  ID                   Name                   Price                             Specs");
   JLabel payMethods = new JLabel("Paying Methods");
   JLabel backgrnd = new JLabel();
    
   
   //Creating Buttons
    JButton proceed= new JButton("Proceed");
    JButton onlnproceed= new JButton("Proceed");
    JButton cancel = new JButton("Cancel");
    
    
    //Creating radio buttons
    JRadioButton Online =new  JRadioButton("Online Methods");
    JRadioButton creditcard=new  JRadioButton("Credit Card ");
     JRadioButton EasyPaisa =new  JRadioButton("EasyPaisa");
      JRadioButton JazzCash =new  JRadioButton("JazzCash");
    
               //Creating Borders for Lables Panles and Buttons etc
             Border brdr= BorderFactory.createLineBorder(Color.YELLOW, 3, true);
              Border panelbrdr= BorderFactory.createLineBorder(Color.BLACK, 3, true);
              Border buttonbrdr= BorderFactory.createLineBorder(Color.MAGENTA, 3, true);
              
              //Creating Two Button Groups
              ButtonGroup grp2= new ButtonGroup();
              ButtonGroup grp3 = new ButtonGroup();
              
    public Order(String item, double price)
    {
    
          this.Product=item;
          this.price=price;
        
          
          //Frame Properties
        frame1.setLayout(null);
        frame1.setSize(1200, 700);
        frame1.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          frame1.setLocation(50, 30);
         
       
                     
                     
                     
                     //Desining labels, panels and Text fields 
                      Itemdetails.setBounds(650, 110,165 , 50);
          Itemdetails.setBackground(new Color(255, 0, 0, 80));
          Itemdetails.setBorder(panelbrdr);
          frame1.add(Itemdetails);
          
          
          
          itemdetails.setFont(new Font("Plain", Font.BOLD, 20));
           itemdetails.setForeground(Color.BLACK);
         itemdetails.setBounds(10, 2, 165, 45);
   Itemdetails.add(itemdetails);
          
            Dtls.setBounds(400, 170,730 , 30);
            Dtls.setBorder(brdr);
          Dtls.setBackground(new Color(230, 0, 255, 50));
          frame1.add(Dtls);
          
           dtls.setBounds(10, 2, 730, 20);
           dtls.setFont(new Font("Plain", Font.BOLD, 21));
           dtls.setForeground(Color.BLACK);
           
         Dtls.add(dtls);
                     
         
          Pricedetails.setBounds(910, 250,220 , 30);
          Pricedetails.setBorder(buttonbrdr);
          Pricedetails.setBackground(Color.BLACK);
          frame1.add(Pricedetails);   
          
         JLabel pricedetails = new JLabel("Price is : "+price+" PKR");
         
          pricedetails.setFont(new Font("Plain", Font.ITALIC, 18));
           pricedetails.setForeground(Color.CYAN);
         
          
           pricedetails.setBounds(5, 0, 220, 30);
          Pricedetails.add(pricedetails);
          
          PayMethods.setBorder(brdr);
          PayMethods.setBounds(600, 300,250 , 200);
          PayMethods.setBackground(new Color(228, 0, 224, 80));
          frame1.add(PayMethods);
          
          //Designing Buttons
          onln.setBorder(buttonbrdr);
          onln.setBounds(852, 340,130 , 90);
          onln.setBackground(new Color(228, 0, 0, 80));
          frame1.add(onln);
          
          payMethods.setFont(new Font("Plain", Font.BOLD, 18));
           payMethods.setForeground(Color.BLACK);
         
         
           payMethods.setBounds(50, 0,170, 20);
          PayMethods.add(payMethods);
          
          
          
          
          Online.setFont(new Font("FF", Font.BOLD, 15));
          Online.setForeground(Color.BLACK);
          Online.setBounds(50,50 , 150, 35);
            Online.setBackground(Color.GREEN);
             PayMethods.add(Online);
             
             
            EasyPaisa.setFont(new Font("FF", Font.BOLD, 15));
          EasyPaisa.setForeground(Color.BLACK);
          EasyPaisa.setBounds(4,4 , 128, 20);
            EasyPaisa.setBackground(Color.YELLOW);
            onln.add(EasyPaisa);
            
             JazzCash.setFont(new Font("FF", Font.BOLD, 15));
          JazzCash.setForeground(Color.WHITE);
          JazzCash.setBounds(4,30 , 127, 20);
            JazzCash.setBackground(Color.BLACK);
            onln.add(JazzCash);
            
            onlnproceed.setFont(new Font("Arial",Font.BOLD,13));
                onlnproceed.setBackground(Color.GREEN);
                onlnproceed.setForeground(Color.BLACK);
               onlnproceed.setBounds(17, 60,90,25);
              onlnproceed.setBorder(buttonbrdr);
                onln.add(onlnproceed);
                
                //Adding Radio Buttons to the Button Group
            grp3.add(EasyPaisa);
            grp3.add(JazzCash);
           
            
            
            
            
             creditcard.setFont(new Font("FF", Font.BOLD, 15));
          creditcard.setForeground(Color.BLACK);
          creditcard.setBounds(50,120 , 150, 35);
           creditcard.setBackground(Color.YELLOW);
          
           PayMethods.add(creditcard);
           
           
           //Adding Radio Buttons to the Button Group
           grp2.add(creditcard);
           grp2.add(Online);
           
                   Area.setBounds(400, 200, 730, 21);
                   Area.setFont(new Font("Arial", Font.BOLD, 15));
                   Area.setForeground(Color.GREEN);
                   Area.setBackground(Color.BLACK);
                   Area.setText(Product);
                   
                  
                   
                   proceed.setFont(new Font("Arial",Font.BOLD,14));
                proceed.setBackground(Color.GREEN);
                proceed.setForeground(Color.BLACK);
                proceed.setBounds(750, 515, 100,30);
                proceed.setBorder(buttonbrdr);
                frame1.add(proceed);
                   
                
                 cancel.setFont(new Font("Arial",Font.BOLD,14));
                cancel.setBackground(Color.RED);
                cancel.setForeground(Color.BLACK);
                cancel.setBorder(buttonbrdr);
                cancel.setBounds(600, 515, 100,30);
               frame1.add(cancel);
                
                   
               onln.setVisible(false);
                   frame1.add(Area);
                   
            
               
                frame1.setVisible(true);
                
                
                
                //Button Event of Proceed Button
    proceed.addActionListener((ActionEvent e) -> {
        //To change body of generated methods, choose Tools | Templates.
        
        
        if(e.getSource()==proceed)
        {
            
            if (creditcard.isSelected()) {
                
                Payments payments = new Payments(Product,price);
                frame1.dispose();
            }
            
            else if(Online.isSelected())
            {
                onln.setVisible(true);
                onlnproceed.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //To change body of generated methods, choose Tools | Templates.
                        
                        if (EasyPaisa.isSelected())
                        {
                            Payments payments=new Payments(Product,price);
                            frame1.dispose();
                        }
                        else if(JazzCash.isSelected())
                        {
                            Payments payments=new Payments(Product,price);
                            frame1.dispose();
                        }
                        
                        else
                        {
                            
                            JOptionPane.showMessageDialog(null,"No Method is Selected","ERROR",JOptionPane.ERROR_MESSAGE);
                            
                        }
                    }
                });
                
            }
            
            
            else
            {
                JOptionPane.showMessageDialog(null,"No Method is Selected","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        }   });
    
    
    
    //Button Event of Cancel Button
    cancel.addActionListener((ActionEvent e) -> {
        if (e.getSource()==cancel)
        {
            
            frame1.dispose();
        }
          });
    }
    
    
    
}
 
