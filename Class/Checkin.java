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
import javax.swing.JRadioButton;


public class Checkin extends JFrame implements ActionListener
{

   
       
        JFrame f = new JFrame ("Hotel Booking" );
		
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
		JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
		JButton b1,b2,b3,b4,b5,b6,b7;
		JComboBox day,month,year;
		
		
		Checkin(){
		
		
        f.setSize (800,650);
        
        //f.getContentPane().setBackground(Color.BLUE);
       
		
		

        JLabel l1  = new JLabel ( "NAME " );
        JLabel l2  = new JLabel ("PHONE ");
		JLabel l3  = new JLabel ("EMAIL ");
		JLabel l4  = new JLabel ("ADDRESS ");
		JLabel l5  = new JLabel ("CITY ");
		JLabel l6  = new JLabel ("NATIONALITY ");
		JLabel l7  = new JLabel ("PASSPORT NO ");
		
		JLabel l8  = new JLabel ( "Room Type: " );
		JLabel l9  = new JLabel ( "Room Capacity " );
		JLabel l10  = new JLabel ( "Check in Date " );
		JLabel l11 = new JLabel ( "Check Out Date " );
		
		
		
		
       // JLabel hotel  = new JLabel ( "HOTEL ROYAL" );
		
		
		
		
        JTextField t1= new JTextField ();
        t1.setBounds(300,230,172,22);
		
		JTextField t2= new JTextField ();
        t2.setBounds(300,280,172,22);
		
		JTextField t3= new JTextField ();
        t3.setBounds(300,330,172,22);
		
		JTextField t4= new JTextField ();
        t4.setBounds(300,380,172,22);
		
		JTextField t5= new JTextField ();
        t5.setBounds(300,430,172,22);
		
		JTextField t6= new JTextField ();
        t6.setBounds(300,480,172,22);
		
		
		 JTextField t7= new JTextField ();
        t7.setBounds(300,530,172,22);
		
		JTextField t8= new JTextField ();
        t8.setBounds(630, 330, 130, 22);
		 JTextField t9= new JTextField ();
        t9.setBounds(630,380,130,22);
		
		/*String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
			  day = new JComboBox (days);
			  day.setBounds(600, 400, 152, 22);
			  
	    String[] months = {"JAN","FEB","MAR","APRIL","MAY","JUN","JUL","AUG","SEPT","OCT","NOV","DEC"};
			  month =new JComboBox (months);
			  month.setBounds(600, 425, 152, 22);
			  
		String[] years = {"2022"};
			  year = new JComboBox (years);
			  year.setBounds(600, 450, 100,22);*/





        //JPasswordField value = new JPasswordField ();
        //value.setBounds(250,305,200,20);

        //JButton b1 = new JButton ("Back ");
        //JButton b2 = new JButton ("CONFIRM");
        //JButton b3 = new JButton ("Reset ");
		
		Icon icon4 = new ImageIcon("H:\\Java Project\\Image\\back1.jpg");
	    b1 = new JButton(icon4);
		Icon icon5 = new ImageIcon("H:\\Java Project\\Image\\confirm.png");
	    b2 = new JButton(icon5);
		
		
		Icon icon = new ImageIcon("H:\\Java Project\\Image\\mini1.jpg");
	    b4 = new JButton(icon);
		
		Icon icon1 = new ImageIcon("H:\\Java Project\\Image\\mini2.jpg");
		b5 = new JButton(icon1);
		
		Icon icon2 = new ImageIcon("H:\\Java Project\\Image\\mini3.jpg");
		b6 = new JButton(icon2);
		
		Icon icon3 = new ImageIcon("H:\\Java Project\\Image\\mini4.jpg");
		b7 = new JButton(icon3);
		



        b1.setBounds(40,550,80,40);
        b2.setBounds(680,550,80,40);
       // b3.setBounds(580,700,100,40);
		b4.setBounds(25,230,100,40);
		b5.setBounds(25,290,100,40);
		b6.setBounds(25,350,100,40);
		b7.setBounds(25,410,100,40);
		
		
		
        l1.setBounds(170, 225, 100,30);
        l2.setBounds(170, 275, 100, 30);
		l3.setBounds(170, 325, 100, 30);
		l4.setBounds(170, 375, 100, 30);
		l5.setBounds(170, 425, 100, 30);
		l6.setBounds(170, 475, 100, 30);
		l7.setBounds(170, 525, 100, 30);
		
		l8.setBounds(500, 210, 100, 30);
		l9.setBounds(500, 260, 1000, 30);
		l10.setBounds(500, 320, 1000, 30);
		l11.setBounds(500, 360, 1000, 30);
		
		
		
		
		
		
		
		
		
       // hotel.setBounds(250, 10, 1000, 60);
        
		
		b1.setFont(new Font("MONOSPACED",Font.BOLD,14));
        b2.setFont(new Font("MONOSPACED",Font.BOLD,14));
		//b3.setFont(new Font("MONOSPACED",Font.BOLD,14));
        
        l1.setFont(new Font("MONOSPACED",Font.BOLD,15));
        l1.setFont(new Font("MONOSPACED",Font.BOLD,15));
        l2.setFont(new Font("MONOSPACED",Font.BOLD,15));
		l3.setFont(new Font("MONOSPACED",Font.BOLD,14));
		l4.setFont(new Font("MONOSPACED",Font.BOLD,14));
		l5.setFont(new Font("MONOSPACED",Font.BOLD,14));
		l6.setFont(new Font("MONOSPACED",Font.BOLD,14));
		l7.setFont(new Font("MONOSPACED",Font.BOLD,14));
		l8.setFont(new Font("MONOSPACED",Font.BOLD,14));
		l9.setFont(new Font("MONOSPACED",Font.BOLD,14));
		l10.setFont(new Font("MONOSPACED",Font.BOLD,14));
		l11.setFont(new Font("MONOSPACED",Font.BOLD,14));
		
		
		
		
		
        //hotel.setFont(new Font("MONOSPACED",Font.BOLD,40));
		
		
		
        l1.setForeground(Color.BLACK);
        l2.setForeground(Color.BLACK);
	    l3.setForeground(Color.BLACK);
        l4.setForeground(Color.BLACK);
        l5.setForeground(Color.BLACK);
		l6.setForeground(Color.BLACK);
		l7.setForeground(Color.BLACK);
		l8.setForeground(Color.BLACK);
		l9.setForeground(Color.BLACK);
		l10.setForeground(Color.BLACK);
		l11.setForeground(Color.BLACK);
		
		 JRadioButton r1 = new JRadioButton("Economy");
		 r1.setBounds(500, 235, 100, 30);
		 
		 JRadioButton r2 = new JRadioButton("Normal");
		 r2.setBounds(600, 235, 100, 30);
		  
		 JRadioButton r3= new JRadioButton("VIP");
		 r3.setBounds(700,235, 100, 30);
		  
		 JRadioButton r4 = new JRadioButton("Single");
		 r4.setBounds(500, 290,100,30);
		 
		 JRadioButton r5 = new JRadioButton("Double");
		 r5.setBounds(600,290,100,30);
		 
		 JRadioButton r6 = new JRadioButton("Triple");
		 r6.setBounds(700,290,100,30);
		 
		 
	     
		 
		     
		
		ButtonGroup bg1 = new ButtonGroup();
		 bg1.add(r1);
		 bg1.add(r2);
		 bg1.add(r3);
		 ButtonGroup bg2 = new ButtonGroup();
		 bg2.add(r4);
		 bg2.add(r5);
		 bg2.add(r6);
		    
        
        f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
		f.add(t8);
		f.add(t9);
		
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
	
		f.add(l5);
        f.add(l6);
		f.add(l7);
		
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		
		
		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(r4);
		f.add(r5);
		f.add(r6);
		
		f.add(b1);
		f.add(b2);
		//f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		
		/*f.add(day);
		f.add(month);
		f.add(year);*/
	
		Image iconl = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
f.setIconImage(iconl);
		
		
 ImageIcon background_image = new ImageIcon("H:\\Java Project\\Image\\chekin22.png");
		
		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(800,650,Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0,0,800,650);
		f.add(background);

        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
        b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
    
}
	public void actionPerformed(ActionEvent e)
			{
	if(e.getSource()==b1)
		{Royal i8= new Royal();
	f.setVisible(false);
		}
				
	if(e.getSource()==b4)
		{Checkin i8= new Checkin();
	f.setVisible(false);
		}
		
	if(e.getSource()==b5)
		{Checkout1 i9= new Checkout1();
	f.setVisible(false);
		}
		
	if(e.getSource()==b6)
		{Room1 i10= new Room1();
	f.setVisible(false);
		}
	if(e.getSource()==b2)
		{JOptionPane.showMessageDialog(null,"Your Booking has been confirmed");
		}
		}
		
		
		
 public static void main(String[] args)
    {Checkin k= new Checkin();
}


}