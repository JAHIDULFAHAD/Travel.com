import javax.swing.*;    
import java.awt.*;
import java.awt.event.*;
public class BusSeat{
	
	private int count=0;
	private int total;
	private String s="";
	private JLabel amount = new JLabel();
	protected JFrame f = new JFrame("Select Bus Seat");
	
		JLabel label(String text, int x,int y, int w, int h)
		{
		JLabel l1 = new JLabel(text);
		l1.setBounds(x,y,w,h);
		return l1;
		}
	Font font1(String text, int fSize)
		{
			Font font = new Font(text, Font.BOLD, fSize);
			return font;
		}
	JButton seat(String text, int x,int y, int w, int h)
		{
		JButton sampleSeat = new JButton(text);
		
     sampleSeat.setBounds(245,330,90,30);
	 sampleSeat.setBackground(new Color(72, 156, 196));
	 
     sampleSeat.setForeground(Color.black);
	
		sampleSeat.setBounds(x,y,w,h);
		return sampleSeat;
		}
	
	
		public void fair(JButton button){
		button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		button.setBackground(Color.WHITE);
		
		count = 200+count;
		amount.setText(s);
		amount.setBounds(250,410,400,30);
		amount.setLayout(null);
		f.add(amount);
			
			s= "Total Amount :   ".concat(String.valueOf(count)).concat(" Taka");
			
			}});
		
	}
	
	
		
	
	
	
	
		
	
	
	BusSeat()
	{
	
	f.setSize(800,600);
	f.setLayout(null);
//Logo Panel*****************************	
    JPanel panel1=new JPanel();  
        panel1.setBounds(0,0,800,70);    
        panel1.setBackground(new Color(124, 180, 107));
		panel1.setLayout(null);
		f.add(panel1);	
		
		
		
		JLabel travel = label("Travel",15,15,150,40);
		travel.setFont(font1("Algerian",35));
		panel1.add(travel);

	travel.addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent e) {  
				new Welcome();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) { 
		        travel.setToolTipText("Home Page");
				Cursor cursor3 = new Cursor(Cursor.HAND_CURSOR);
				travel.setCursor(cursor3);
			}  
			public void mouseExited(MouseEvent e) {  
			
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});
        JLabel com = label(".com",155,17,80,40);
		com.setFont(font1("Cambria Math",25));
		panel1.add(com);
		
	com.addMouseListener(new MouseListener(){
			
			public void mouseClicked(MouseEvent e) {  
				new Welcome();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) { 
		        com.setToolTipText("Home Page");
				Cursor cursor2 = new Cursor(Cursor.HAND_CURSOR);
				com.setCursor(cursor2);
				
			}  
			public void mouseExited(MouseEvent e) {  
			
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});	
	
//Return Icon******************************
			
	ImageIcon img = new ImageIcon("H:\\Java Project\\Image\\returnIcon.png");
		Image image1 = img.getImage();
		Image temp_image = image1.getScaledInstance(40,40,Image.SCALE_SMOOTH);
		img = new ImageIcon(temp_image);
		JLabel imgIcon = new JLabel("", img , JLabel.CENTER);
		imgIcon.setBounds(720,10,40,40);
		panel1.add(imgIcon);
		imgIcon.addMouseListener(new MouseListener(){
				
			
			public void mouseClicked(MouseEvent e) {
		        new bus1();
				f.setVisible(false);
			}  
			public void mouseEntered(MouseEvent e) {
				Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
				imgIcon.setCursor(cursor1);
				imgIcon.setToolTipText("Click here to go previous page");
			}  
			public void mouseExited(MouseEvent e) {  
				
			}  
			public void mousePressed(MouseEvent e) {  
				
			}  
			public void mouseReleased(MouseEvent e) {  
				
			}
});
	
    JLabel bus = label("Choose your seat",500,90,330,45);
		bus.setFont(font1("Cambria Math",25));
		f.add(bus);
		

	
	JPanel sPanel=new JPanel();  
        sPanel.setBounds(450,130,300,400);    
        sPanel.setBackground(new Color(44, 96, 120));
		sPanel.setLayout(null);
		f.add(sPanel);


	JButton b1 = seat("B1", 10,90,80,20);sPanel.add(b1);
	JButton c1 = seat("C1", 10,130,50,20);sPanel.add(c1);
	JButton d1 = seat("D1", 10,170,50,20);sPanel.add(d1);
	JButton e1 = seat("E1", 10,210,50,20);sPanel.add(e1);
	JButton f1 = seat("F1", 10,250,50,20);sPanel.add(f1);
	JButton g1 = seat("G1", 10,290,50,20);sPanel.add(g1);
	JButton h1 = seat("H1", 10,330,50,20);sPanel.add(h1);
	JButton i1 = seat("I1", 10,370,50,20);sPanel.add(i1);
	
	
	JButton c2 = seat("C2", 65,130,50,20);sPanel.add(c2);
	JButton d2 = seat("D2", 65,170,50,20);sPanel.add(d2);
	JButton e2 = seat("E2", 65,210,50,20);sPanel.add(e2);
	JButton f2 = seat("F3", 65,250,50,20);sPanel.add(f2);
	JButton g2 = seat("G3", 65,290,50,20);sPanel.add(g2);
	JButton h2 = seat("H3", 65,330,50,20);sPanel.add(h2);
	JButton i2 = seat("I3", 65,370,50,20);sPanel.add(i2);
	
	JButton a1 = seat("A1", 160,50,60,20);sPanel.add(a1);
	JButton b2 = seat("B2", 160,90,60,20);sPanel.add(b2);
	JButton c3 = seat("C3", 190,130,50,20);sPanel.add(c3);
	JButton d3 = seat("D3", 190,170,50,20);sPanel.add(d3);
	JButton e3 = seat("E3", 190,210,50,20);sPanel.add(e3);
	JButton f3 = seat("F3", 190,250,50,20);sPanel.add(f3);
	JButton g3 = seat("G3", 190,290,50,20);sPanel.add(g3);
	JButton h3 = seat("H3", 190,330,50,20);sPanel.add(h3);
	JButton i3 = seat("I3", 190,370,50,20);sPanel.add(i3);
	
	JButton a2 = seat("A2", 225,50,60,20);sPanel.add(a2);
	JButton b3 = seat("B3", 225,90,60,20);sPanel.add(b3);
	JButton c4 = seat("C4", 245,130,50,20);sPanel.add(c4);
	JButton d4 = seat("D4", 245,170,50,20);sPanel.add(d4);
	JButton e4 = seat("E4", 245,210,50,20);sPanel.add(e4);
	JButton f4 = seat("F4", 245,250,50,20);sPanel.add(f4);
	JButton g4 = seat("G4", 245,290,50,20);sPanel.add(g4);
	JButton h4 = seat("H4", 245,330,50,20);sPanel.add(h4);
	JButton i4 = seat("I4", 245,370,50,20);sPanel.add(i4);
	
	JButton Confirm = seat("Confirm Options", 200,500,200,30);f.add(Confirm);
	    Confirm.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		JOptionPane.showMessageDialog(null,"Seat Confirmed");
		
		}});

    fair(a1);
	fair(a2);
	fair(b1);
	fair(b2);
	fair(b3);
	fair(c1);
	fair(c2);
	fair(c3);
	fair(c4);
	fair(d1);
	fair(d2);
	fair(d3);
	fair(d4);
	fair(e1);
	fair(d2);
	fair(d3);
	fair(d4);
	fair(e1);
	fair(e2);
	fair(e3);
	fair(e4);
	fair(f1);
	fair(f2);
	fair(f3);
	fair(f4);
	fair(g1);
	fair(g2);
	fair(g3);
	fair(g4);
	fair(h1);
	fair(h2);
	fair(h3);
	fair(h4);
	fair(i1);
	fair(i2);
	fair(i3);
	fair(i4);
	

		ImageIcon img1 = new ImageIcon("H:\\Java Project\\Image\\BusPhoto.png");
		Image image2 = img1.getImage();
		Image temp_image1 = image2.getScaledInstance(400,300,Image.SCALE_SMOOTH);
		img1 = new ImageIcon(temp_image1);
		JLabel imgIcon1 = new JLabel("", img1 , JLabel.CENTER);
		imgIcon1.setBounds(10,80,400,300);
		f.add(imgIcon1);
		
		
		JLabel heading = label("Calculated Fair",30,400,600,45);
		heading.setFont(font1("Arial Rounded MT Bold",20));
		f.add(heading);
	
		JLabel developer = label("Minhajun Nabi Shiam",650,530,200,30);
		developer.setFont(font1("Cambria Math",10));
		f.add(developer);
	
		f.getContentPane().setBackground(new Color(232, 235, 226));
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

	public static void main(String [] args){
		
		new BusSeat();
		
	}
	
}