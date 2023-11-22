import javax.swing.*;    
import java.awt.*;
import java.awt.event.*;
public class Chicken{

	private JFrame f = new JFrame("Chicken");
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	private Font font5 = new Font("Algerian",Font.BOLD,35);
	private Font font6 = new Font("Cambria Math",Font.BOLD,25);
	private Font font1 = new Font("Baguet Script",Font.BOLD,30);
	private JLabel []label  = new JLabel[4];
	private JLabel []label1 = new JLabel[4];
	private JLabel []label2 = new JLabel[4];
	private JLabel []label3 = new JLabel[4];
	private JLabel []label4 = new JLabel[4];
	private JLabel []label5 = new JLabel[4];
	private JPanel []panel  = new JPanel[4];
	private JPanel []panel1 = new JPanel[4];
	private JPanel []panel2 = new JPanel[4];
	private JPanel []panel3 = new JPanel[4];
	private JPanel []panel4 = new JPanel[4];
	private JPanel []p = new JPanel[4];
	private JPanel panel11 = new JPanel();
	private JPanel panel12 = new JPanel();
	private JPanel panel13 = new JPanel();
	private JPanel panel14 = new JPanel();
	private JComboBox cb1=new JComboBox();
	private JComboBox cb2=new JComboBox();
	private JComboBox cb3=new JComboBox();
	private JLabel l2= new JLabel();
	private JLabel l3= new JLabel();
	private JLabel l4= new JLabel();
	private JLabel label0= new JLabel();
	
	// ----
	int count = 0;
	int x5 = 0;
	int x6 = 0;
	int x7 = 0;
	int x8 = 0;
	int price100 = 0;
	int price101 = 0;
	int price102 = 0;
	int total;
	
	String []price = new String[3];
	String []price11 = new String[3];
	String []getItem = new String[3];
	
	
	Chicken(){
	
	f.setSize(800,600);
		f.getContentPane().setBackground(new Color(229,235,226));
		f.setLayout(null);
	
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
		
	JPanel p1 = panel(15,50,195,2,124, 180, 107); 
		
	JPanel menuPanel = new JPanel();
		menuPanel.setLayout(null);
		menuPanel.setBounds(0,0,800,130);
		menuPanel.setBackground(new Color(135, 206, 235));
		
	JLabel l1=new JLabel("Add Some Food");    
		l1.setBounds(280,70, 300,40); 
		l1.setFont(font1);
		l1.setForeground(Color.black);
		
		
		p[0] = panel(0,130,800,470,229,235,226); 
		p[0].setLayout(null);
		
	 p[1] = panel(0,130,500,470,229,235,226);
		p[2] = panel(500,130,300,470,190, 194, 203);
		p[1].setLayout(null);
		p[2].setLayout(null);
		p[1].setVisible(false);
		p[2].setVisible(false);
		
		
	label[0] = label("H:\\Java Project\\Image\\chicken.jpg",75, 50, 180,120,180,120);
		 label[1] = label("H:\\Java Project\\Image\\item2.jpg",310, 50, 180,120,180,120);
		 label[2] = label("H:\\Java Project\\Image\\item3.jpg",545, 50, 180,120,180,120);
		 label[3] = label("H:\\Java Project\\Image\\item4.jpg",310,240,180,120,180,120);
		 
		
		 
		label1[0] = label("H:\\Java Project\\Image\\chicken.jpg",0, 0, 180,120,195,135);
		label1[1] = label("H:\\Java Project\\Image\\item2.jpg",0, 0, 180,120,195,135);
		label1[2] = label("H:\\Java Project\\Image\\item3.jpg",0, 0, 180,120,195,135);
		label1[3] = label("H:\\Java Project\\Image\\item4.jpg",0, 0, 180,120,195,135);
		
		label4[0] = label("Roasted Chicken",75, 180,120,20);
		label4[1] = label("Chicken with Mixed Vegetable",310, 180,180,20);
		label4[2] = label("Chicken Curry",545, 180,120,20);
		label4[3] = label("Roasted Chicken with Cheese",310, 370,180,20);
		
		panel3[0] = panel("200 Taka");
		panel3[1] = panel("250 Taka");
		panel3[2] = panel("300 Taka");
		panel3[3] = panel("200 Taka");
		
		label1[0].setVisible(false);
		label1[1].setVisible(false);
		label1[2].setVisible(false);
		label1[3].setVisible(false);
		
		label1[0].setCursor(cursor); 
		label1[1].setCursor(cursor);
		label1[2].setCursor(cursor);
		label1[3].setCursor(cursor);
		
	label2[0] = label("H:\\Java Project\\Image\\chicken.jpg",50, 50, 180,120,180,120);
		label2[1] = label("H:\\Java Project\\Image\\item2.jpg",270, 50, 180,120,180,120);
		label2[2] = label("H:\\Java Project\\Image\\item3.jpg",50, 240, 180,120,180,120);
		label2[3] = label("H:\\Java Project\\Image\\item4.jpg",270,240,180,120,180,120);
		
		label3[0] = label("H:\\Java Project\\Image\\chicken.jpg",0, 0, 180,120,195,135);
		label3[1] = label("H:\\Java Project\\Image\\item2.jpg",0, 0, 180,120,195,135);
		label3[2] = label("H:\\Java Project\\Image\\item3.jpg",0, 0, 180,120,195,135);
		label3[3] = label("H:\\Java Project\\Image\\item4.jpg",0, 0, 180,120,195,135);
		
		label5[0] = label("Roasted Chicken",50, 180,120,20);
		label5[1] = label("Chicken with Mixed Vegetable",270, 180,180,20);
		label5[2] = label("Chicken Curry",50, 370,120,20);
		label5[3] = label("Roasted Chicken with Cheese",270, 370,180,20);
		
		panel4[0] = panel("200 Taka");
		panel4[1] = panel("250 Taka");
		panel4[2] = panel("300 Taka");
		panel4[3] = panel("200 Taka");
		
		label3[0].setVisible(false);
		label3[1].setVisible(false);
		label3[2].setVisible(false);
		label3[3].setVisible(false);
		
		label3[0].setCursor(cursor); 
		label3[1].setCursor(cursor);
		label3[2].setCursor(cursor);
		label3[3].setCursor(cursor);
		
		
	panel[0] = panel();
		panel[1] = panel();
		panel[2] = panel();
		panel[3] = panel();
		panel[0].setVisible(false);
		panel[1].setVisible(false);
		panel[2].setVisible(false);
		panel[3].setVisible(false);
		
		panel2[0] = panel();
		panel2[1] = panel();
		panel2[2] = panel();
		panel2[3] = panel();
		panel2[0].setVisible(false);
		panel2[1].setVisible(false);
		panel2[2].setVisible(false);
		panel2[3].setVisible(false);
		

		
		
	panel1[0] = panel();
		panel1[1] = panel();
		panel1[2] = panel();
		panel1[3] = panel();
		
		panel1[0].setVisible(false);
		panel1[1].setVisible(false);
		panel1[2].setVisible(false);
		panel1[3].setVisible(false);
		
	
		
		panel11.setBounds(0,15,300,70);
		panel11.setBackground(new Color(82,152,188));
		panel11.setVisible(false);
		panel11.setLayout(null);
		
		panel12.setBounds(0,100,300,70);
		panel12.setBackground(new Color(82,152,188));
		panel12.setVisible(false);
		panel12.setLayout(null);
		
		panel13.setBounds(0,185,300,70);
		panel13.setBackground(new Color(82,152,188));
		panel13.setVisible(false);
		panel13.setLayout(null);
		
		panel14.setBounds(0,350,300,70);
		panel14.setBackground(new Color(82,152,188));
		panel14.setLayout(null);
		panel14.setCursor(cursor);
		
		
			
		
		
		String s[]={"1","2","3","4","5","0"};        
		cb1=new JComboBox(s);    
		cb1.setBounds(5, 5,20,20);
		      
		cb2=new JComboBox(s);    
		cb2.setBounds(5, 5,20,20);
		     
		cb3=new JComboBox(s);    
		cb3.setBounds(5, 5,20,20);
		
		cb1.setCursor(cursor);
		cb2.setCursor(cursor);
		cb3.setCursor(cursor);
		
		
		
		
		getItem[0] = "1";
		price[0] = "200";
		price11[0] = getItem[0].concat(" × 200 = ").concat(price[0].concat("tk"));
		System.out.println("getItem[0]= "+getItem[0]);
		
		getItem[1] = "1";
		price[1] = "250";
		price11[1] = getItem[1].concat(" × 250 = ").concat(price[1].concat("tk"));
		System.out.println("getItem[1]= "+getItem[1]);
		
		getItem[2] = "1";
		price[2] = "300";
		price11[2] = getItem[2].concat(" × 300 = ").concat(price[2].concat("tk"));
		System.out.println("getItem[2]= "+getItem[2]);
		
	// ___________________
	 cb1.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				
				getItem[0] = (String)cb1.getSelectedItem();
				int i1 = Integer.parseInt(getItem[0]);
				price100 = i1*200;
				price[0] =  Integer.toString(price100);
				price11[0] = getItem[0].concat(" × 200 = ").concat(price[0].concat("tk"));
				l2.setText(price11[0]);
				
				total = price100 + price101 + price102;
				String s1 = "Total : "+total+"tk";
				label0.setText(s1);
				
				System.out.println("getItem[0]= "+getItem[0]+"  i1  "+i1+" price100 "+price100+" price[0] "+price[0]+" price11[0] "+price11[0]);
		}});
		
		cb2.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				
				getItem[1] = (String)cb2.getSelectedItem();
				int i1 = Integer.parseInt(getItem[1]);
				price101 = i1*250;
				price[1] =  Integer.toString(price101);
				price11[1] = getItem[1].concat(" × 250 = ").concat(price[1].concat("tk"));
				l3.setText(price11[1]);
				
				total = price100 + price101 + price102;
				String s1 = "Total : "+total+"tk";
				label0.setText(s1);
				
				System.out.println("getItem[1]= "+getItem[1]+"  i1  "+i1+" price101 "+price101+" price[1] "+price[1]+" price11[1] "+price11[1]);
		}});
		
		cb3.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
				
				getItem[2] = (String)cb3.getSelectedItem();
				int i1 = Integer.parseInt(getItem[2]);
				price102 = i1*300;
				price[2] =  Integer.toString(price102);
				price11[2] = getItem[2].concat(" × 300 = ").concat(price[2].concat("tk"));
				l4.setText(price11[2]);
				
				total = price100 + price101 + price102;
				String s1 = "Total : "+total+"tk";
				label0.setText(s1);
				
				System.out.println("getItem[2]= "+getItem[2]+"  i1  "+i1+" price102 "+price102+" price[2] "+price[2]+" price11[2] "+price11[2]);
		}});
		
	//Mouse Listener
	
		mouseListener(label[0],label1[0],panel[0],1);
		mouseListener(label[1],label1[1],panel[1],2);
		mouseListener(label[2],label1[2],panel[2],3);
		mouseListener(label[3],label1[3],panel[3],4);
		
		mouseListener(label2[0],label3[0],panel1[0],5);
		mouseListener(label2[1],label3[1],panel1[1],6);
		mouseListener(label2[2],label3[2],panel1[2],7);
		mouseListener(label2[3],label3[3],panel1[3],8);
		
		logoMouseListener(imgIcon,1);
		logoMouseListener(l9,2);
		logoMouseListener(l10,2);
		
		panel14.addMouseListener(new MouseListener(){
				
			public void mouseClicked(MouseEvent e) {
				
			}  
			public void mouseEntered(MouseEvent e) {
				label0.setForeground(Color.blue);
			}  
			public void mouseExited(MouseEvent e) {  
				label0.setForeground(Color.black);
			}  
			public void mousePressed(MouseEvent e) {  
				label0.setForeground(Color.black);
			}  
			public void mouseReleased(MouseEvent e) {  
				label0.setForeground(Color.blue);
			}
		});	
		
		
		
		JLabel ll=new JLabel("Back-end and Front-end - RIYADH");    
		ll.setBounds(20,530,300,20);
		ll.setForeground(Color.black);
		
	//add --------------------------------
	f.add(menuPanel);
	f.add(ll);
		menuPanel.add(l9);
		menuPanel.add(l10);
		menuPanel.add(p1);
		menuPanel.add(l1);
		menuPanel.add(imgIcon);
		
		f.add(p[0]);
		f.add(p[1]);
		f.add(p[2]);
		
		p[0].add(label4[0]);
		p[0].add(label4[1]);
		p[0].add(label4[2]);
		p[0].add(label4[3]);
		
		p[1].add(label5[0]);
		p[1].add(label5[1]);
		p[1].add(label5[2]);
		p[1].add(label5[3]);
		
		p[0].add(label[0]);
		p[0].add(label[1]);
		p[0].add(label[2]);
		p[0].add(label[3]);
		
		label[0].add(label1[0]);
		label[1].add(label1[1]);
		label[2].add(label1[2]);
		label[3].add(label1[3]);
		
		label1[0].add(panel[0]);
		label1[1].add(panel[1]);
		label1[2].add(panel[2]);
		label1[3].add(panel[3]);
		
		label1[0].add(panel3[0]);
		label1[1].add(panel3[1]);
		label1[2].add(panel3[2]); 
		label1[3].add(panel3[3]); 
	
		p[1].add(label2[0]);
		p[1].add(label2[1]);
		p[1].add(label2[2]);
		p[1].add(label2[3]);
		
		label2[0].add(label3[0]);
		label2[1].add(label3[1]);
		label2[2].add(label3[2]);
		label2[3].add(label3[3]);
		
		label3[0].add(panel1[0]);
		label3[1].add(panel1[1]);
		label3[2].add(panel1[2]);
		label3[3].add(panel1[3]);
	
		label3[0].add(panel4[0]);
		label3[1].add(panel4[1]);
		label3[2].add(panel4[2]);
		label3[3].add(panel4[3]);
	
		p[2].add(panel11);
		p[2].add(panel12);
		p[2].add(panel13);
		p[2].add(panel14);
		
		
	
	
	
	
	//------------------------------------------------------------------------
		Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
		f.setIconImage(icon);
		f.setLayout(null);    
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public void mouseListener(JLabel label1,JLabel label,JPanel panel,int x){
		
		label1.addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent e) {  
			
			if(x==1){
				p[0].setVisible(false);
				p[1].setVisible(true);
				p[2].setVisible(true);
				
				l2 = new JLabel(price11[0]);    
				l2.setBounds(180,45,150,20);
				l2.setForeground(Color.black);
				l2.setLayout(null);
				
				JLabel l1 = new JLabel("Roasted Chicken");    
				l1.setBounds(30,5,150,20);
				l1.setForeground(Color.black);
				l1.setLayout(null);
				
				price100 = 200;
				total = price100 + price101 + price102;
				label0 = new JLabel("Total : "+total+"tk");
				label0.setBounds(60,0,300,70);
				label0.setFont(font6);
				label0.setForeground(Color.black);
				
				panel11.add(cb1);
				panel11.add(l2);
				panel11.add(l1);
				panel14.add(label0);
				panel11.setVisible(true);
				
				
				
				count++;
				x5++;
				System.out.println("x5  "+x5);
				System.out.println("count  "+count);
			}
			if(x==2){
				p[0].setVisible(false);
				p[1].setVisible(true);
				p[2].setVisible(true);
				
				l3 = new JLabel(price11[1]);    
				l3.setBounds(180,45,150,20);
				l3.setForeground(Color.black);
				l3.setLayout(null);
				
				JLabel l1 = new JLabel("Chicken with Mixed Vegetable");    
				l1.setBounds(30,5,180,20);
				l1.setForeground(Color.black);
				l1.setLayout(null);
				
				price101 = 250;
				total = price100 + price101 + price102;
				label0 = new JLabel("Total : "+total+"tk");
				label0.setBounds(60,0,300,70);
				label0.setFont(font6);
				label0.setForeground(Color.black);
				
				panel11.add(cb2);
				panel11.add(l3);
				panel11.add(l1);
				panel14.add(label0);
				panel11.setVisible(true);
				
				count++;
				x6++;
				System.out.println("x6  "+x6);
				System.out.println("count  "+count);
			}
			if(x==3){
				p[0].setVisible(false);
				p[1].setVisible(true);
				p[2].setVisible(true);
				
				l4 = new JLabel(price11[2]);    
				l4.setBounds(180,45,150,20);
				l4.setForeground(Color.black);
				l4.setLayout(null);
				
				JLabel l1 = new JLabel("Chicken Curry");    
				l1.setBounds(30,5,150,20);
				l1.setForeground(Color.black);
				l1.setLayout(null);
				
				price102 = 300;
				total = price100 + price101 + price102;
				label0 = new JLabel("Total : "+total+"tk");
				label0.setBounds(60,0,300,70);
				label0.setFont(font6);
				label0.setForeground(Color.black);
				
				panel14.add(label0);
				panel11.add(l4);
				panel11.add(l1);
				panel11.add(cb3);
				
				panel11.setVisible(true);
				
				count++;
				x7++;
				System.out.println("x7  "+x7);
				System.out.println("count  "+count);
			}
			if(x==4){
				 JOptionPane.showMessageDialog(f,"Item is not available");  
			}
				
				
			if(x==5){
					
				System.out.println("x5 = "+x5);
				if (x5==0)
				{
							
				if(count==1){
					l2 = new JLabel(price11[0]);    
					l2.setBounds(180,45,150,20);
					l2.setForeground(Color.black);
					l2.setLayout(null);	
						
					JLabel l1=new JLabel("Roasted Chicken");    
					l1.setBounds(30,5,150,20);
					l1.setForeground(Color.black);
					l1.setLayout(null);
					
					price100 = 200;
					total = price100 + price101 + price102;
					String s1 = "Total : "+total+"tk";
					label0.setText(s1);
					
					panel12.add(cb1);
					panel12.add(l2);
					panel12.add(l1);
					panel12.setVisible(true);
					
					}
					
				if(count==2){
					l2 = new JLabel(price11[0]);    
					l2.setBounds(180,45,150,20);
					l2.setForeground(Color.black);
					l2.setLayout(null);
				
					JLabel l1=new JLabel("Roasted Chicken");    
					l1.setBounds(30,5,150,20);
					l1.setForeground(Color.black);
					l1.setLayout(null);
					
					price100 = 200;
					total = price100 + price101 + price102;
					String s1 = "Total : "+total+"tk";
					label0.setText(s1);
					
					panel13.add(cb1);
					panel13.add(l2);
					panel13.add(l1);
					panel13.setVisible(true);
					
					}
					
				count++;
				x5++;
				System.out.println("x5  "+x5);
				System.out.println("count  "+count);
				
				}}

				if(x==6){
					
					if (x6==0)
					{
						
						if(count==1){
							l3 = new JLabel(price11[1]);    
							l3.setBounds(180,45,150,20);
							l3.setForeground(Color.black);
							l3.setLayout(null);
							
							JLabel l=new JLabel("Chicken with Mixed Vegetable");    
							l.setBounds(30,5,180,20);
							l.setForeground(Color.black);
							l.setLayout(null);
							
							price101 = 250;
							total = price100 + price101 + price102;
							String s1 = "Total : "+total+"tk";
							label0.setText(s1);
							
							panel12.add(l);
							panel12.add(l3);
							panel12.add(cb2);
							panel12.setVisible(true);
							
							
						}
						if(count==2){
							l3 = new JLabel(price11[1]);    
							l3.setBounds(180,45,150,20);
							l3.setForeground(Color.black);
							l3.setLayout(null);
							
							JLabel l=new JLabel("Chicken with Mixed Vegetable");    
							l.setBounds(30,5,180,20);
							l.setForeground(Color.black);
							l.setLayout(null);
							
							price101 = 250;
							total = price100 + price101 + price102;
							String s1 = "Total : "+total+"tk";
							label0.setText(s1);
							
							panel13.add(l);
							panel13.add(l3);
							panel13.add(cb2);
							panel13.setVisible(true);
							
						}
					count++;
					x6++;
					System.out.println("x6  "+x6);
					System.out.println("count  "+count);
				}}
				if(x==7){
					
					if (x7==0)
					{
						
						if(count==1){
							l4 = new JLabel(price11[2]);    
							l4.setBounds(180,45,150,20);
							l4.setForeground(Color.black);
							l4.setLayout(null);
							
							JLabel l=new JLabel("Chicken Curry");    
							l.setBounds(30,5,150,20);
							l.setForeground(Color.black);
							l.setLayout(null);
							
							price102 = 300;
							total = price100 + price101 + price102;
							String s1 = "Total : "+total+"tk";
							label0.setText(s1);
							
							panel12.add(l);
							panel12.add(l4);
							panel12.add(cb3);
							panel12.setVisible(true);
							
							
						}
						if(count==2){
							l4 = new JLabel(price11[2]);    
							l4.setBounds(180,45,150,20);
							l4.setForeground(Color.black);
							l4.setLayout(null);
				
							JLabel l=new JLabel("Chicken Curry");    
							l.setBounds(30,5,150,20);
							l.setForeground(Color.black);
							l.setLayout(null);
							
							price102 = 300;
							total = price100 + price101 + price102;
							String s1 = "Total : "+total+"tk";
							label0.setText(s1);
							
							panel13.add(l);
							panel13.add(l4);
							panel13.add(cb3);
							panel13.setVisible(true);
							
							
						}
					count++;
					x7++;
					System.out.println("x7  "+x7);
					System.out.println("count  "+count);
				}}
				if(x==8){
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
	
	public void logoMouseListener(JLabel label,int x){
		
		label.addMouseListener(new MouseAdapter(){
			
			public void mouseClicked(MouseEvent e) {  
				if(x==1){
					new FoodBooking();
					f.setVisible(false);
				}
				if(x==2){
					new PostSignIn();
					f.setVisible(false);
				}
				
			} 
		});
	}

	private JPanel panel (){
		
		JPanel panel = new JPanel();
		panel.setBounds(0,0,180,120);
		panel.setBackground(new Color(0,0,0,100));
		panel.setLayout(null);
		return panel;
		
	}
	
	private JPanel panel (String s){
		
		JLabel label=new JLabel(s);    
		label.setBounds(35,0,180,120); 
		label.setFont(font6);
		label.setForeground(Color.white);
		
		JPanel panel = new JPanel();
		panel.setBounds(0,0,180,120);
		panel.setBackground(new Color(0,0,0,100));
		panel.setLayout(null);
		panel.add(label);
		
		return panel;
		
	}

	private JPanel panel(int x, int y, int w, int h,int r, int g, int b){
		
		JPanel panel=new JPanel();  
        panel.setBounds(x,y,w,h);    
        panel.setBackground(new Color(r,g,b));
		return panel;
		
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


	public static void main(String [] args){
		
		new Chicken();
		
	}
	
}