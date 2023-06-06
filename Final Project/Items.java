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
import javax.swing.DefaultListModel;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;
 
public class Items extends JFrame{
    
  double s1;
    static int ind=0, flag;
    
    
    //Ceating Model for Lists
     DefaultListModel model= new DefaultListModel();
     
     //Creating Frame
    JFrame itemsframe= new JFrame("Available Items");
    
    
    //Creating panels
  JPanel panel = new JPanel();
    JPanel namepanel = new JPanel();
    
   JScrollPane srlpn;
   
   
   //Declaring JLists
    JList Hlist,Slist,Ilist;
 
  
 
    //Creating Labels
    JLabel backgrnd = new JLabel();
    JLabel Label1= new JLabel();
    JLabel Label2 = new JLabel();
          
    
    //Creating Buttons
    JButton buy= new JButton("Buy");
    JButton back = new JButton("Back");
    
    
    
      //Creating Borders for Lables Panles and Buttons etc
              Border brdr= BorderFactory.createLineBorder(Color.YELLOW, 3, true);
              Border listbrdr= BorderFactory.createLineBorder(Color.blue, 3, true);
              Border buttonbrdr= BorderFactory.createLineBorder(Color.MAGENTA, 3, true);
              
    /**
     *
     * @param a
     */
    public  Items(int a)
    {
        
        
        
        //Frame Properties
         itemsframe.setLayout(null);
        itemsframe.setSize(1300, 700);
        itemsframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          itemsframe.setLocation(50, 30);
         
          
     
                     
                     
                     
                     //Designing Panles and Adding them to Labels
    panel.setLayout(null);
          panel.setBounds(150, 160,1000 , 450);
          panel.setBackground(new Color(255,0,220,60));
          itemsframe.add(panel);
          
          namepanel.setLayout(null);
          namepanel.setBounds(510, 20, 230, 120);
          
          namepanel.setBackground(new Color(255,80,120,60));
          namepanel.setBorder(brdr);
         itemsframe.add(namepanel);
          
         
         //Designing Labels
          Label1.setText("H  U  A  W  E  I");
          Label1.setBounds(50, 5, 150,80);
          Label1.setFont(new Font("Arial",Font.BOLD,20));
          Label1.setForeground(Color.BLACK);
          namepanel.add(Label1);
          
          Label2.setText("PRODUCTS");
          Label2.setBounds(65, 40, 150,80);
          Label2.setFont(new Font("Arial",Font.BOLD,18));
          Label2.setForeground(Color.YELLOW);
          namepanel.add(Label2);
          
          
          
          //Passing String Array to the Lists 
          //Adding List to the ScrollPanel
          Hlist = new JList(Settings.Huawei);
          srlpn = new JScrollPane(Hlist);
          Hlist.setBackground(new Color(0,0,0));
          Hlist.setFont(new Font("Arial", Font.PLAIN, 18));
          Hlist.setForeground(Color.WHITE);
          Hlist.setSelectionBackground(Color.YELLOW);
          Hlist.setBorder(listbrdr);
          Hlist.setSelectionForeground(Color.BLACK);
          Hlist.setModel(model);
          
      //Adding Strings Elements to the List
      for (String Huawei : Settings.Huawei) {
          model.addElement(Huawei);
      }
                
              
                   panel.add(srlpn);
                   panel.setBorder(brdr);
          srlpn.setBounds(50, 60,900, 295);
          
          
          //Designing Buttons
            buy.setFont(new Font("Arial",Font.BOLD,15));
                buy.setBackground(Color.GREEN);
                buy.setForeground(Color.BLACK);
                buy.setBorder(buttonbrdr);
                buy.setBounds(700, 380, 120,35);
                panel.add(buy);
                
                back.setFont(new Font("Arial",Font.BOLD,15));
                back.setBackground(Color.RED);
                back.setForeground(Color.BLACK);
                back.setBorder(buttonbrdr);
                back.setBounds(130, 380, 120,35);
                panel.add(back);
                
                
                
                //Button Event of Buy Button
                buy.addActionListener((ActionEvent e) -> {
                    //To change body of generated methods, choose Tools | Templates.
                    
                    if(e.getSource()==buy)
                    {
                        
                        ind=Hlist.getSelectedIndex();
                        try{
                            if(ind !=0)
                            {
                                String passItem = (String) Hlist.getSelectedValue();
                                String price=Settings.priceH[ind];
                                Double passPrice = Double.parseDouble(price);
                                
                                Order order = new Order(passItem, passPrice);
                            }
                        }
                        catch(ArrayIndexOutOfBoundsException ex)
                        {
                            
                            JOptionPane.showMessageDialog(null,"Please Select a Product","ERROR",JOptionPane.ERROR_MESSAGE);
                            
                        }
                        
                        
                        
                        
                        
                    }
         });
                
                
                
                
                //Button Event of Back Button
                back.addActionListener((ActionEvent e) -> {
                    //To change body of generated methods, choose Tools | Templates.
                    if(e.getSource()==back)
                    {
                        ind=0;
                        
                        itemsframe.dispose();
                    }
         });
                
                
                
                
                
                     
                     itemsframe.setVisible(true);
    
    
    
    }
 public Items(int a,int b)
 {
       
     
      //Frame Properties
     itemsframe.setLayout(null);
        itemsframe.setSize(1300, 700);
        itemsframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          itemsframe.setLocation(50, 30);
         
        
                     
                     
                     
                      //Designing Panles and Adding them to Labels
    panel.setLayout(null);
          panel.setBounds(150, 160,1000 , 450);
          panel.setBackground(new Color(255,0,220,60));
          panel.setBorder(brdr);
          itemsframe.add(panel);
          
          
          
            //Designing Labels
          namepanel.setLayout(null);
          namepanel.setBounds(510, 20, 230, 120);
          namepanel.setBorder(brdr);
          namepanel.setBackground(new Color(255,80,120,60));
         itemsframe.add(namepanel);
          
          Label1.setText("S A M S U N G");
          Label1.setBounds(50, 5, 150,80);
          Label1.setFont(new Font("Arial",Font.BOLD,20));
          Label1.setForeground(Color.BLACK);
          namepanel.add(Label1);
          
          Label2.setText("PRODUCTS");
          Label2.setBounds(65, 40, 150,80);
          Label2.setFont(new Font("Arial",Font.BOLD,18));
          Label2.setForeground(Color.YELLOW);
          namepanel.add(Label2);
          
          
          
           //Passing String Array to the Lists 
          //Adding List to the ScrollPanel
          Slist = new JList(Settings.Samsung);
          srlpn = new JScrollPane(Slist);
          Slist.setBackground(new Color(0,0,0));
          Slist.setFont(new Font("Arial", Font.PLAIN, 18));
          Slist.setBorder(listbrdr);
          Slist.setForeground(Color.WHITE);
          Slist.setSelectionBackground(Color.YELLOW);
          Slist.setSelectionForeground(Color.BLACK);
            Slist.setModel(model);
          
      //Adding Strings Elements to the List
      for (String Samsung : Settings.Samsung) {
          model.addElement(Samsung);
      }
                
              
                   panel.add(srlpn);
          srlpn.setBounds(50, 60,900, 295);
          
          
           //Designing Buttons
            buy.setFont(new Font("Arial",Font.BOLD,15));
                buy.setBackground(Color.GREEN);
                buy.setForeground(Color.BLACK);
                buy.setBounds(700, 380, 120,35);
                buy.setBorder(buttonbrdr);
                panel.add(buy);
                
                back.setFont(new Font("Arial",Font.BOLD,15));
                back.setBackground(Color.RED);
                back.setForeground(Color.BLACK);
                 back.setBorder(buttonbrdr);
                back.setBounds(130, 380, 120,35);
                panel.add(back);
                
                
                 //Button Event of Buy Button
                buy.addActionListener((ActionEvent e) -> {
                    //To change body of generated methods, choose Tools | Templates.
                    
                    if(e.getSource()==buy)
                    {
                        try{
                            ind=Slist.getSelectedIndex();
                            
                            if(ind !=0)
                            {
                                
                                String passItem = (String) Slist.getSelectedValue();
                                String price=Settings.priceS[ind];
                                Double passPrice = Double.parseDouble(price);
                                
                                Order order = new Order(passItem, passPrice);
                                
                            }
                        }
                        catch(ArrayIndexOutOfBoundsException ex)
                        {
                            
                            JOptionPane.showMessageDialog(null,"Please Select a Product","ERROR",JOptionPane.ERROR_MESSAGE);
                            
                        }
                        
                        
                        
                        
                        
                    }
     });
                
                
                 //Button Event of Back Button
                back.addActionListener((ActionEvent e) -> {
                    //To change body of generated methods, choose Tools | Templates.
                    if(e.getSource()==back)
                    {
                        ind=0;
                        
                        itemsframe.dispose();
                    }
     });
                
                     
                     
                     itemsframe.setVisible(true);
    
    
 
 
 
 
 
 
 
 
 
 
 
 }
 
 
 public Items(int a, int b, int c)
 {
 
     
      //Frame Properties
 itemsframe.setLayout(null);
        itemsframe.setSize(1300, 700);
        itemsframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          itemsframe.setLocation(50, 30);
         
       
                     
                     
                      //Designing Panles and Adding them to Labels
    panel.setLayout(null);
          panel.setBounds(150, 160,1000 , 450);
          panel.setBackground(new Color(255,0,220,60));
          panel.setBorder(brdr);
          itemsframe.add(panel);
          
          
          
            //Designing Labels
          namepanel.setLayout(null);
          namepanel.setBounds(510, 20, 230, 120);
          namepanel.setBorder(brdr);
          namepanel.setBackground(new Color(255,80,120,60));
         itemsframe.add(namepanel);
          
          Label1.setText("  I P H O N E");
          Label1.setBounds(50, 5, 150,80);
          Label1.setFont(new Font("Arial",Font.BOLD,20));
          Label1.setForeground(Color.BLACK);
          namepanel.add(Label1);
          
          Label2.setText("PRODUCTS");
          Label2.setBounds(65, 40, 150,80);
          Label2.setFont(new Font("Arial",Font.BOLD,18));
          Label2.setForeground(Color.YELLOW);
          namepanel.add(Label2);
          
          
           //Passing String Array to the Lists 
          //Adding List to the ScrollPanel
          Ilist = new JList(Settings.Iphone);
          srlpn = new JScrollPane(Ilist);
          Ilist.setBackground(new Color(0,0,0));
          Ilist.setFont(new Font("Arial", Font.PLAIN, 18));
          Ilist.setBorder(listbrdr);
          Ilist.setForeground(Color.WHITE);
          Ilist.setSelectionBackground(Color.YELLOW);
          Ilist.setSelectionForeground(Color.BLACK);
           Ilist.setModel(model);
          
      //Adding Strings Elements to the List
      for (String Iphone : Settings.Iphone) {
          model.addElement(Iphone);
      }
                
            
                   panel.add(srlpn);
          srlpn.setBounds(50, 60,900, 295);
          
          
           //Designing Buttons
            buy.setFont(new Font("Arial",Font.BOLD,15));
                buy.setBackground(Color.GREEN);
                buy.setForeground(Color.BLACK);
                buy.setBounds(700, 380, 120,35);
                buy.setBorder(buttonbrdr);
                panel.add(buy);
                
                back.setFont(new Font("Arial",Font.BOLD,15));
                back.setBackground(Color.RED);
                back.setForeground(Color.BLACK);
                 back.setBorder(buttonbrdr);
                back.setBounds(130, 380, 120,35);
                panel.add(back);
                
                
                 //Button Event of Buy Button
                buy.addActionListener((ActionEvent e) -> {
                    //To change body of generated methods, choose Tools | Templates.
                    
                    if(e.getSource()==buy)
                    {
                        try{
                            ind=Ilist.getSelectedIndex();
                            
                            if(ind !=0)
                            {
                                
                                String passItem = (String) Ilist.getSelectedValue();
                                String price=Settings.priceI[ind];
                                Double passPrice = Double.parseDouble(price);
                                
                                Order order = new Order(passItem, passPrice);
                                
                            }
                            
                        }
                        catch(ArrayIndexOutOfBoundsException ex)
                        {
                            
                            JOptionPane.showMessageDialog(null,"Please Select a Product","ERROR",JOptionPane.ERROR_MESSAGE);
                            
                        }
                        
                        
                        
                        
                        
                    }
 });
                
                
                 //Button Event of Back Button
                back.addActionListener((ActionEvent e) -> {
                    //To change body of generated methods, choose Tools | Templates.
                    if(e.getSource()==back)
                    {
                        ind=0;
                        
                        itemsframe.dispose();
                    }
 });
                
                
                   
                     
                     itemsframe.setVisible(true);
    
   }
    
 
}
     
  