import java.lang.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.ActionListener;
///import java.awt.KeyAdapter;
//import java.awt.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Icon;



public class Royal extends JFrame implements ActionListener
{

   
       
        JFrame f = new JFrame ("Hotel Booking" );

        
        //f.getContentPane().setBackground(Color.BLUE);
       
		JButton l1,l2,l3,l4,l5,l6;
		JLabel hotel;
		
		
	Royal(){

       
        //JButton l1  = new JButton ("ROOM BOOKING ");
		//JButton l2  = new JButton ("ROOMS ");
	    //JButton l3  = new JButton ( "CHECK IN: " );
		//JButton l4 = new JButton (" CHECK OUT ");
		//JButton l5  = new JButton ("CANCEL BOOKING");
		
		 f.setSize (800,670);

         //hotel  = new JLabel ( "HOTEL ROYAL" );
		
		
		
		
		Icon icon = new ImageIcon("H:\\Java Project\\Image\\roombook1.jpg");
	    l1 = new JButton(icon);
		
		Icon icon1 = new ImageIcon("H:\\Java Project\\Image\\checkin1.jpg");
		l3 = new JButton(icon1);
		
		Icon icon2 = new ImageIcon("H:\\Java Project\\Image\\room1.jpg");
		l2 = new JButton(icon2);
		
		Icon icon3 = new ImageIcon("H:\\Java Project\\Image\\checkout1.jpg");
		l4 = new JButton(icon3);
		
		Icon icon4 = new ImageIcon("H:\\Java Project\\Image\\food1.jpg");
		l5 = new JButton(icon4);
		
				Icon icon13 = new ImageIcon("H:\\Java Project\\Image\\back1.jpg");
	    l6 = new JButton(icon13);
		
		
        //JTextField t1= new JTextField ();
        //t1.setBounds(200,105,200,20);

        //JPasswordField value = new JPasswordField ();
        //value.setBounds(200,175,200,20);

        //JButton l1 = new JButton ("SIGN UP ");
        //JButton b2 = new JButton ("LOG IN ");
        //JButton b3 = new JButton ("BOOK NOW! ");
		
		f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
		f.add(l5);
		f.add(l6);
        //f.add(hotel);


        l1.setBounds(50, 100, 180,130);
        l2.setBounds(250, 100,180, 130);
        l5.setBounds(150,400,200,130);
        l4.setBounds(250,250,180,130);
        l3.setBounds(50,250,180,130);
		l6.setBounds(700,20,80,40);
        
        //hotel.setBounds(250, 10, 1000, 60);
        
		
		l3.setFont(new Font("MONOSPACED",Font.BOLD,20));
        l4.setFont(new Font("MONOSPACED",Font.BOLD,20));
        l5.setFont(new Font("MONOSPACED",Font.BOLD,20));
        l1.setFont(new Font("MONOSPACED",Font.BOLD,20));
        l2.setFont(new Font("MONOSPACED",Font.BOLD,20));
        //hotel.setFont(new Font("MONOSPACED",Font.BOLD,40));
		
		
		l3.setForeground(Color.BLUE);
        l4.setForeground(Color.BLUE);
        l5.setForeground(Color.BLUE);
        l1.setForeground(Color.CYAN);
        l2.setForeground(Color.CYAN);
        //hotel.setForeground(Color.BLUE);
		
		
		
		
		
		
		//b1.setActionListener(f);
       // b2.setActionListener(f);
		//b3.setActionListener(f);

        //b1.setBorder(BorderFactory.createEtchedBorder());
        //b2.setBorder(BorderFactory.createEtchedBorder());
		//l3.setBorder(BorderFactory.createEtchedBorder());
		
		l1.setFocusable(false);
        l2.setFocusable(false);
        l5.setFocusable(false);
        l4.setFocusable(false);
        l3.setFocusable(false);
		
		
		Image iconl = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
f.setIconImage(iconl);

        //f.add(value);
        //f.add(t1);
       
 ImageIcon background_image = new ImageIcon("H:\\Java Project\\Image\\Hotel2.jpg");
		
		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(800,670,Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0,0,800,670);
		f.add(background);
		
		

        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.getContentPane().add(l3);
		
	
	   l5.addActionListener(this);
       l2.addActionListener(this);
	   l3.addActionListener(this);
	   l4.addActionListener(this);
	   l6.addActionListener(this);

}

public void actionPerformed(ActionEvent e)
{

if(e.getSource()==l2)
		{Room1 i8= new Room1();
	f.setVisible(false);
		}
		
if(e.getSource()==l3)
		{Checkin i= new Checkin();
	f.setVisible(false);
		}		
		
	if(e.getSource()==l4)
		{Checkout1 i5= new Checkout1();
	f.setVisible(false);
		}
	if(e.getSource()==l5)
		{FoodBooking i5= new FoodBooking();
	f.setVisible(false);
		}	
		if(e.getSource()==l6)
		{PostSignIn i5= new PostSignIn();
	f.setVisible(false);
		}	
	
		
}

 public static void main(String[] args)
    {Royal k= new Royal();
}
}
	

	


	
			 
			 
			 
