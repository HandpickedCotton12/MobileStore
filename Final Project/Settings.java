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
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Settings extends JFrame {
    
    //Creating Panels
       JPanel panel = new JPanel();
    JPanel namepanel = new JPanel();
    JPanel addingitem= new JPanel();
    
        
    //Creating Text Fields
    JTextField idField = new JTextField();
      JTextField nameField = new JTextField();
      JTextField priceField= new JTextField();
      JTextField specsField=new JTextField();
      
      
      //Craeting Labels
    JLabel backgrnd = new JLabel();
    JLabel id= new JLabel("Product ID:  ");
    JLabel name=new JLabel("Product Name:");
    JLabel price= new JLabel("Price:");
    JLabel specs= new JLabel("Specs:");
    JLabel Label1= new JLabel();
    JLabel Label2 = new JLabel();
    
    
    
    //Creating Buttons
    JButton add= new JButton("Add Item");
    JButton delete = new JButton("Delete Item");
    JButton save= new JButton("      S         A           V           E      ");
    JButton back= new JButton("B  a  c  k");
    JButton exit = new JButton("E X I T");
      static JList Hlist, Slist, Ilist;
      
      
      
      String itemadded,itemcatched;
      
      //Creating Array Strings
static  String [] priceH={"","157600","119999","99999","89999","74999","59999","40999","40000","39999","36999"};
 static String[] Huawei ={" Product ID                 Product Name                   Product Price                               Product Specs","      1                              P30  Pro                             157600                  Display 6.4inches  8GB RAM  4200mAh","      2                              Mate 20 Pro                        119999                 Display 6.4inches  8GB RAM  4200mAh","      3                              P20  Pro                              99999                  Display 6.4inches  8GB RAM  4200mAh","      4                              P30                                      89999                  Display 6.4inches  8GB RAM  4200mAh","      5                              Mate 10  Pro                        74999                 Display 6.4inches  8GB RAM  4200mAh","      6                              Nova 3                                 59999                 Display 6.4inches  8GB RAM  4200mAh","      7                              Y9s   2019                           40999                 Display 6.4inches  8GB RAM  4200mAh","      8                              Honor  7                             40000                   Display 6.4inches  8GB RAM  4200mAh","      9                              P30 Lite                             39999                   Display 6.4inches  8GB RAM  4200mAh","     10                             Nova  3i                             36999                   Display 6.4inches  8GB RAM  4200mAh"};
    
  static String [] priceS={"","219999","219999","189999","184999","170000","169999","164999","164999","144999","139999"};
 static String[] Samsung ={" Product ID                 Product Name                   Product Price                               Product Specs","      1                              S10 Plus                            219999                  Display 6.4inches  12GB RAM  4100mAh","      2                              S20 Ultra                           219999                 Display 6.4inches  12GB RAM  4100mAh","      3                              Note10 Plus                       189999                  Display 6.4inches  12GB RAM  4100mAh","      4                              S20 Plus                            184999                  Display 6.4inches  12GB RAM  4100mAh","      5                              Note9 512GB                    170000                 Display 6.4inches  12GB RAM  4100mAh","      6                              Note10                              169999                 Display 6.4inches  12GB RAM  4100mAh","      7                              S20                                    164999                 Display 6.4inches  12GB RAM  4100mAh","      8                              S10 Plus                            164999                   Display 6.4inches  12GB RAM  4100mAh","      9                              S10                                   144999                   Display 6.4inches  12GB RAM  4100mAh","     10                             Note9                                136999                   Display 6.4inches  12GB RAM  4100mAh"};
 
 static String [] priceI={"","149000","208000","157000","63050","224999","164999","166999","104999","100899","25799"};
   static  String[] Iphone ={" Product ID                 Product Name                   Product Price                               Product Specs","      1                                 XR                                  149000                  Display 6.4inches   6GB RAM  4000mAh","      2                              11  Pro                               208000                 Display 6.4inches   6GB RAM  4000mAh","      3                                  11                                  157000                  Display 6.4inches    6GB RAM  4000mAh","      4                                   7                                    63050                  Display 6.4inches   6GB RAM  4000mAh","      5                             11 Pro Max                         224999                 Display 6.4inches   6GB RAM  4000mAh","      6                                  X                                    164999                 Display 6.4inches   6GB RAM  4000mAh","      7                              XS Max                               166999                 Display 6.4inches   6GB RAM  4000mAh","      8                                 8  Plus                             104999                   Display 6.4inches   6GB RAM  4000mAh","      9                                7  Plus                              100899                   Display 6.4inches  6GB RAM  4000mAh","     10                                   5                                    25799                   Display 6.4inches   6GB RAM  4000mAh"};
    
   
   
   //Craeting Model for  Lists
      DefaultListModel model= new DefaultListModel();
    
      int selected_ind;
      
      
       //Creating Borders for Lables Panles and Buttons etc
    Border brdr= BorderFactory.createLineBorder(Color.YELLOW, 3, true);
             Border listbrdr= BorderFactory.createLineBorder(Color.blue, 3, true);
              Border buttonbrdr= BorderFactory.createLineBorder(Color.MAGENTA, 3, true);
    Border TextField = BorderFactory.createLineBorder(Color.CYAN, 3,true);
    
    //Creating Frame
    JFrame settframe= new JFrame("ModiFying Items");
    public Settings()
    {
       
        
        //Frame Properties
        settframe.setLayout(null);
        settframe.setSize(1300, 700);
        settframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          settframe.setLocation(50, 30);
         
          
          
                     
                     //Designing  Panels
    panel.setLayout(null);
          panel.setBounds(320, 115,930 , 330);
          panel.setBackground(new Color(255,0,220,60));
          settframe.add(panel);
          
          namepanel.setLayout(null);
          namepanel.setBounds(645, 10, 230, 90);
          
          namepanel.setBackground(new Color(255,80,120,60));
          namepanel.setBorder(brdr);
         settframe.add(namepanel);
          
         
         //Designing Labels
          Label1.setText("H  U  A  W  E  I");
          Label1.setBounds(50, 5, 150,60);
          Label1.setFont(new Font("Arial",Font.BOLD,20));
          Label1.setForeground(Color.WHITE);
          namepanel.add(Label1);
          
          Label2.setText("PRODUCTS");
          Label2.setBounds(65, 30, 150,60);
          Label2.setFont(new Font("Arial",Font.BOLD,18));
          Label2.setForeground(Color.YELLOW);
          namepanel.add(Label2);
        
          //Passing String Array To List
           Hlist = new JList(Huawei);
           
       Hlist.setBackground(new Color(0,0,0));
          Hlist.setFont(new Font("Arial", Font.PLAIN, 18));
          Hlist.setForeground(Color.WHITE);
          Hlist.setSelectionBackground(Color.YELLOW);
          Hlist.setBorder(listbrdr);
          Hlist.setSelectionForeground(Color.BLACK);
         Hlist.setModel(model);
         
           //Adding Elements of Strings To the List
           for (String Huawei1 : Huawei) {
               model.addElement(Huawei1);
           }
     JScrollPane scrlpn = new JScrollPane(Hlist);
       
     
     
     //Designing Buttons
       back.setFont(new Font("Arial",Font.BOLD,15));
                back.setBackground(Color.RED);
                back.setForeground(Color.BLACK);
                back.setBorder(buttonbrdr);
                back.setBounds(440, 470, 120,35);
               settframe.add(back);
                
                
                
                  delete.setFont(new Font("Arial",Font.BOLD,15));
                delete.setBackground(Color.RED);
                delete.setForeground(Color.BLACK);
                delete.setBorder(buttonbrdr);
                delete.setBounds(670, 470, 120,35);
               settframe.add(delete);
                
                 add.setFont(new Font("Arial",Font.BOLD,15));
                add.setBackground(Color.GREEN);
                add.setForeground(Color.BLACK);
               add.setBorder(buttonbrdr);
                add.setBounds(800, 470, 120,35);
                settframe.add(add);
                
     exit.setFont(new Font("Arial",Font.BOLD,15));
               exit.setBackground(Color.RED);
                exit.setForeground(Color.YELLOW);
               exit.setBorder(buttonbrdr);
                exit.setBounds(1010, 470, 120,35);
                settframe.add(exit);
                
              
        
                //Designing Panel
                
                addingitem.setLayout(null);
                addingitem.setBounds(340, 510,900 , 140);
          addingitem.setBackground(new Color(255, 0, 0, 80));
          addingitem.setBorder(brdr);
          settframe.add(addingitem);
                
                //Designing Fields
                
        id.setBounds(30,20, 130,25);
          id.setFont(new Font("Arial",Font.BOLD,18));
          id.setForeground(Color.YELLOW);
          addingitem.add(id);
          
          idField.setBounds(35, 55, 100,35);
          idField.setFont(new Font("Arial",Font.BOLD,18));
          idField.setBorder(buttonbrdr);
          idField.setForeground(Color.BLACK);
          addingitem.add(idField);
          
          name.setBounds(270,20, 140,25);
          name.setFont(new Font("Arial",Font.BOLD,18));
          name.setForeground(Color.YELLOW);
          addingitem.add(name);
          
          
          nameField.setBounds(270, 55, 140,35);
          nameField.setFont(new Font("Arial",Font.BOLD,18));
          nameField.setBorder(buttonbrdr);
          nameField.setForeground(Color.BLACK);
          addingitem.add(nameField);
          
          price.setBounds(465,20, 130,25);
          price.setFont(new Font("Arial",Font.BOLD,18));
          price.setForeground(Color.CYAN);
          addingitem.add(price);
          
         priceField.setBounds(460, 55, 100,35);
          priceField.setFont(new Font("Arial",Font.BOLD,18));
          priceField.setBorder(buttonbrdr);
          priceField.setForeground(Color.BLACK);
          addingitem.add(priceField);
          
          
          specs.setBounds(620,20, 130,25);
          specs.setFont(new Font("Arial",Font.BOLD,18));
          specs.setForeground(Color.YELLOW);
          addingitem.add(specs);
          
                specsField.setBounds(610, 55, 250,35);
          specsField.setFont(new Font("Arial",Font.BOLD,18));
          specsField.setBorder(buttonbrdr);
          specsField.setForeground(Color.BLACK);
          addingitem.add(specsField);
               
               save.setFont(new Font("Arial",Font.BOLD,15));
                save.setBackground(Color.GREEN);
                save.setForeground(Color.BLACK);
               save.setBorder(TextField);
                save.setBounds(250, 100, 400,25);
              addingitem.add(save);
                
    panel.add(scrlpn);
                   panel.setBorder(brdr);
                   
          scrlpn.setBounds(15, 15,900, 295);
 
                     addingitem.setVisible(false);
                     settframe.setVisible(true);
                     
                     
                     //Button event of Delete Button
                   delete.addActionListener((ActionEvent e) -> {
                       //To change body of generated methods, choose Tools | Templates.
                       
                       if(e.getSource()==delete)
                       {
                           try{
                               selected_ind=Hlist.getSelectedIndex();
                               
                               if(selected_ind !=0)
                               {
                                   model.remove(selected_ind);
                               }
                           }
                           catch(ArrayIndexOutOfBoundsException ex)
                           {
                               
                               JOptionPane.showMessageDialog(null,"Please Select a Product","ERROR",JOptionPane.ERROR_MESSAGE);
                               
                           }
                           
                           
                           
                           
                           
                       }
        });
        
                   
                   
                   //Button event of Add button
                   add.addActionListener((ActionEvent e) -> {
                       //To change body of generated methods, choose Tools | Templates.
                       addingitem.setVisible(true);
        });
                   
                   
                   
                   //Button event of Save Button
                 save.addActionListener((ActionEvent e) -> {
                     //To change body of generated methods, choose Tools | Templates.
                     
                     
                     if(e.getSource()==save)
                     {
                         String str="     ";
                         str +=(idField.getText()+"                          "+nameField.getText()+"                            "+priceField.getText()+"                    "+specsField.getText());
                         model.addElement(str);
                         JOptionPane.showMessageDialog(null,"Product has been Added!");
                         addingitem.setVisible(false);
                     }
        });
                 
                 
                 
                 
                 //Button event of Back button
                 
                 back.addActionListener((ActionEvent e) -> {
                     //To change body of generated methods, choose Tools | Templates.
                     
                     
                     settframe.dispose();
        });
                 
                 
              //Button Event of Exit Button   
              
              exit.addActionListener((ActionEvent e) -> {
                  //To change body of generated methods, choose Tools | Templates.
                  
                  
                  System.exit(0);
        });
                 
                   
    }
    
    
 
    
    
    
    public Settings(int a)
    {
       //Frame Properties
        settframe.setLayout(null);
        settframe.setSize(1300, 700);
        settframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          settframe.setLocation(50, 30);
         
          
        
                     
                     
                      //Designing  Panels
    panel.setLayout(null);
          panel.setBounds(320, 115,930 , 330);
          panel.setBackground(new Color(255,0,220,60));
         settframe.add(panel);
          
          namepanel.setLayout(null);
          namepanel.setBounds(645, 10, 230, 90);
          
          namepanel.setBackground(new Color(255,80,120,60));
          namepanel.setBorder(brdr);
         settframe.add(namepanel);
          
         
         //Designing Labels
            Label1.setText("S A M S U N G");
          Label1.setBounds(50, 5, 150,60);
          Label1.setFont(new Font("Arial",Font.BOLD,20));
          Label1.setForeground(Color.WHITE);
          namepanel.add(Label1);
          
          Label2.setText("PRODUCTS");
          Label2.setBounds(65, 30, 150,60);
          Label2.setFont(new Font("Arial",Font.BOLD,18));
          Label2.setForeground(Color.YELLOW);
          namepanel.add(Label2);
        
          //Passing String Array to List
           Slist = new JList(Samsung);
           
       Slist.setBackground(new Color(0,0,0));
          Slist.setFont(new Font("Arial", Font.PLAIN, 18));
          Slist.setForeground(Color.WHITE);
          Slist.setSelectionBackground(Color.YELLOW);
          Slist.setBorder(listbrdr);
          Slist.setSelectionForeground(Color.BLACK);
         Slist.setModel(model);
         
           //Adding Elements of Strings To List
           for (String Samsung1 : Samsung) {
               model.addElement(Samsung1);
           }
     JScrollPane scrlpn = new JScrollPane(Slist);
       
     
     //Designing Buttons
     
       back.setFont(new Font("Arial",Font.BOLD,15));
                back.setBackground(Color.RED);
                back.setForeground(Color.BLACK);
                back.setBorder(buttonbrdr);
                back.setBounds(440, 470, 120,35);
               settframe.add(back);
     
     add.setFont(new Font("Arial",Font.BOLD,15));
                add.setBackground(Color.GREEN);
                add.setForeground(Color.BLACK);
               add.setBorder(buttonbrdr);
                add.setBounds(800, 470, 120,35);
                settframe.add(add);
                
                delete.setFont(new Font("Arial",Font.BOLD,15));
                delete.setBackground(Color.RED);
                delete.setForeground(Color.BLACK);
                delete.setBorder(buttonbrdr);
                delete.setBounds(670, 470, 120,35);
                settframe.add(delete);
        
                exit.setFont(new Font("Arial",Font.BOLD,15));
               exit.setBackground(Color.RED);
                exit.setForeground(Color.YELLOW);
               exit.setBorder(buttonbrdr);
                exit.setBounds(1010, 470, 120,35);
               settframe.add(exit);
                
                //Designing panel
                addingitem.setLayout(null);
                addingitem.setBounds(340, 510,900 , 140);
          addingitem.setBackground(new Color(255, 0, 0, 80));
          addingitem.setBorder(brdr);
          settframe.add(addingitem);
                
                
                //Designing Fields
        id.setBounds(30,20, 130,25);
          id.setFont(new Font("Arial",Font.BOLD,18));
          id.setForeground(Color.YELLOW);
          addingitem.add(id);
          
          idField.setBounds(35, 55, 100,35);
          idField.setFont(new Font("Arial",Font.BOLD,18));
          idField.setBorder(buttonbrdr);
          idField.setForeground(Color.BLACK);
          addingitem.add(idField);
          
          name.setBounds(270,20, 140,25);
          name.setFont(new Font("Arial",Font.BOLD,18));
          name.setForeground(Color.YELLOW);
          addingitem.add(name);
          
          
          nameField.setBounds(270, 55, 140,35);
          nameField.setFont(new Font("Arial",Font.BOLD,18));
          nameField.setBorder(buttonbrdr);
          nameField.setForeground(Color.BLACK);
          addingitem.add(nameField);
          
          price.setBounds(465,20, 130,25);
          price.setFont(new Font("Arial",Font.BOLD,18));
          price.setForeground(Color.CYAN);
          addingitem.add(price);
          
         priceField.setBounds(460, 55, 100,35);
          priceField.setFont(new Font("Arial",Font.BOLD,18));
          priceField.setBorder(buttonbrdr);
          priceField.setForeground(Color.BLACK);
          addingitem.add(priceField);
          
          
          specs.setBounds(620,20, 130,25);
          specs.setFont(new Font("Arial",Font.BOLD,18));
          specs.setForeground(Color.YELLOW);
          addingitem.add(specs);
          
                specsField.setBounds(610, 55, 250,35);
          specsField.setFont(new Font("Arial",Font.BOLD,18));
          specsField.setBorder(buttonbrdr);
          specsField.setForeground(Color.BLACK);
          addingitem.add(specsField);
               
          
          //Designing Button
               save.setFont(new Font("Arial",Font.BOLD,15));
                save.setBackground(Color.GREEN);
                save.setForeground(Color.BLACK);
               save.setBorder(TextField);
                save.setBounds(250, 100, 400,25);
              addingitem.add(save);
                
    panel.add(scrlpn);
                   panel.setBorder(brdr);
                   
          scrlpn.setBounds(15, 15,900, 295);
 
                     addingitem.setVisible(false);
                     settframe.setVisible(true);
                     
                     
                     //Button Event of Delete Button
                   delete.addActionListener((ActionEvent e) -> {
                       //To change body of generated methods, choose Tools | Templates.
                       
                       if(e.getSource()==delete)
                       {
                           try{
                               selected_ind=Slist.getSelectedIndex();
                               
                               if(selected_ind !=0)
                               {
                                   model.remove(selected_ind);
                               }
                           }
                           catch(ArrayIndexOutOfBoundsException ex)
                           {
                               
                               JOptionPane.showMessageDialog(null,"Please Select a Product","ERROR",JOptionPane.ERROR_MESSAGE);
                               
                           }
                           
                           
                           
                           
                       }
        });
                   
          
                   
                   //Button event of Add button
                   add.addActionListener((ActionEvent e) -> {
                       //To change body of generated methods, choose Tools | Templates.
                       addingitem.setVisible(true);
        });
                   
                 save.addActionListener((ActionEvent e) -> {
                     //To change body of generated methods, choose Tools | Templates.
                     
                     
                     if(e.getSource()==save)
                     {
                         String str="     ";
                         str +=(idField.getText()+"                          "+nameField.getText()+"                            "+priceField.getText()+"                    "+specsField.getText());
                         model.addElement(str);
                         JOptionPane.showMessageDialog(null,"Product has been Added!");
                         addingitem.setVisible(false);
                     }
        });
                 
                   //Button event of Back button
                 
                 back.addActionListener((ActionEvent e) -> {
                     //To change body of generated methods, choose Tools | Templates.
                     
                     
                     settframe.dispose();
        });
                 
                 
              //Button Event of Exit Button   
              
              exit.addActionListener((ActionEvent e) -> {
                  //To change body of generated methods, choose Tools | Templates.
                  
                  
                  System.exit(0);
        });
                 
                   
    }
    
    
 
      public Settings(int a,int b)
    {
       //Frame Properties
        settframe.setLayout(null);
        settframe.setSize(1300, 700);
        settframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
          settframe.setLocation(50, 30);
         
          
        
                     
                     
                      //Designing  Panels
    panel.setLayout(null);
          panel.setBounds(320, 115,930 , 330);
          panel.setBackground(new Color(255,0,220,60));
          settframe.add(panel);
          
          namepanel.setLayout(null);
          namepanel.setBounds(645, 10, 230, 90);
          
          namepanel.setBackground(new Color(255,80,120,60));
          namepanel.setBorder(brdr);
         settframe.add(namepanel);
          
         
         
         //Designing Labels
            Label1.setText("  I P H O N E");
          Label1.setBounds(50, 5, 150,60);
          Label1.setFont(new Font("Arial",Font.BOLD,20));
          Label1.setForeground(Color.WHITE);
          namepanel.add(Label1);
          
          Label2.setText("PRODUCTS");
          Label2.setBounds(65, 30, 150,60);
          Label2.setFont(new Font("Arial",Font.BOLD,18));
          Label2.setForeground(Color.YELLOW);
          namepanel.add(Label2);
        
          
          
          //Passing String Array to List
           Ilist = new JList(Iphone);
           
       Ilist.setBackground(new Color(0,0,0));
          Ilist.setFont(new Font("Arial", Font.PLAIN, 18));
          Ilist.setForeground(Color.WHITE);
          Ilist.setSelectionBackground(Color.YELLOW);
          Ilist.setBorder(listbrdr);
          Ilist.setSelectionForeground(Color.BLACK);
         Ilist.setModel(model);
         
         
           //Adding String Elements TO List
           for (String Iphone1 : Iphone) {
               model.addElement(Iphone1);
           }
     JScrollPane scrlpn = new JScrollPane(Ilist);
       
     
     //Designing Buttons
       back.setFont(new Font("Arial",Font.BOLD,15));
                back.setBackground(Color.RED);
                back.setForeground(Color.BLACK);
                back.setBorder(buttonbrdr);
                back.setBounds(440, 470, 120,35);
              settframe.add(back);
     
     add.setFont(new Font("Arial",Font.BOLD,15));
                add.setBackground(Color.GREEN);
                add.setForeground(Color.BLACK);
               add.setBorder(buttonbrdr);
                add.setBounds(800, 470, 120,35);
                settframe.add(add);
                
                delete.setFont(new Font("Arial",Font.BOLD,15));
                delete.setBackground(Color.RED);
                delete.setForeground(Color.BLACK);
                delete.setBorder(buttonbrdr);
                delete.setBounds(670, 470, 120,35);
                settframe.add(delete);
        
                exit.setFont(new Font("Arial",Font.BOLD,15));
               exit.setBackground(Color.RED);
                exit.setForeground(Color.YELLOW);
               exit.setBorder(buttonbrdr);
                exit.setBounds(1010, 470, 120,35);
                settframe.add(exit);
                
                
                
                //Designing panel
                addingitem.setLayout(null);
                addingitem.setBounds(340, 510,900 , 140);
          addingitem.setBackground(new Color(255, 0, 0, 80));
          addingitem.setBorder(brdr);
          settframe.add(addingitem);
                
                
               //Designing Fields 
        id.setBounds(30,20, 130,25);
          id.setFont(new Font("Arial",Font.BOLD,18));
          id.setForeground(Color.YELLOW);
          addingitem.add(id);
          
          idField.setBounds(35, 55, 100,35);
          idField.setFont(new Font("Arial",Font.BOLD,18));
          idField.setBorder(buttonbrdr);
          idField.setForeground(Color.BLACK);
          addingitem.add(idField);
          
          name.setBounds(270,20, 140,25);
          name.setFont(new Font("Arial",Font.BOLD,18));
          name.setForeground(Color.YELLOW);
          addingitem.add(name);
          
          
          nameField.setBounds(270, 55, 140,35);
          nameField.setFont(new Font("Arial",Font.BOLD,18));
          nameField.setBorder(buttonbrdr);
          nameField.setForeground(Color.BLACK);
          addingitem.add(nameField);
          
          price.setBounds(465,20, 130,25);
          price.setFont(new Font("Arial",Font.BOLD,18));
          price.setForeground(Color.CYAN);
          addingitem.add(price);
          
         priceField.setBounds(460, 55, 100,35);
          priceField.setFont(new Font("Arial",Font.BOLD,18));
          priceField.setBorder(buttonbrdr);
          priceField.setForeground(Color.BLACK);
          addingitem.add(priceField);
          
          
          specs.setBounds(620,20, 130,25);
          specs.setFont(new Font("Arial",Font.BOLD,18));
          specs.setForeground(Color.YELLOW);
          addingitem.add(specs);
          
                specsField.setBounds(610, 55, 250,35);
          specsField.setFont(new Font("Arial",Font.BOLD,18));
          specsField.setBorder(buttonbrdr);
          specsField.setForeground(Color.BLACK);
          addingitem.add(specsField);
               
               save.setFont(new Font("Arial",Font.BOLD,15));
                save.setBackground(Color.GREEN);
                save.setForeground(Color.BLACK);
               save.setBorder(TextField);
                save.setBounds(250, 100, 400,25);
              addingitem.add(save);
                
    panel.add(scrlpn);
                   panel.setBorder(brdr);
                   
          scrlpn.setBounds(15, 15,900, 295);
   
                     addingitem.setVisible(false);
                     settframe.setVisible(true);
                     
                     
                    //Button Event of Delete Button 
                   delete.addActionListener((ActionEvent e) -> {
                       //To change body of generated methods, choose Tools | Templates.
                       
                       if(e.getSource()==delete)
                       {
                           try{
                               selected_ind=Ilist.getSelectedIndex();
                               
                               if(selected_ind !=0)
                               {
                                   model.remove(selected_ind);
                               }
                               
                           }
                           catch(ArrayIndexOutOfBoundsException ex)
                           {
                               
                               JOptionPane.showMessageDialog(null,"Please Select a Product","ERROR",JOptionPane.ERROR_MESSAGE);
                               
                           }
                           
                           
                           
                           
                       }
        });
        
        
                   
                   //Button Event of Add button
                   add.addActionListener((ActionEvent e) -> {
                       //To change body of generated methods, choose Tools | Templates.
                       addingitem.setVisible(true);
        });
                   
                 save.addActionListener((ActionEvent e) -> {
                     //To change body of generated methods, choose Tools | Templates.
                     
                     
                     if(e.getSource()==save)
                     {
                         String check=idField.getText();
                         if(check == null)
                         {
                             
                             JOptionPane.showMessageDialog(null,"Please Add a Product","ERROR",JOptionPane.ERROR_MESSAGE);
                         }
                         else{
                             
                             String str="     ";
                             str +=(idField.getText()+"                          "+nameField.getText()+"                            "+priceField.getText()+"                    "+specsField.getText());
                             model.addElement(str);
                             JOptionPane.showMessageDialog(null,"Product has been Added!");
                             addingitem.setVisible(false);
                             
                         }
                     }
        });
                 
                 
                 
                 
                   //Button event of Back button
                 
                 back.addActionListener((ActionEvent e) -> {
                     //To change body of generated methods, choose Tools | Templates.
                     
                     
                     settframe.dispose();
        });
                 
                 
              //Button Event of Exit Button   
              
              exit.addActionListener((ActionEvent e) -> {
                  //To change body of generated methods, choose Tools | Templates.
                  
                  
                  System.exit(0);
        });
                 
                   
    }
    
    
    
    
}

    
