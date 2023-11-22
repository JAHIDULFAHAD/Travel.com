import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class expDhaka implements ActionListener{
    JButton []buttons = new JButton[4];
    JFrame frame; 
    String a,b,c,d,e;
    JButton bookButton=new JButton();
    JButton prevButton=new JButton();

    public expDhaka(String a,String b,String c,String d,String e){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        
        JLabel imgJLabel=new JLabel(new ImageIcon("H:\\Java Project\\Image\\explr.png"));
        imgJLabel.setSize(1280,850);
        // imgJLabel.setOpaque(false);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,1280,850);
        panel.setLayout(null);


        int l=0;
        for(int i=0;i<2;i++){
            buttons[i]=new JButton();
            buttons[i].setBounds(12+630*i,175,625,320);
            buttons[i].setForeground(new Color(0xFFFFFF));
            buttons[i].setBackground(new Color(0x292929));
            buttons[i].setOpaque(false);
            buttons[i].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
            buttons[i].setFocusable(false);
            panel.add(buttons[i]);
        }        
        for(int i=2;i<4;i++){
            buttons[i]=new JButton();
            buttons[i].setBounds(12+630*l,320+175,625,320);
            buttons[i].setFocusable(false); 
            buttons[i].setForeground(new Color(0xFFFFFF));
            buttons[i].setBackground(new Color(0x292929));
            buttons[i].setOpaque(false);
            buttons[i].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
            
            panel.add(buttons[i]);
            l++;
        }
        
       
        buttons[0].setIcon(new ImageIcon(a));
        buttons[1].setIcon(new ImageIcon(b));
        buttons[2].setIcon(new ImageIcon(c));
        buttons[3].setIcon(new ImageIcon(d));
      
       
        JLabel nameOfDiv=new JLabel(e);
        nameOfDiv.setSize(100,150);
        nameOfDiv.setBounds(480,46,500,150);
        nameOfDiv.setFont(new Font("algerian", Font.BOLD, 70));
        //nameOfDiv.setFont(new Font("curlz mt", Font.BOLD, 70));
        //nameOfDiv.setFont(new Font("french script mt", Font.BOLD, 80));
        //nameOfDiv.setFont(new Font("JOKERMAN", Font.BOLD, 70));
        nameOfDiv.setOpaque(false);

        
        bookButton.setBounds(1100-6,43,170,47);
        bookButton.setFocusable(false); 
        bookButton.addActionListener(this);
        bookButton.setForeground(new Color(0xFFFFFF));
        bookButton.setBackground(new Color(0x292929));
        bookButton.setOpaque(false);
        bookButton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));  
        
        prevButton.setBounds(15,40,59,59);
        prevButton.setFocusable(false);
        prevButton.addActionListener(this);
        prevButton.setForeground(new Color(0xFFFFFF));
        prevButton.setBackground(new Color(0x291919));
        prevButton.setIcon(new ImageIcon("H:\\Java Project\\Image\\prev3.png")); 
        prevButton.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0 ));       
        prevButton.setOpaque(false);

        
        panel.add(bookButton);
        panel.add(prevButton);
        panel.add(nameOfDiv);
        panel.add(imgJLabel);
       
        frame=new JFrame();
        frame.setTitle("Explore");
		frame.setBounds(300, 100,1295,860);
        frame.add(panel);
        //frame.setMinimumSize(new Dimension(1295,860));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("H:\\Java Project\\Image\\exIcon.png").getImage());
        frame.setResizable(false);
        frame.setVisible(true);
            
    }

    public static void main(String[] args) {
        new expDhaka("H:\\Java Project\\Image\\d1.png","H:\\Java Project\\Image\\d2.png","H:\\Java Project\\Image\\d3.png","H:\\Java Project\\Image\\d4.png","Dhaka");

    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bookButton){
            
            frame.setVisible(false);
            new trainGUI();

        } 
        if(e.getSource()==prevButton){
            
            frame.setVisible(false);
            new exploreGUI();

        }
        
    }
}
