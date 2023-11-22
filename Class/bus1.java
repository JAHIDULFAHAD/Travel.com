import javax.swing.*;    
import java.awt.*;
import java.util.regex.*;
import java.awt.event.*;
import java.io.*;
public class bus1{
	
	private String city[]={"Select City","Dhaka","Cumilla","Chittagong","Cox's Bazar","Barisal","Brahmanbaria","Sylhet"};
	 private String dates[]= {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", 
                              "26", "27", "28", "29", "30","31" };
    private String months[]
        = {"Months", "Jan", "Dec" };
    private String years[]
        = {"Year","2022","2023"};
	private String time[]
	       ={"Select Time","8:00 am","10:00 am","12:00 pm","2:00 pm","4:00 pm","8:00 pm"};
		   
    private String bust[]
	        ={"Select Bus Type","Ac","Non Ac"};
			
 private String data[][]= {
            { "08:00 am","Yes","Yes"},
            {"10:00 am","Yes","Yes"},
			{"12:00 pm","Yes","Yes"},
		    {"02:00 pm","Yes","Yes"},
			{"04:30 pm","Yes","Yes"},
			{"08:00 pm","Yes","Yes"},
        };	
    
	private String columnNames[] = { "Time", "Ac", "Non Ac" };
	
	String s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21;
	

 bus1() { 
//font --------------- 
	Font font1 = new Font("MANOSPAC", Font.BOLD, 30);
	Font font2 = new Font("Arial ", Font.BOLD, 14);
	Font font3 =new Font("Arial Italic",Font.BOLD,12);
	Font font4=new Font("Cambria Math",Font.BOLD,20);
	Font font5=new Font("Algerian",Font.BOLD,25);
	
	
	//Frame --------------
	JFrame f=new JFrame("Bus");
	f.getContentPane().setBackground(new Color(232, 235, 226));
		//Header -------------
	JPanel heading = new JPanel();
	heading.setLayout(null);
	heading.setBackground(new Color(171,214,223));
	heading.setBounds(0,0,800,80);
	
	
	JLabel travel = new JLabel("Travel");
	travel.setBounds(20,15,150,40);
	travel.setFont(font5);
	heading.add(travel);
	Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
		travel.setCursor(cursor1);
		travel.setLayout(null);
    travel.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new PostSignIn();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    travel.setToolTipText("Home Page");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
    JLabel com = new JLabel(".com");
	com.setForeground(new Color(255,0,0));
	com.setBounds(120,17,80,40);
    com.setFont(font4);
    heading.add(com);
	JPanel panel5=new JPanel();  
    panel5.setBounds(18,45,145,2);    
    panel5.setBackground(new Color(124, 180, 107)); 
    heading.add(panel5);
	
	ImageIcon backgroundIcon1 = new ImageIcon("H:\\Java Project\\Image\\returnIcon.png");
	Image img6 = backgroundIcon1.getImage();
    Image temp_img6 = img6.getScaledInstance(50,50,Image.SCALE_SMOOTH);
	backgroundIcon1 = new ImageIcon(temp_img6);
	JLabel l3 = new JLabel("", backgroundIcon1 , JLabel.CENTER);
	l3.setBounds(725,10,50,50);
	l3.setLayout(null);
	heading.add(l3);
	Cursor cursor123 = new Cursor(Cursor.HAND_CURSOR);
		l3.setCursor(cursor123);
		l3.setLayout(null);
    l3.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new PostSignIn();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    l3.setToolTipText("Back");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	
	//bus panel---------------
	JPanel bus= new JPanel();
	bus.setLayout(null);
	bus.setBounds(350,80,450,500);
	bus.setBackground(new Color(124, 180, 107));
	
	//name
	
	
	 JLabel c11=new JLabel("From:");    
    c11.setBounds(40,40, 100,30);
	c11.setFont(font2);
	c11.setForeground(Color.black);
	bus.add(c11);
   JComboBox co = new JComboBox(city);
   co.setFont(font2);
   co.setBounds(160,40,170,30);
   co.setBackground(new Color(124, 180, 107));
   co.setFocusable(false);
   co.setForeground(Color.black);
   bus.add(co);
   
    JLabel c111=new JLabel("To:");    
    c111.setBounds(40,80, 100,30);
	c111.setFont(font2);
	c111.setForeground(Color.black);
	bus.add(c111);
   JComboBox co1 = new JComboBox(city);
   co1.setFont(font2);
   co1.setBounds(160,80,170,30);
   co1.setBackground(new Color(124, 180, 107));
   co1.setFocusable(false);
   co1.setForeground(Color.black);
   bus.add(co1);
   
   final JLabel dob = new JLabel("Date Of Journey:");
     dob.setFont(font2);
     dob.setBounds(40,120,150,30);
	 dob.setForeground(Color.black);
     bus.add(dob);
 
     JComboBox date = new JComboBox(dates);
     date.setFont(font2);
     date.setBounds(160,120,60,30);
	 date.setBackground(new Color(124, 180, 107));
    date.setFocusable(false);
    date.setForeground(Color.black);
     bus.add(date);
 
     JComboBox month = new JComboBox(months);
     month.setFont(font2);
     month.setBounds(220,120,90,30);
	 month.setBackground(new Color(124, 180, 107));
     month.setFocusable(false);
     month.setForeground(Color.black);
     bus.add(month);
 
     JComboBox year = new JComboBox(years);
     year.setFont(font2);
     year.setBounds(310,120,90,30);
	 year.setBackground(new Color(124, 180, 107));
     year.setFocusable(false);
     year.setForeground(Color.black);
     bus.add(year);
	
	 JLabel c1=new JLabel("Time:");    
    c1.setBounds(40,160, 100,30);
	c1.setFont(font2);
	c1.setForeground(Color.black);
	bus.add(c1);
   JComboBox co11 = new JComboBox(time);
   co11.setFont(font2);
   co11.setBounds(160,160,170,30);
   co11.setBackground(new Color(124, 180, 107));
   co11.setFocusable(false);
   co11.setForeground(Color.black);
   bus.add(co11);
	
	 JLabel c1112=new JLabel("Bus Type:");    
    c1112.setBounds(40,200, 100,30);
	c1112.setFont(font2);
	c1112.setForeground(Color.black);
	bus.add(c1112);
   JComboBox co12 = new JComboBox(bust);
   co12.setFont(font2);
   co12.setBounds(160,200,170,30);
   co12.setBackground(new Color(124, 180, 107));
   co12.setFocusable(false);
   co12.setForeground(Color.black);
   bus.add(co12);
   
   final JLabel dob1 = new JLabel("Date Of Return:");
     dob1.setFont(font2);
     dob1.setBounds(40,240,150,30);
	 dob1.setForeground(Color.black);
     bus.add(dob1);
 
     JComboBox date1 = new JComboBox(dates);
     date1.setFont(font2);
     date1.setBounds(160,240,60,30);
	 date1.setBackground(new Color(124, 180, 107));
    date1.setFocusable(false);
    date1.setForeground(Color.black);
     bus.add(date1);
 
     JComboBox month1 = new JComboBox(months);
     month1.setFont(font2);
     month1.setBounds(220,240,90,30);
	 month1.setBackground(new Color(124, 180, 107));
     month1.setFocusable(false);
     month1.setForeground(Color.black);
     bus.add(month1);
 
     JComboBox year1 = new JComboBox(years);
     year1.setFont(font2);
     year1.setBounds(310,240,90,30);
	 year1.setBackground(new Color(124, 180, 107));
     year1.setFocusable(false);
     year1.setForeground(Color.black);
     bus.add(year1);
	
	 JLabel c13=new JLabel("Time:");    
    c13.setBounds(40,280, 100,30);
	c13.setFont(font2);
	c13.setForeground(Color.black);
	bus.add(c13);
   JComboBox co113 = new JComboBox(time);
   co113.setFont(font2);
   co113.setBounds(160,280,170,30);
   co113.setBackground(new Color(124, 180, 107));
   co113.setFocusable(false);
   co113.setForeground(Color.black);
   bus.add(co113);
	
	 JLabel c112=new JLabel("Bus Type:");    
    c112.setBounds(40,320, 100,30);
	c112.setFont(font2);
	c112.setForeground(Color.black);
	bus.add(c112);
   JComboBox co123 = new JComboBox(bust);
   co123.setFont(font2);
   co123.setBounds(160,320,170,30);
   co123.setBackground(new Color(124, 180, 107));
   co123.setFocusable(false);
   co123.setForeground(Color.black);
   bus.add(co123);
   
   //Button------------
	 JButton b = new JButton("Confirm");  
	 b.setBounds(170,370, 100,30);
	 b.setFont(font2);
	 b.setBackground(new Color(171,214,223));
     b.setFocusable(false);
     b.setForeground(Color.black);
	 b.setBorderPainted(false);
	 // b.setContentAreaFilled(false);
	  //b.setBorderPainted(false);
	 bus.add(b);
	 
	 Cursor cursor124 = new Cursor(Cursor.HAND_CURSOR);
		b.setCursor(cursor124);
		b.setLayout(null);
    b.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new BusSeat();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b.setToolTipText("Please Confirm");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  JPanel bus12 = new JPanel();
	bus12.setLayout(null);
	bus12.setBounds(50,170,250,200);
	bus12.setBackground(new Color(124, 180, 107));
	//bus12.setVisible(false);
	f.add(bus12);
	
	JLabel name = new JLabel("Available buses on the route of ");
	name.setBounds(10,05,350,40);
	name.setFont(font2);
	name.setForeground(Color.black);
	bus12.add(name);
	JLabel name1 = new JLabel("Dhaka,Cumilla and Chitagong on ");
	name1.setBounds(10,20, 350,40);
	name1.setFont(font2);
	name1.setForeground(Color.black);
	bus12.add(name1);
	JLabel name12 = new JLabel("the follwing time ");
	name12.setBounds(10,35, 350,40);
	name12.setFont(font2);
	name12.setForeground(Color.black);
	bus12.add(name12);
	 
	 JTable b3 = new JTable(data,columnNames);
	 b3.setBackground(new Color(124, 180, 107));
     b3.setFocusable(false);
	 b3.setFont(font2);
     b3.setForeground(Color.black);
	 JScrollPane sp = new JScrollPane(b3);
	 
	 sp.setVisible(true);
	 sp.setBounds(10,70,230,120);
	sp.setForeground(Color.black);
	 //sp.setPreferredSize(new Dimension(400,400));
     bus12.add(sp);
	
		
	JLabel name123 = new JLabel("Front-end -- FAHAD  ||  Back-end -- FAHAD");
	name123.setBounds(180,450,300,40);
	name123.setFont(font3);
	name123.setForeground(Color.black);
	bus.add(name123);	
 
	//panel add
	f.add(bus);
	f.add(heading);
	//*add
	// f.add(b1);
	Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
	f.setIconImage(icon);
	 f.setSize(800,600);    
     f.setLayout(null);    
     f.setVisible(true);
	 f.setLocationRelativeTo(null);
	 f.setResizable(false);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	co.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                s10 = (String)co.getSelectedItem();
        }});
		
	co1.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s11 = (String)co1.getSelectedItem();
      }});
	  
	  date.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s12 = (String)date.getSelectedItem();
      }});
	  
	  month.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s13 = (String)month.getSelectedItem();
      }});
	  
	  year.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s14 = (String)year.getSelectedItem();
      }});
	  
	  co11.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s15 = (String)co11.getSelectedItem();
      }});
	  
	  co12.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s16 = (String)co12.getSelectedItem();
      }});
	  
	  date1.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s17 = (String)date1.getSelectedItem();
      }});
	  
	  month1.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s18 = (String)month1.getSelectedItem();
      }});
	  
	   year1.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s19 = (String)year1.getSelectedItem();
      }});
	  
	   co113.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s20 = (String)co113.getSelectedItem();
      }});
	  
	   co123.addActionListener(new ActionListener(){

         public void actionPerformed(ActionEvent e){

                 s21 = (String)co123.getSelectedItem();
      }});
	 
	  b.addActionListener(new ActionListener(){
		 
		 public void actionPerformed(ActionEvent e){
			 
			 try{
				 
				 FileWriter fw = new FileWriter("bus.txt",true);
				 //String s1 = s10.getText();
				 //String s2 = co1.getText();
				if(s10==null||s11==null||s12==null||s13==null||s14==null||s15==null||s16==null||s17==null||s18==null||s19==null||s20==null||s21==null){
				    JOptionPane.showMessageDialog(f,"Please correctly fil up");}
			    else 
				{
			        if(s10.equals("Dhaka")&&s11.equals("Cumilla")||s10.equals("Dhaka")&&s11.equals("Chittagong")||s10.equals("Chittagong")&&s11.equals("Cumilla")||s10.equals("Chittagong")&&s11.equals("Dhaka")||s10.equals("Cumilla")&&s11.equals("Chittagong")||s10.equals("Cumilla")&&s11.equals("Dhaka")){
					    
						fw.write("\n"+"From : "+s10+"\n"+"To : "+s11+"\n"+"Date of Birth : "+s12+"-"+s13+"-"+s14+"\n"+"Time : "+s15+"\n"+"Bus Type : "+s16+"\n"+"Date of Return : "+s17+"-"+s18+"-"+s19+"\n"+"Time : "+s20+"\n"+"Bus Type : "+s21);}
					
					else
					{
						JOptionPane.showMessageDialog(f," This route is not available");
						
				}}
				
				
				
				 
				 fw.close();
				 
			 }catch(Exception e1){
				 
			 }
			 
		 }
		 
	 });
	 
	}
	
	
	public static void main(String [] args){
                 new bus1();
	 
	}
}  
	