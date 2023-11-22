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


public class Room1 extends JFrame implements ActionListener
{

        JFrame f = new JFrame ("Hotel Booking" );

        
        //f.getContentPane().setBackground(Color.BLUE);
       
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
		JLabel t1,t2,t3,t4,t5,t6;
		
		
      Room1()
	{	
		f.setSize (800,670);
		
		JLabel t1  = new JLabel ( "ECONOMY- " );
        JLabel t2  = new JLabel ("NORMAL- ");
		JLabel t3  = new JLabel ("VIP- ");
		JLabel t4  = new JLabel ( "Single Bed" );
        JLabel t5  = new JLabel ("Double Bed ");
		JLabel t6  = new JLabel ("Triple Bed ");
		
		
		
		Icon icon = new ImageIcon("H:\\Java Project\\Image\\mini1.jpg");
	    b1 = new JButton(icon);
		
		Icon icon1 = new ImageIcon("H:\\Java Project\\Image\\mini2.jpg");
		b2 = new JButton(icon1);
		
		Icon icon2 = new ImageIcon("H:\\Java Project\\Image\\mini3.jpg");
		b3 = new JButton(icon2);
		
		Icon icon3 = new ImageIcon("H:\\Java Project\\Image\\mini4.jpg");
		
		b4 = new JButton(icon3);
		
		
			Icon icon4 = new ImageIcon("H:\\Java Project\\Image\\single1.jpg");
		
		b5 = new JButton(icon4);
		
			Icon icon5 = new ImageIcon("H:\\Java Project\\Image\\single2.jpg");
		
		b6 = new JButton(icon5);
		
			Icon icon6 = new ImageIcon("H:\\Java Project\\Image\\single3.jpg");
		
		b7 = new JButton(icon6);
		
		
			Icon icon7 = new ImageIcon("H:\\Java Project\\Image\\double1.jpg");
		
		b8 = new JButton(icon7);
		
			Icon icon8 = new ImageIcon("H:\\Java Project\\Image\\double2.jpg");
		
		b9 = new JButton(icon8);
		
			Icon icon9 = new ImageIcon("H:\\Java Project\\Image\\double3.jpg");
		
		b10 = new JButton(icon9);
		
			Icon icon10 = new ImageIcon("H:\\Java Project\\Image\\triple1.jpg");
		
		b11 = new JButton(icon10);
		
			Icon icon11 = new ImageIcon("H:\\Java Project\\Image\\triple2.jpg");
		
		b12 = new JButton(icon11);
		
			Icon icon12 = new ImageIcon("H:\\Java Project\\Image\\triple3.jpg");
		
		b13 = new JButton(icon12);
		
		Icon icon13 = new ImageIcon("H:\\Java Project\\Image\\back1.jpg");
	    b14 = new JButton(icon13);
		
		
		
		
		
		
		
		b1.setBounds(16,210,100,40);
		b2.setBounds(16,270,100,40);
		b3.setBounds(16,330,100,40);
		b4.setBounds(16,390,100,40);
		b5.setBounds(220,160,150,130);
		b6.setBounds(220,320,150,130);
		b7.setBounds(220,480,150,130);
		b8.setBounds(420,160,150,130);
		b9.setBounds(420,320,150,130);
		b10.setBounds(420,480,150,130);
		b11.setBounds(620,160,150,130);
		b12.setBounds(620,320,150,130);
		b13.setBounds(620,480,150,130);
		b14.setBounds(16,570,80,40);
		
		t1.setBounds(140,200,100,40);
		t2.setBounds(140,360,100,40);
		t3.setBounds(140,520,100,40);
	    t4.setBounds(250,120,100,40);
		t5.setBounds(450,120,100,40);
		t6.setBounds(650,120,100,40);
		
		
		t1.setFont(new Font("MONOSPACED",Font.BOLD,14));
        t2.setFont(new Font("MONOSPACED",Font.BOLD,14));
		t3.setFont(new Font("MONOSPACED",Font.BOLD,14));
		t4.setFont(new Font("MONOSPACED",Font.BOLD,12));
        t5.setFont(new Font("MONOSPACED",Font.BOLD,12));
		t6.setFont(new Font("MONOSPACED",Font.BOLD,12));
		
		t1.setForeground(Color.WHITE);
        t2.setForeground(Color.WHITE);
	    t3.setForeground(Color.WHITE);
		t4.setForeground(Color.BLACK);
        t5.setForeground(Color.BLACK);
	    t6.setForeground(Color.BLACK);
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.getContentPane().add(b5);
		
		Image iconl = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
f.setIconImage(iconl);
		
		 ImageIcon background_image = new ImageIcon("H:\\Java Project\\Image\\bg12.jpg");
		
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
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
		{
		if(e.getSource()==b5)
		{ES k= new ES();
		}
	
	
		if(e.getSource()==b6)
		{NS i= new NS();
		}
		
		if(e.getSource()==b7)
		{VS i1= new VS();
		}
		
		if(e.getSource()==b8)
		{ED i2= new ED();
		}
		
		if(e.getSource()==b9)
		{ND i3= new ND();
		}
		
		if(e.getSource()==b10)
		{VD i4= new VD();
		}
		if(e.getSource()==b11)
		{ET i5= new ET();
		}
		
		if(e.getSource()==b12)
		{NT i6= new NT();
		}
		
		if(e.getSource()==b13)
		{VT i7= new VT();
		}
		
		if(e.getSource()==b1)
		{Checkin i8= new Checkin();
	     f.setVisible(false);
	
		}
		
		if(e.getSource()==b2)
		{Checkout1 i9= new Checkout1();
	 f.setVisible(false);
		}
		
		if(e.getSource()==b3)
		{Room1 i10= new Room1();
	 f.setVisible(false);
		}
		/*if(e.getSource()==b4)
		{VT i11= new VT();
		}*/
		
		if(e.getSource()==b14)
		{Royal i8= new Royal();
	  f.setVisible(false);
		}
		
		
		
		

	}
		
		
		public static void main(String[] args)
    {Room1 p= new Room1();
	}
		
	}	