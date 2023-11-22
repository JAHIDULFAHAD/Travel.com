import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class trainGUI implements ActionListener{
    JFrame frame;
    JPanel panel=new JPanel();

    String stations[]={"Stations","Barisal", "Chittagong", "Dhaka", "Khulna", "Mymensingh", "Rangpur", "Rajshahi", "Sylhet"};
    String types[]={"Class","Shulov", "Shovan","Snigdha","AC_Birth"};
    String days[]={"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String months[]={"Month","January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December"};
    String years[]={"Year","2022", "2023", "2024"};
    String timeStrings[]={"Time","6:30am","12:30pm", "6:30pm", "12:30am"};

    Font font=new Font("Avenir Next LT Pro", Font.PLAIN, 15);
    Font font1=new Font("Avenir Next LT Pro", Font.PLAIN, 14);
    Font font2=new Font("Avenir Next LT Pro", Font.PLAIN, 35);

    JComboBox from,to,day,month,year,time,type;
    
    JButton payButton=new JButton();
    JButton prevButton=new JButton();

    JLabel fromLabel,toLabel,dateLabel,classLabel;
    
    
    public trainGUI(){
        panel.setBounds(0,0,800,600);
        panel.setLayout(null);
        
        JLabel imgJLabel=new JLabel(new ImageIcon("H:\\Java Project\\Image\\trainbg.png"));
        imgJLabel.setSize(800,600);

        fromLabel=new JLabel();
        fromLabel.setBounds(370,240,400,50);
        fromLabel.setFont(font2);
        fromLabel.setHorizontalAlignment(JLabel.CENTER);
        fromLabel.setForeground(Color.WHITE);

        toLabel=new JLabel();
        toLabel.setBounds(370,378,400,50);
        toLabel.setFont(font2);
        toLabel.setHorizontalAlignment(JLabel.CENTER);
        toLabel.setForeground(Color.black);

        dateLabel=new JLabel();
        dateLabel.setBounds(360,450,200,37);
        dateLabel.setFont(font1);
        dateLabel.setHorizontalAlignment(JLabel.CENTER);
        dateLabel.setForeground(Color.WHITE);

        classLabel=new JLabel();
        classLabel.setBounds(580,450,190,37);
        classLabel.setFont(font1);
        classLabel.setHorizontalAlignment(JLabel.CENTER);
        classLabel.setForeground(Color.white);

       from = new JComboBox(stations);
       from.setLayout(null);
       from.setFont(font);
       from.setBounds(30,130, 135, 40);
       from.setSelectedIndex(0);
       from.setBackground(new Color(0x678983));
       from.setForeground(new Color(0x292929));
       from.setOpaque(false); 
       from.addActionListener(this);     

       to = new JComboBox(stations);
       to.setLayout(null);
       to.setFont(font);
       to.setBounds(195,130, 135, 40);
       to.setSelectedIndex(0);
       to.setBackground(new Color(0x678983));
       to.setForeground(new Color(0x292929));
       to.addActionListener(this);   


       day = new JComboBox<>(days);
       day.setLayout(null);
       day.setFont(font);
       day.setBounds(358,130, 40, 40);
       day.setSelectedIndex(0);
       day.setBackground(new Color(0x678983));
       day.setForeground(new Color(0x292929));
       day.addActionListener(this);   

       month = new JComboBox<>(months);
       month.setLayout(null);
       month.setFont(font);
       month.setBounds(403,130, 82, 40);
       month.setSelectedIndex(0);
       month.setBackground(new Color(0x678983));
       month.setForeground(new Color(0x292929));
       month.addActionListener(this);   

       year = new JComboBox<>(years);
       year.setLayout(null);
       year.setFont(font);
       year.setBounds(490,130, 40, 40);
       year.setSelectedIndex(0);
       year.setBackground(new Color(0x678983));
       year.setForeground(new Color(0x292929));
       year.addActionListener(this);
       
       
       time = new JComboBox<>(timeStrings);
       time.setLayout(null);
       time.setFont(font);
       time.setBounds(535,130, 70, 40);
       time.setSelectedIndex(0);
       time.setBackground(new Color(0x678983));
       time.setForeground(new Color(0x292929));
       time.addActionListener(this);

       type = new JComboBox<>(types);
       type.setLayout(null);
       type.setBounds(640,130, 125, 40);
       type.setSelectedIndex(0);
       type.setBackground(new Color(0x678983));
       type.setForeground(new Color(0x292929));
       type.setFont(font);
       type.addActionListener(this);
 
        payButton.setText("Pay");
        payButton.setBounds(15,520,772,50);
        payButton.setBackground(new Color(0x292929));
        payButton.setFocusable(false);
        payButton.addActionListener(this);
        payButton.setForeground(new Color(0xFFFFFF));
        payButton.setEnabled(false);
        payButton.setBackground(new Color(29,29,29));
        
        prevButton.setBounds(15,3,40,30);
        prevButton.setFocusable(false);
        prevButton.addActionListener(this);
        prevButton.setForeground(new Color(0xFFFFFF));
        prevButton.setBackground(new Color(0x291919));
        prevButton.setIcon(new ImageIcon("H:\\Java Project\\Image\\prev2.png")); 
        prevButton.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0));       
        prevButton.setOpaque(false);


        panel.add(from);
        panel.add(to);
        panel.add(day);
        panel.add(month);
        panel.add(year);
        panel.add(time);
        panel.add(type);
        panel.add(fromLabel);
        panel.add(toLabel);
        panel.add(dateLabel);
        panel.add(classLabel);
        panel.add(prevButton);
        panel.add(payButton);
        panel.add(imgJLabel);
      
        frame=new JFrame();
        frame.setTitle("Book Train Ticket");
        frame.setIconImage(new ImageIcon("H:\\Java Project\\Image\\exIcon.png").getImage());
		frame.setBounds(1920/2-816/2, 1080/2-643/2,800,600);
        frame.add(panel);
        frame.setMinimumSize(new Dimension(816,639));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);     

}
public static void main(String[] args) {
    new trainGUI();
}
public void actionPerformed(ActionEvent e) {
    String fr=(String) from.getSelectedItem();
    String t=(String) to.getSelectedItem();
    String d=(String) day.getSelectedItem();
    String m=(String) month.getSelectedItem();
    String yr=(String) year.getSelectedItem();
    String tm=(String) time.getSelectedItem();
    String tp=(String) type.getSelectedItem();
    String dd=d+"-"+m+"-"+yr+"\n("+tm+")";

    int path1=from.getSelectedIndex();
    int path2=to.getSelectedIndex();
    int diff=Math.abs(path1-path2);
    
    int price=diff*102;
    
    if(e.getSource()==from){
        if(path1==0)
        {
            JOptionPane.showMessageDialog(null, "Please,Select Proper Station");
            from.setSelectedIndex(0);
        }
        else
        fromLabel.setText(fr);      
    }
    if(e.getSource()==to){
        if(diff==0||path1==0||path2==0)
        {
            JOptionPane.showMessageDialog(null, "Please,Select Proper Destination");
            to.setSelectedIndex(0);
        }
        else
        toLabel.setText(t);
    }
   
   
    if(e.getSource()==time){
        dateLabel.setText(dd);
    }
   
    if(e.getSource()==type){
        if(diff==0||path1==0||path2==0||day.getSelectedIndex()==0||month.getSelectedIndex()==0||year.getSelectedIndex()==0||time.getSelectedIndex()==0||type.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "Please,Fill all the details");
            type.setSelectedIndex(0);
        }
        
        else
        {
        price=price+13*type.getSelectedIndex();
        classLabel.setText(tp);
        payButton.setEnabled(true);
        payButton.setText("Pay-"+price+"৳");
        payButton.setFont(new Font("Avenir Next LT Pro", Font.PLAIN, 20));
        }  
        
    }
    if(e.getSource()==payButton){
      
        frame.setVisible(false);
        new paymentMethod(fr,t,tp,dd);
    }
   
    
}
}
