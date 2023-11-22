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


public class ES extends JFrame //implements ActionListener
{
   JFrame f = new JFrame ("Hotel Booking" );
   
   ES()
   {
	   f.setSize (620,420);
	   
	   
	   ImageIcon background_image = new ImageIcon("H:\\Java Project\\Image\\ES1.jpg");
		
		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(600,400,Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0,0,600,400);
		f.add(background);

        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.HIDE_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
f.setIconImage(icon);
   }
   
   public static void main(String[] args)
    {ES k= new ES();
	
	}
	
}