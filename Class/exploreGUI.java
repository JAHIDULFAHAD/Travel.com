import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exploreGUI implements ActionListener{
    JFrame frame=new JFrame();
    JButton buttons[] = new JButton[8];
    JButton bookButton=new JButton();
    JButton homeButton=new JButton();

    exploreGUI(){ 

        JLabel imgJLabel=new JLabel(new ImageIcon("H:\\Java Project\\Image\\exl.png"));
        imgJLabel.setSize(1280,850);
        imgJLabel.setOpaque(false);

        JPanel panel = new JPanel();
        panel.setBounds(5,200,1280,850);
        panel.setLayout(null);
        

        int l=0;
        for(int i=0;i<4;i++){
            buttons[i]=new JButton();
            buttons[i].setBounds(10+315*i,330,310,250);
            buttons[i].addActionListener(this);
            buttons[i].setBackground(new Color(0x292929));
            buttons[i].setOpaque(false);
            buttons[i].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
            buttons[i].setFocusable(false);
            panel.add(buttons[i]);
        }        
        for(int i=4;i<8;i++){
            buttons[i]=new JButton();
            buttons[i].setBounds(10+315*l,330+250,310,250);
            buttons[i].setFocusable(false); 
            buttons[i].addActionListener(this);
            buttons[i].setBackground(new Color(0x292929));
            buttons[i].setOpaque(false);
            buttons[i].setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
             panel.add(buttons[i]);
            l++;
        }
        
        // buttons[0].setText("Dhaka");
        buttons[0].setIcon(new ImageIcon("H:\\Java Project\\Image\\d.png"));
        buttons[1].setIcon(new ImageIcon("H:\\Java Project\\Image\\k.png"));
        buttons[2].setIcon(new ImageIcon("H:\\Java Project\\Image\\s.png"));
        buttons[3].setIcon(new ImageIcon("H:\\Java Project\\Image\\b.png"));
        buttons[4].setIcon(new ImageIcon("H:\\Java Project\\Image\\raj.png"));
        buttons[5].setIcon(new ImageIcon("H:\\Java Project\\Image\\ran.png"));
        buttons[6].setIcon(new ImageIcon("H:\\Java Project\\Image\\c.png"));
        buttons[7].setIcon(new ImageIcon("H:\\Java Project\\Image\\m.png"));

        bookButton.setBounds(1100-22,50,100+70,48);
        bookButton.setFocusable(false); 
        bookButton.addActionListener(this);
        bookButton.setForeground(new Color(0xFFFFFF));
        bookButton.setBackground(new Color(0x292929));
        bookButton.setOpaque(false);
        bookButton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));       
        panel.add(bookButton);
       
        
        homeButton.setBounds(26,60,120,50);
        homeButton.setFocusable(false); 
        homeButton.addActionListener(this);
        homeButton.setForeground(new Color(0xFFFFFF));
        homeButton.setBackground(new Color(29,29,29,10));
        homeButton.setOpaque(false);
        homeButton.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0));       
        panel.add(homeButton);

  
        panel.add(imgJLabel);
       
        frame=new JFrame();
        frame.setTitle("Explore");
		frame.setBounds(300, 100,1295,860);
        frame.add(panel);
        frame.setMinimumSize(new Dimension(1295,860));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("H:\\Java Project\\Image\\exIcon.png").getImage());
        frame.setResizable(false);
        frame.setVisible(true);
              
    }

    public static void main(String[] args) {
        new exploreGUI();

    }

   
    public void actionPerformed(ActionEvent e)  {
        if(e.getSource()==bookButton){
            frame.setVisible(false);
            new trainGUI();
           }
           
        if(e.getSource()==homeButton){
            frame.setVisible(false);
			new PostSignIn();
           }
        if(e.getSource()==buttons[0]){
            frame.setVisible(false);
            new expDhaka("H:\\Java Project\\Image\\d1.png","H:\\Java Project\\Image\\d2.png","H:\\Java Project\\Image\\d3.png","H:\\Java Project\\Image\\d4.png","Dhaka");
        }
        if(e.getSource()==buttons[1]){
            frame.setVisible(false);
            new expKhulna("H:\\Java Project\\Image\\k1.png", "H:\\Java Project\\Image\\k2.png", "H:\\Java Project\\Image\\k3.png", "H:\\Java Project\\Image\\k4.png", "Khulna");

           }
        if(e.getSource()==buttons[2]){
            frame.setVisible(false);
            new expSylhet("H:\\Java Project\\Image\\s1.png", "H:\\Java Project\\Image\\s2.png", "H:\\Java Project\\Image\\s3.png", "H:\\Java Project\\Image\\s4.png", "Sylhet");
           }
        if(e.getSource()==buttons[3]){
            frame.setVisible(false);
            new expBarisal("H:\\Java Project\\Image\\b1.png", "H:\\Java Project\\Image\\b2.png", "H:\\Java Project\\Image\\b3.png", "H:\\Java Project\\Image\\b4.png", "Barisal");
        }
        if(e.getSource()==buttons[4]){
            frame.setVisible(false);
            new expRajshahi("H:\\Java Project\\Image\\r1.png","H:\\Java Project\\Image\\r2.png","H:\\Java Project\\Image\\r3.png","H:\\Java Project\\Image\\r4.png","Rajshahi");
        }
        if(e.getSource()==buttons[5]){
            frame.setVisible(false);
            new expRangpur("H:\\Java Project\\Image\\rng1.png", "H:\\Java Project\\Image\\rng2.png", "H:\\Java Project\\Image\\rng3.png", "H:\\Java Project\\Image\\rng4.png", "Rangpur");
           }
        if(e.getSource()==buttons[6]){
            frame.setVisible(false);
            new expChittagong("H:\\Java Project\\Image\\c1.png","H:\\Java Project\\Image\\c2.png","H:\\Java Project\\Image\\c3.png","H:\\Java Project\\Image\\c4.png","Chittagong");
           }
        if(e.getSource()==buttons[7]){
            frame.setVisible(false);
            new expMymensingh("H:\\Java Project\\Image\\m1.png", "H:\\Java Project\\Image\\m2.png", "H:\\Java Project\\Image\\m3.png", "H:\\Java Project\\Image\\m4.png", "Mymensingh");
           } 
               
    }
}