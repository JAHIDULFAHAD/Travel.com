import javax.swing.*;    
import java.awt.*;
import java.awt.event.*;

public class FoodBooking {
	
	private JFrame f = new JFrame("Food Booking");
	private JLabel []label = new JLabel[10];
	private JLabel []label1 = new JLabel[10];
	private JLabel []label2 = new JLabel[10];
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	private JPanel panel6 = new JPanel();
	
	
	
	FoodBooking(){
		
	f.setSize(800,600);
		f.getContentPane().setBackground(new Color(229,235,226));
		f.setLayout(null);
		
	Font font1 = new Font("Baguet Script",Font.BOLD,30);
		Font font2 = new Font("Arial",Font.BOLD,20);
		Font font5 = new Font("Algerian",Font.BOLD,35);
		Font font6 = new Font("Cambria Math",Font.BOLD,25);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(15,50,195,2);
		panel.setBackground(new Color(124, 180, 107));
		panel.setCursor(cursor);
		
	 label[0] = label("H:\\Java Project\\Image\\chicken.jpg",75, 170, 180,120,180,120);
		 label[1] = label("H:\\Java Project\\Image\\fish.jpg",310, 170, 180,120,180,120);
		 label[2] = label("H:\\Java Project\\Image\\steak.jpg",545, 170, 180,120,180,120);
		 label[3] = label("H:\\Java Project\\Image\\orange juice.jpg",75, 385, 180,120,180,120);
		 label[4] = label("H:\\Java Project\\Image\\coffee.jpg",310, 385, 180,120,180,120);
		 label[5] = label("H:\\Java Project\\Image\\lemonet.jpg",545, 385, 180,120,180,120);
		
	label1[0] = label("H:\\Java Project\\Image\\chicken.jpg",0, 0, 180,120,195,135);
		label1[1] = label("H:\\Java Project\\Image\\fish.jpg",0, 0, 180,120,195,135);
		label1[2] = label("H:\\Java Project\\Image\\steak.jpg",0, 0, 180,120,195,135);
		label1[3] = label("H:\\Java Project\\Image\\orange juice.jpg",0, 0, 180,120,195,135);
		label1[4] = label("H:\\Java Project\\Image\\coffee.jpg",0, 0, 180,120,195,135);
		label1[5] = label("H:\\Java Project\\Image\\lemonet.jpg",0, 0, 180,120,195,135);
		
		label1[0].setVisible(false);
		label1[1].setVisible(false);
		label1[2].setVisible(false);
		label1[3].setVisible(false);
		label1[4].setVisible(false);
		label1[5].setVisible(false);
		
		
		
		label2[0] = label("Chicken Item",75,290,180,30);
		label2[1] = label("Fish Item",310, 290, 180,30);
		label2[2] = label("Beef Item",545, 290, 180,30);
		label2[3] = label("Juice Item",75, 505, 180,30);
		label2[4] = label("Coffee Item",310,505,180,30);
		label2[5] = label("Cold Drink",545,505, 180,30);
		
		
		
		
		
	//logo------------------------------------
		
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
	
	ImageIcon imgReturn = new ImageIcon("H:\\Java Project\\Image\\returnIcon.png");
		Image image1 = imgReturn.getImage();
		Image temp_image = image1.getScaledInstance(40,40,Image.SCALE_SMOOTH);
		imgReturn = new ImageIcon(temp_image);
		JLabel imgIcon = new JLabel("", imgReturn , JLabel.CENTER);
		imgIcon.setBounds(720,10,40,40);
		imgIcon.setCursor(cursor);
		
		imgIcon.setCursor(cursor);
		
	JPanel menuPanel = new JPanel();
		menuPanel.setLayout(null);
		menuPanel.setBounds(0,0,800,110);
		menuPanel.setBackground(new Color(135, 206, 235));
		
		
	//-------------------------------------
	
	JLabel l1=new JLabel("Add Some Food");    
		l1.setBounds(280,50, 300,40); 
		l1.setFont(font1);
		l1.setForeground(Color.black);
	
	JLabel l2=new JLabel("___________________________________________________________");    
		l2.setBounds(75,99, 650,30); 
		l2.setFont(font2);
		l2.setForeground(Color.black);			//new Color(124, 180, 107)
	
	JLabel l3=new JLabel("Heavy Food");    
		l3.setBounds(608,130, 650,30); 
		l3.setFont(font2);
		l3.setForeground(Color.black);
		
	JLabel l4=new JLabel("___________________________________________________________");    
		l4.setBounds(75,315, 650,30); 
		l4.setFont(font2);
		l4.setForeground(Color.black);
	
	JLabel l5=new JLabel("Drinks");    
		l5.setBounds(655,345, 650,30); 
		l5.setFont(font2);
		l5.setForeground(Color.black);
		
		
		
	panel1.setBounds(0,0,180,120);
		panel1.setBackground(new Color(0,0,0,100));
		panel1.setLayout(null);
		
		panel2.setBounds(0,0,180,120);
		panel2.setBackground(new Color(0,0,0,100));
		panel2.setLayout(null);
		
		panel3.setBounds(0,0,180,120);
		panel3.setBackground(new Color(0,0,0,100));
		panel3.setLayout(null);
		
		panel4.setBounds(0,0,180,120);
		panel4.setBackground(new Color(0,0,0,100));
		panel4.setLayout(null);
		
		panel5.setBounds(0,0,180,120);
		panel5.setBackground(new Color(0,0,0,100));
		panel5.setLayout(null);
		
		panel6.setBounds(0,0,180,120);
		panel6.setBackground(new Color(0,0,0,100));
		panel6.setLayout(null);
		
		
		panel1.setVisible(false);
		panel2.setVisible(false);
		panel3.setVisible(false);
		panel4.setVisible(false);
		panel5.setVisible(false);
		panel6.setVisible(false); 
		
		

	

	label1[0].setCursor(cursor); 
		label1[1].setCursor(cursor);
		label1[2].setCursor(cursor);
		label1[3].setCursor(cursor);
		label1[4].setCursor(cursor);
		label1[5].setCursor(cursor);
		
		label[0].setToolTipText("Chicken Item");
		label[1].setToolTipText("Fish Item");
		label[2].setToolTipText("Beef Item");
		label[3].setToolTipText("Juice Item");
		label[4].setToolTipText("Coffee Item");
		label[5].setToolTipText("Cold Drink");
		
		JLabel ll=new JLabel("Back-end and Front-end - RIYADH");    
		ll.setBounds(580,530,300,20);
		ll.setForeground(Color.black);
	
	// Add -------------------------------------------
	    
		f.add(menuPanel);
		menuPanel.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(ll);
		
		menuPanel.add(imgIcon);
		menuPanel.add(l9);
		menuPanel.add(l10);
		menuPanel.add(panel);
		
		f.add(label[0]);
		f.add(label[1]);
		f.add(label[2]);
		f.add(label[3]);
		f.add(label[4]);
		f.add(label[5]);
		
		f.add(label2[0]);
		f.add(label2[1]);
		f.add(label2[2]);
		f.add(label2[3]);
		f.add(label2[4]);
		f.add(label2[5]);
		
		label[0].add(label1[0]);
		label[1].add(label1[1]);
		label[2].add(label1[2]);
		label[3].add(label1[3]);
		label[4].add(label1[4]);
		label[5].add(label1[5]);
	
		label1[0].add(panel1);
		label1[1].add(panel2);
		label1[2].add(panel3);
		label1[3].add(panel4);
		label1[4].add(panel5);
		label1[5].add(panel6);
	
	
	//Mouse Listener
		
		actionListener(l9,0);
		actionListener(l10,0);
		actionListener(imgIcon,1);
		mouseListener(label[0],label1[0],panel1,1);
		mouseListener(label[1],label1[1],panel2,0);
		mouseListener(label[2],label1[2],panel3,0);
		mouseListener(label[3],label1[3],panel4,0);
		mouseListener(label[4],label1[4],panel5,0);
		mouseListener(label[5],label1[5],panel6,0);
		
		
		
		Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
		f.setIconImage(icon);
		f.setLayout(null);    
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JLabel label(String s,int x, int y, int w,int h, int x1, int y1){
		
		ImageIcon icon = new ImageIcon(s);
		Image img2 = icon.getImage();
		Image temp_img2 = img2.getScaledInstance(x1,y1,Image.SCALE_SMOOTH);
		icon = new ImageIcon(temp_img2);
		
		JLabel label = new JLabel("", icon , JLabel.CENTER);
		label.setBounds(x,y,w,h);
		label.setLayout(null);
		
		return label;
		
	}
	
	private JLabel label(String s,int x, int y, int w,int h){
		
		JLabel label = new JLabel(s);
		label.setBounds(x,y,w,h);
		label.setLayout(null);
		
		return label;
		
	}
	
	public void actionListener(JLabel label,int x){
		
		label.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(x==0){
					new PostSignIn();
					f.setVisible(false);
				}
				
				if(x==1){
					new Royal();
					f.setVisible(false);
				}
				
			}			
		});
	}
	
	public void mouseListener(JLabel label1,JLabel label, JPanel panel,int x){
		
		label1.addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent e) {  
				if(x==1){
					new Chicken();
					f.setVisible(false);
				}else{
					JOptionPane.showMessageDialog(f,"Item is not available");
				}
			}  
			public void mouseEntered(MouseEvent e) {  
				label.setVisible(true);
			}  
			public void mouseExited(MouseEvent e) {  
				label.setVisible(false);
			}  
			public void mousePressed(MouseEvent e) {  
				panel.setVisible(true);
			}  
			public void mouseReleased(MouseEvent e) {  
				panel.setVisible(false);
			} 
			
		});
		
	}
	
	public static void main(String [] args){
		
		new FoodBooking();
		
	}
}