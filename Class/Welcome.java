import javax.swing.*;    
import java.awt.*;
import java.awt.event.*;
public class Welcome{
	
	private JFrame f = new JFrame("Welcome Page");
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	private JPanel []panel1=new JPanel[10];
	private Font font1 = new Font("Arial",Font.BOLD,18);
	private Font font2 = new Font("Arial",Font.BOLD,30);
	private Font font3 = new Font("Arial",Font.BOLD,13);
	private Font font4 = new Font("Arial",Font.BOLD,10);
	private Font font5 = new Font("Algerian",Font.BOLD,35);
	private Font font6 = new Font("Cambria Math",Font.BOLD,25);
	
	
	Welcome(){
		
	f.setSize(800,600);
		f.getContentPane().setBackground(new Color(229,235,226));
		f.setLayout(null);	
		
	
		
	
		
		
		//logo & menu------------------------------------
		
	JLabel l9=new JLabel("Travel");    
		l9.setBounds(15,15,150,40);
		l9.setFont(font5);
		l9.setForeground(Color.black);
		
	JLabel l10=new JLabel(".com");    
		l10.setBounds(155,17,80,40);
		l10.setFont(font6);
		l10.setForeground(Color.red);
		
		l9.setCursor(cursor);
		l10.setCursor(cursor);
		
	JPanel p1 = panel(15,50,195,2); 
		
	JPanel menuPanel = new JPanel();
		menuPanel.setLayout(null);
		menuPanel.setBounds(0,0,800,130);
		menuPanel.setBackground(new Color(135, 206, 235));
		
	JLabel l1=label("   SIGN IN",550,15,100,30,font1);    
		JPanel p2 = panel(649,15,2,30); 
		JLabel l2=label("    SIGN UP",650,15,100,30,font1);
		
		
		
		
	JLabel l8=label(" Attraction",50,90,100,30,font1);
		JPanel p7 = panel(149,90,2,30);
		JLabel l3=label("     Flight",150,90,100,30,font1);  
		JPanel p3 = panel(249,90,2,30); 
		JLabel l4=label("      Hotel",250,90,100,30,font1); 
		JPanel p4 = panel(349,90,2,30); 
		JLabel l5=label("      Taxi",350,90,100,30,font1);  
		JPanel p5 = panel(449,90,2,30);
		JLabel l6=label("       Bus",450,90,100,30,font1);
		JPanel p6 = panel(549,90,2,30);
		JLabel l7=label("      Train",550,90,100,30,font1);	
		JPanel p8 = panel(649,90,2,30);
		JLabel l11=label("     About",650,90,100,30,font1); 
		
		l1.setCursor(cursor);
		l2.setCursor(cursor);
		l3.setCursor(cursor);
		l4.setCursor(cursor);
		l5.setCursor(cursor);
		l6.setCursor(cursor);
		l7.setCursor(cursor);
		l8.setCursor(cursor);
		l11.setCursor(cursor);
		
		
		
		//--------------------------------------		

	panel1[0] = panel("SIGN IN");
		panel1[0].setVisible(false);
		panel1[1] = panel("   SIGN UP");
		panel1[1].setVisible(false);
		panel1[2] = panel("Flight");
		panel1[2].setVisible(false);
		panel1[3] = panel(" Hotel");
		panel1[3].setVisible(false);
		panel1[4] = panel("Taxi");
		panel1[4].setVisible(false);
		panel1[5] = panel(" Bus");
		panel1[5].setVisible(false);
		panel1[6] = panel(" Train");
		panel1[6].setVisible(false);
		panel1[7] = panel("Attraction");
		panel1[7].setVisible(false);
		panel1[8] = panel(" About");
		panel1[8].setVisible(false);
		
		
		
		

		
		
		
		
		JLabel ll=new JLabel("Back-end and Front-end - RIYADH");    
		ll.setBounds(580,530,300,20);
		ll.setForeground(Color.black);
		
		//--------------------------------------
		//JLabel l12=label("DON'T TELL ME HOW EDUCATED YOU ARE, TELL ME HOW MUCH YOU TRAVELLED.",50,200,700,30,font3);
		
		JLabel imgLabel1 = image("H:\\Java Project\\Image\\discount.jpg",75,350,300,169,300,169);
		JLabel imgLabel2 = image("H:\\Java Project\\Image\\hotel1.png",100,230,600,100,600,100);
		JLabel imgLabel3 = image("H:\\Java Project\\Image\\bus.png",425,350,300,169,300,169);
	
		
		
		
		// Mouse listener
		
		
		mouseListener1(l1,0);
		mouseListener1(l2,1);
		mouseListener1(l3,2);
		mouseListener1(l4,3);
		mouseListener1(l5,4);
		mouseListener1(l6,5);
		mouseListener1(l7,6);
		mouseListener1(l8,7);
		mouseListener1(l11,8);
		
		
		//Add -------------------------------
		f.add(menuPanel);
		f.add(ll);
		menuPanel.add(l9);
		menuPanel.add(l10);
		
		menuPanel.add(p1);
		menuPanel.add(p2);
		menuPanel.add(p3);
		menuPanel.add(p4);
		menuPanel.add(p5);
		menuPanel.add(p6);
		menuPanel.add(p7);
		menuPanel.add(p8);
		
		menuPanel.add(l1);
		menuPanel.add(l2);
		menuPanel.add(l3);
		menuPanel.add(l4);
		menuPanel.add(l5);
		menuPanel.add(l6);
		menuPanel.add(l7);
		menuPanel.add(l8);
		menuPanel.add(l11);
		
		
		l1.add(panel1[0]);
		l2.add(panel1[1]);
		l3.add(panel1[2]);
		l4.add(panel1[3]);
		l5.add(panel1[4]);
		l6.add(panel1[5]);
		l7.add(panel1[6]);
		l8.add(panel1[7]);
		l11.add(panel1[8]);
		
		
		
		
		
		
		
		//f.add(l12);
		f.add(imgLabel1);
		f.add(imgLabel2);
		f.add(imgLabel3);
		
		//------------------------------------------------------------------------
		Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
		f.setIconImage(icon);
		f.setLayout(null);    
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mouseListener1(JLabel label, int i){
		
			label.addMouseListener(new MouseListener(){
				
			public void mouseClicked(MouseEvent e) {  
				if(i==0){new SignIn();
				f.setVisible(false);}
				if(i==1){new Signup();
				f.setVisible(false);}
				if(i==2){JOptionPane.showMessageDialog(f,"Please sign in to continue");  }
				if(i==3){JOptionPane.showMessageDialog(f,"Please sign in to continue");  }
				if(i==4){JOptionPane.showMessageDialog(f,"Please sign in to continue");  }
				if(i==5){JOptionPane.showMessageDialog(f,"Please sign in to continue");  }
				if(i==6){JOptionPane.showMessageDialog(f,"Please sign in to continue");  }
				if(i==7){JOptionPane.showMessageDialog(f,"Please sign in to continue");  }
				if(i==8){JOptionPane.showMessageDialog(f,"Please sign in to continue");  }
				
			}  
			public void mouseEntered(MouseEvent e) {  
				panel1[i].setVisible(true);
			}  
			public void mouseExited(MouseEvent e) {  
				panel1[i].setVisible(false);
			}  
			public void mousePressed(MouseEvent e) {  
				panel1[i].setVisible(false);
			}  
			public void mouseReleased(MouseEvent e) {  
				panel1[i].setVisible(true);
			} 
			
		});
		
		
	}
	
	JPanel panel(String s){
		
		JLabel label=new JLabel(s);    
		label.setBounds(0,0,100,30);
		label.setFont(font1);
		label.setForeground(Color.white);
		
		JPanel panel=new JPanel();
        panel.setBounds(0,0,100,30);    
        panel.setBackground(new Color(100, 149, 237,100));
		panel.add(label); 

		return panel;
		
	}
	
	
	JLabel label(String s,int x,int y, int w, int h,Font font){
		
		JLabel label=new JLabel(s);    
		label.setBounds(x,y,w,h);
		label.setFont(font);
		label.setForeground(Color.black);
		return label;
	}
	
	JPanel panel(int x, int y, int w, int h){
		
		JPanel panel=new JPanel();  
        panel.setBounds(x,y,w,h);    
        panel.setBackground(new Color(124, 180, 107));
		return panel;
		
	}
	
	JLabel image(String s,int x,int y,int w,int h,int px, int py){
		
		ImageIcon imgIcon = new ImageIcon(s);
		Image image = imgIcon.getImage();
		Image temp_image = image.getScaledInstance(px,py,Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(temp_image);
		JLabel img = new JLabel("", imgIcon , JLabel.CENTER);
		img.setBounds(x,y,w,h);
		return img;
		
	}
	
	
	
	public static void main(String [] args){
		
		new Welcome();
		
	}
	
}
