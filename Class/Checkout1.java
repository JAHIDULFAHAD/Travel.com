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


public class Checkout1 extends JFrame implements ActionListener
{
	
	 JFrame f = new JFrame ("Hotel Booking" );
	 
	 JLabel r1,r2;
	 JTextField t1;
	 JButton b1,b2,b3,b4,b5,b6;
	 
	 
	 Checkout1()
	 
	 {
		 f.setSize (800,600);
		 
		 
		 r1= new JLabel("Room No-");
		 r2= new JLabel("Rate our Service:");
		 
		 
		 
		   JTextField t1= new JTextField ();
        t1.setBounds(440,265,180,25);
		
		
		
		Icon icon5 = new ImageIcon("H:\\Java Project\\Image\\confirm.png");
	    b1 = new JButton(icon5);
		
		
		Icon icon = new ImageIcon("H:\\Java Project\\Image\\mini1.jpg");
	    b2 = new JButton(icon);
		
		Icon icon1 = new ImageIcon("H:\\Java Project\\Image\\mini2.jpg");
		b3 = new JButton(icon1);
		
		Icon icon2 = new ImageIcon("H:\\Java Project\\Image\\mini3.jpg");
		b4 = new JButton(icon2);
		
		Icon icon3 = new ImageIcon("H:\\Java Project\\Image\\mini4.jpg");
		b5 = new JButton(icon3);
		
		
				Icon icon13 = new ImageIcon("H:\\Java Project\\Image\\back1.jpg");
	    b6 = new JButton(icon13);
		
		b1.setBounds(600,400,80,40);
		b2.setBounds(28,200,100,40);
		b3.setBounds(28,260,100,40);
		b4.setBounds(28,320,100,40);
		b5.setBounds(28,380,100,40);
		b6.setBounds(28,490,80,40);
		
		
		r1.setBounds(300,200,200,150);
		r2.setBounds(300,250,200,150);
		
		r1.setFont(new Font("MONOSPACED",Font.BOLD,20));
        r2.setFont(new Font("MONOSPACED",Font.BOLD,16));
		
		r1.setForeground(Color.BLACK);
        r2.setForeground(Color.BLACK);
		
		
	    JRadioButton e1 = new JRadioButton("Poor");
		 e1.setBounds(300, 350, 100, 30);
		 
		 JRadioButton e2 = new JRadioButton("Good");
		 e2.setBounds(400, 350, 100, 30);
		  
		 JRadioButton e3= new JRadioButton("Best");
		 e3.setBounds(500,350, 100, 30);
		 
		 	ButtonGroup bg1 = new ButtonGroup();
		 bg1.add(e1);
		 bg1.add(e2);
		 bg1.add(e3);
		 
		 
		 f.add(r1);
		 f.add(r2);
		 f.add(b1);
		 f.add(b2);
		 f.add(b3);
		 f.add(b4);
		 f.add(b5);
		 f.add(b6);
		 f.add(t1);
		 f.add(e1);
		 f.add(e2);
		 f.add(e3);
		 
		 
		 Image iconl = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
f.setIconImage(iconl);
		 
		 
		 ImageIcon background_image = new ImageIcon("H:\\Java Project\\Image\\checkout.png");
		
		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(800,600,Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0,0,800,600);
		f.add(background);

        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b6.addActionListener(this);
				
		
	 }
	 
	 	public void actionPerformed(ActionEvent e)
		{
		if(e.getSource()==b1)
		{
			 JOptionPane.showMessageDialog(null, " ROOM NO-111 has been Checked out");
		}
		
		
			if(e.getSource()==b2)
		{Checkin i8= new Checkin();
	 f.setVisible(false);
		}
		
		if(e.getSource()==b3)
		{Checkout1 i9= new Checkout1();
	 f.setVisible(false);
		}
		
		if(e.getSource()==b4)
		{Room1 i10= new Room1();
	 f.setVisible(false);
		}
		
		if(e.getSource()==b6)
		{Royal i18= new Royal();
	  f.setVisible(false);
		}
		
	
		}
	 
	 public static void main(String[] args)
    {Checkout1 k= new Checkout1();
}

}