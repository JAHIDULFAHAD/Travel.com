import javax.swing.*;    
import java.awt.*;
import java.util.regex.*;
import java.awt.event.*;
public class profileedit{
	
	 private String dates[]= {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", 
                              "26", "27", "28", "29", "30","31" };
    private String months[]
        = {"Months", "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private String years[]
        = {"Year","1990","1991","1992","1993","1994", "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020","2021","2022"};
			 private String country[]
	       ={"Select Country","Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Australia","Austria","Austrian Empire",
"Azerbaijan","Baden","Bahamas","Bahrain","Bangladesh","Barbados","Bavaria","Belarus","Belgium","Belize","Benin","Bolivia","Bosnia and Herzegovina",
"Botswana","Brazil","Brunei","Brunswick and Lüneburg","Bulgaria","Burkina Faso","Burma","Burundi","Cabo Verde","Cambodia","Cameroon","Canada","Cayman Islands",
"The Central African Republic","Central American Federation","Chad","Chile","China","Colombia","Comoros","Congo Free State", "The Costa Rica","Cote d’Ivoire (Ivory Coast)",
"Croatia","Cuba","Cyprus","Czechia","Czechoslovakia","Democratic Republic of the Congo","Denmark","Djibouti","Dominica","Dominican Republic","Duchy of Parma",
"East Germany","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Eswatini","Ethiopia","Fiji","Finland","France","Georgia","Germany","Ghana",
"Haiti","Holy See","Honduras","Hungary","Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy","Jamaica","Japan","Jordan","Kazakhstan","Kenya",
"Korea","Kosovo","Kuwait","Kyrgyzstan","Liberia","Libya","Liechtenstein","Lithuania","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius",
"Mexico","Micronesia","Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique","Namibia","Nassau","Nauru","Nepal","Netherlands", "The New Zealand","Nicaragua","Niger","Nigeria","North German Confederation","North German Union",
"North Macedonia","Norway","Oldenburg","Oman","Orange Free State","Pakistan","Palau","Panama","Papal States","Papua New Guinea","Paraguay","Peru","Philippines","Piedmont-Sardinia","Poland","Portugal",
"Qutar","Romania","Russia","Rwanda","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone","Singapore","South Africa","South Sudan","Spain","SriLanka","Sudan","Suriname","Sweden","Switzerland",
 "Thailand","Turkey","Uganda","Ukraine","United Arab Emirates","The United Kingdom", "The Uruguay","Uzbekistan","Vanuatu","Venezuela","Vietnam","Württemberg","Yemen","Zambia","Zimbabwe"};
	
	profileedit(){
		
		
		
//frame
	JFrame f = new JFrame("Edit Profile");
	f.getContentPane().setBackground(new Color(232, 235, 226));
	
//font
	Font font1 = new Font("MANOSPAC", Font.BOLD, 17);
	Font font2 = new Font("Arial ", Font.BOLD, 14);
	Font font3 =new Font("Arial Italic",Font.BOLD,12);
	Font font4=new Font("Cambria Math",Font.BOLD,20);
	Font font5=new Font("Algerian",Font.BOLD,25);
	Font font6 =new Font("Arial Italic",Font.BOLD,10);
	//Header -------------
	JPanel heading = new JPanel();
	heading.setLayout(null);
	heading.setBackground(new Color(171,214,223));
	heading.setBounds(0,0,800,120);
	
	
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
	JPanel panel54=new JPanel();  
    panel54.setBounds(18,45,145,2);    
    panel54.setBackground(new Color(124, 180, 107)); 
    heading.add(panel54);
		
	
//panel---------------
     JPanel panel53=new JPanel();  
    panel53.setBounds(18,45,145,0);    
    panel53.setBackground(new Color(124, 180, 107)); 
    heading.add(panel53);
	 
	JPanel panel5=new JPanel();  
    panel5.setBounds(300,90,4,30);    
    panel5.setBackground(new Color(124, 180, 107)); 
    heading.add(panel5);
	
	JPanel panel51=new JPanel();  
    panel51.setBounds(570,90,4,30);    
    panel51.setBackground(new Color(124, 180, 107)); 
    heading.add(panel51);
	
//all name

    JLabel l1=new JLabel("   Personal Information       ");    
    l1.setBounds(80,70,220,50);
	l1.setFont(font1);
	l1.setForeground(Color.black);
	heading.add(l1);
	JPanel login1 = new JPanel();
	login1.setLayout(null);
	login1.setBounds(150,200,500,200);
	login1.setBackground(new Color(175,238,238));
	//login1.setVisible(false);
	f.add(login1);
	
    final JTextField text = new JTextField(); 
    text.setBounds(135,20,150,30);
	text.setLayout(null);
	text.setFont(font2);
    text.setOpaque(false);
    text.setForeground(new Color(0x292929));
    text.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login1.add(text);
	JLabel t11=new JLabel();    
    t11.setBounds(310,20,200,30);
	t11.setFont(font3);
	t11.setForeground(Color.red);
	login1.add(t11);
	text.addKeyListener(new KeyListener(){
    public void keyPressed (KeyEvent e) { } 
    public void keyReleased (KeyEvent e) {    
         String s1 = "^[a-zA-Z]{3,30}$";
		Pattern p=Pattern.compile(s1);
		Matcher m=p.matcher(text.getText());
		if(!m.matches()){
			t11.setText("Name is incorrect!");
		}
		else{
			t11.setText(null);
		} 
	}   
    public void keyTyped (KeyEvent e) { }    
	});
    JLabel n1=new JLabel("Fist Name:");    
    n1.setBounds(30,20,80,30);
	n1.setFont(font2);
	n1.setForeground(Color.black);
	login1.add(n1);
	
	final JTextField t= new JTextField(); 	
    t.setBounds(135,60,150,30);
	t.setLayout(null);
	t.setFont(font2);
    t.setOpaque(false);
    t.setForeground(new Color(0x292929));
    t.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login1.add(t);
	JLabel t111=new JLabel();    
    t111.setBounds(310,60,200,30);
	t111.setFont(font3);
	t111.setForeground(Color.red);
	login1.add(t111);
	t.addKeyListener(new KeyListener(){
    public void keyPressed (KeyEvent e) { } 
    public void keyReleased (KeyEvent e) {    
         String s1 = "^[a-zA-Z]{3,30}$";
		Pattern p=Pattern.compile(s1);
		Matcher m=p.matcher(t.getText());
		if(!m.matches()){
			t111.setText("Name is incorrect!");
		}
		else{
			t111.setText(null);
		} 
	}   
    public void keyTyped (KeyEvent e) { }    
	});
    JLabel t1=new JLabel("Last Name:");    
    t1.setBounds(30,60,80,30);
	t1.setFont(font2);
	t1.setForeground(Color.black);
	login1.add(t1);
	
	final JLabel gender = new JLabel("Gender:");
    gender.setFont(font2);
    gender.setBounds(30,100,128,30);
	gender.setForeground(Color.black);
    login1.add(gender);
 
    final JRadioButton male = new JRadioButton("Male");
    male.setFont(font2);
    male.setSelected(true);
    male.setBounds(135,100,60,30);
	male.setBackground(new Color(175,238,238));
    male.setFocusable(false);
    male.setForeground(Color.black);
    login1.add(male);
 
    final JRadioButton female = new JRadioButton("Female");
    female.setFont(font2);
    female.setSelected(false);
    female.setBounds(200,100,80,30);
	female.setBackground(new Color(175,238,238));
    female.setFocusable(false);
    female.setForeground(Color.black);
    login1.add(female);
 
    ButtonGroup gengp = new ButtonGroup();
    gengp.add(male);
    gengp.add(female);
	
	final JLabel dob = new JLabel("Date Of Birth:");
     dob.setFont(font2);
     dob.setBounds(30,140,100,30);
	 dob.setForeground(Color.black);
     login1.add(dob);
 
     JComboBox date = new JComboBox(dates);
     date.setFont(font2);
     date.setBounds(130,140,60,30);
	 date.setBackground(new Color(175,238,238));
    date.setFocusable(false);
    date.setForeground(Color.black);
     login1.add(date);
 
     JComboBox month = new JComboBox(months);
     month.setFont(font2);
     month.setBounds(200,140,90,30);
	 month.setBackground(new Color(175,238,238));
     month.setFocusable(false);
     month.setForeground(Color.black);
     login1.add(month);
 
     JComboBox year = new JComboBox(years);
     year.setFont(font2);
     year.setBounds(300,140,90,30);
	 year.setBackground(new Color(175,238,238));
     year.setFocusable(false);
     year.setForeground(Color.black);
     login1.add(year);
	 
	JLabel ll1=new JLabel("           Contact Information    ");    
    ll1.setBounds(300,70, 250,50);
	ll1.setFont(font1);
	ll1.setForeground(Color.black);
	heading.add(ll1);
	
	JPanel login12 = new JPanel();
	login12.setLayout(null);
	login12.setBounds(150,200,500,180);
	login12.setBackground(new Color(175,238,238));
	login12.setVisible(false);
	f.add(login12);
	
	final JTextField t2 = new JTextField(); 
    t2.setBounds(170,20,170,30);
	t2.setLayout(null);
	t2.setFont(font2);
    t2.setOpaque(false);
    t2.setForeground(new Color(0x292929));
    t2.setBorder(BorderFactory.createMatteBorder(0, 0,2, 0,new Color(10,10,10)));
	login12.add(t2); 
	JLabel t13=new JLabel();    
    t13.setBounds(350,20,200,30);
	t13.setFont(font3);
	t13.setForeground(Color.red);
	login12.add(t13);
	t2.addKeyListener(new KeyListener(){
    public void keyPressed (KeyEvent e) { } 
    public void keyReleased (KeyEvent e) {    
         String s1 = "^[0-9]{3,12}$";
		Pattern p=Pattern.compile(s1);
		Matcher m=p.matcher(t2.getText());
		if(!m.matches()){
			t13.setText("Number is incorrect!");
		}
		else{
			t13.setText(null);
		} 
	}   
    public void keyTyped (KeyEvent e) { }    
	});
    JLabel n=new JLabel("Contacts Number:");    
    n.setBounds(30,20, 128,30);
	n.setFont(font2);
	n.setForeground(Color.black);
	login12.add(n);
	
	
	
	final JTextField p = new JTextField(); 
    p.setBounds(170,80,170,30);
    p.setLayout(null);
	p.setFont(font2);
    p.setOpaque(false);
    p.setForeground(new Color(0x292929));
    p.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login12.add(p);
	JLabel t133=new JLabel();    
    t133.setBounds(350,80,200,30);
	t133.setFont(font3);
	t133.setForeground(Color.red);
	login12.add(t133);
	p.addKeyListener(new KeyListener(){
    public void keyPressed (KeyEvent e) { } 
    public void keyReleased (KeyEvent e) {    
         String s1 = "^[a-z0-9]{3,30}[@][a-zA-Z]{3,10}[.][a-zA-Z]{2,6}$";
		Pattern p1=Pattern.compile(s1);
		Matcher m=p1.matcher(p.getText());
		if(!m.matches()){
			t133.setText("Email is incorrect!");
		}
		else{
			t133.setText(null);
		} 
	}   
    public void keyTyped (KeyEvent e) { }    
	});
    JLabel pa1=new JLabel("Email: ");    
    pa1.setBounds(30,80, 135,30);
	pa1.setFont(font2);
	pa1.setForeground(Color.black);
	login12.add(pa1);
	
    JLabel ll12=new JLabel("                Address       ");    
    ll12.setBounds(550,70, 200,50);
	ll12.setFont(font1);
	ll12.setForeground(Color.black);
	heading.add(ll12);
	
	JPanel login123 = new JPanel();
	login123.setLayout(null);
	login123.setBounds(150,200,500,180);
	login123.setBackground(new Color(175,238,238));
	login123.setVisible(false);
	f.add(login123);
	
	JLabel c11=new JLabel("Country:");    
    c11.setBounds(30,20, 100,30);
	c11.setFont(font2);
	c11.setForeground(Color.black);
	login123.add(c11);
	JComboBox co = new JComboBox(country);
	co.setFont(font2);
    co.setBounds(130,20,170,30);
    co.setBackground(new Color(175,238,238));
   co.setFocusable(false);
   co.setForeground(Color.black);
    
	login123.add(co);
	
	
	final JTextField p1 = new JTextField(); 
    p1.setBounds(130,60,170,30);
    p1.setLayout(null);
	p1.setFont(font2);
    p1.setOpaque(false);
    p1.setForeground(new Color(0x292929));
    p1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login123.add(p1);
    JLabel pa12=new JLabel("Area: ");    
    pa12.setBounds(30,60,135,30);
	pa12.setFont(font2);
	pa12.setForeground(Color.black);
	login123.add(pa12);
	
	final JTextField p12 = new JTextField(); 
    p12.setBounds(130,100,170,30);
    p12.setLayout(null);
	p12.setFont(font2);
    p12.setOpaque(false);
    p12.setForeground(new Color(0x292929));
    p12.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
	login123.add(p12);
    JLabel pa123=new JLabel("Address: ");    
    pa123.setBounds(30,100,135,30);
	pa123.setFont(font2);
	pa123.setForeground(Color.black);
	login123.add(pa123);
	
	
	//Button------------
	 JButton b = new JButton("Save");  
	 b.setBounds(350,500, 100,30);
	 // b.setContentAreaFilled(false);
	  //b.setBorderPainted(false);
	 f.add(b);
	 
	 Cursor cursor124 = new Cursor(Cursor.HAND_CURSOR);
		b.setCursor(cursor124);
		b.setLayout(null);
    b.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
		new information();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    b.setToolTipText("Please Information Save");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	 
	 JLabel name12 = new JLabel("Front-end -- FAHAD ");
	name12.setBounds(550,535,300,40);
	name12.setFont(font6);
	name12.setForeground(Color.black);
	f.add(name12);
//img	
	/*ImageIcon background_img = new ImageIcon("b.jpg");
	Image image = background_img.getImage();
	Image temp_image = image.getScaledInstance(800,600,Image.SCALE_SMOOTH);
	background_img = new ImageIcon(temp_image);
	JLabel b1 = new JLabel("", background_img, JLabel.CENTER);
	b1.setBounds(0,0,800,600);*/
	
	ImageIcon backgroundIcon = new ImageIcon("H:\\Java Project\\Image\\i.png");
    Image img = backgroundIcon.getImage();
    Image temp_img = img.getScaledInstance(15,15,Image.SCALE_SMOOTH);
	backgroundIcon = new ImageIcon(temp_img);
	JLabel background = new JLabel("", backgroundIcon , JLabel.CENTER);
	background.setBounds(530,547,15,15);
	f.add(background);
	background.setLayout(null);
	
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
		new information();
		f.setVisible(false);
	}  
	public void mouseEntered(MouseEvent e) { 
    l3.setToolTipText("Back");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
	
//panel add
  f.add(heading);
   // f.add(login);

//add
	 Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Java Project\\Image\\travel.png");
		f.setIconImage(icon);
	 f.setSize(800,600);
	 f.setLayout(null); 
	 f.setVisible(true);   
	 f.setLocationRelativeTo(null);
	 f.setResizable(false);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	//actionlisiner
	Cursor cursor12 = new Cursor(Cursor.HAND_CURSOR);
		l1.setCursor(cursor12);
		l1.setLayout(null);
	l1.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
	 login1.setVisible(true);
	 login12.setVisible(false);
	 login123.setVisible(false);
	
	}  
	public void mouseEntered(MouseEvent e) { 
    l1.setToolTipText("Edit Your Personal Information");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  Cursor cursor1246 = new Cursor(Cursor.HAND_CURSOR);
		ll1.setCursor(cursor124);
		ll1.setLayout(null);
  ll1.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
	 login12.setVisible(true);
	 login1.setVisible(false);
	 login123.setVisible(false);
	
	}  
	public void mouseEntered(MouseEvent e) { 
    ll1.setToolTipText("Edit Your Contact Information");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
   Cursor cursor12460 = new Cursor(Cursor.HAND_CURSOR);
		ll12.setCursor(cursor124);
		ll12.setLayout(null);
  ll12.addMouseListener(new MouseListener(){
	public void mouseClicked(MouseEvent e) {
	 login123.setVisible(true);
	 login1.setVisible(false);
	 login12.setVisible(false);
	
	}  
	public void mouseEntered(MouseEvent e) { 
   ll12.setToolTipText("Edit Your Address");}  
	public void mouseExited(MouseEvent e) {}  
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
  });
  
  }
		
  public static void main(String [] args){
		
		new profileedit();
	
	
	}
}