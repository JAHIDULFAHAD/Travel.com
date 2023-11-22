import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class paymentMethod implements ActionListener{

    JPanel panel;
    JFrame frame;
    JButton bkashButton,nagadButton;
    Font font=new Font("Avenir Next LT Pro", Font.PLAIN, 15);
    String fr,t,dd,tp;
    public paymentMethod(String fr, String t, String tp, String dd){
           this.fr=fr;
           this.t=t;
           this.tp=tp;
           this.dd=dd;
        JLabel imgJLabel=new JLabel(new ImageIcon("H:\\Java Project\\Image\\pay.png"));
        imgJLabel.setSize(400,490);

        bkashButton=new JButton();
        bkashButton.setBounds(-1,100,390,150);
        bkashButton.setFont(font);
        bkashButton.setFocusable(false);
        bkashButton.setIcon(new ImageIcon("H:\\Java Project\\Image\\bkash.png"));
        bkashButton.setBackground(new Color(0xffffff));
        bkashButton.setForeground(new Color(0xFFFFFF));
        bkashButton.addActionListener(this);
        
        nagadButton=new JButton();
        nagadButton.setBounds(-1,250,390,150);
        nagadButton.setFont(font);
        nagadButton.setIcon(new ImageIcon("H:\\Java Project\\Image\\nagad.png"));
        nagadButton.setFocusable(false);
        nagadButton.setBackground(new Color(0x292929));
        nagadButton.setForeground(new Color(0xFFFFFF));
        nagadButton.addActionListener(this);
        
        panel=new JPanel();
        panel.setBounds(0,0,400,488-50);
        panel.setLayout(null);
        panel.setBackground(new Color(29,29,29,250));
        panel.add(bkashButton);
        panel.add(nagadButton);
        panel.add(imgJLabel);
                                                                                          

        frame=new JFrame();
        frame.setTitle("Payment System");
        frame.setIconImage(new ImageIcon("H:\\Java Project\\Image\\exIcon.png").getImage());
		frame.setBounds(1920/2-400/2, 1080/2-500/2,400,488-50);
        frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);     

    }
    public static void main(String[] args) {
        new paymentMethod("rfa", "gtthg", null, null);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bkashButton){
            frame.setVisible(false);
            new paymentBkash(fr,t,tp,dd);
        }
        if(e.getSource()==nagadButton){
            frame.setVisible(false);
            new paymentNagad(fr,t,tp,dd);

        }
        
    }    
}
