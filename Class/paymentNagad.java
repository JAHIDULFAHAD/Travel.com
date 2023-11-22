import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class paymentNagad implements ActionListener{

    
    JPanel panel;
    JFrame frame;
    JButton confirmButtton,backButton;
    Font font=new Font("Avenir Next LT Pro", Font.BOLD, 20);
    String fr,t,tp,dd;
    JTextField numField = new JTextField();
    JPasswordField passField = new JPasswordField();

    public paymentNagad(String fr, String t, String tp, String dd){
        this.fr=fr;
        this.t=t;
        this.tp=tp;
        this.dd=dd;

        JLabel imgJLabel=new JLabel(new ImageIcon("H:\\Java Project\\Image\\paynagad.png"));
        imgJLabel.setSize(400,490);

        
    JLabel numberLabel =new JLabel();
    numberLabel.setText("Phone No:");
    numberLabel.setBounds(5,100+20,100,30);
    numberLabel.setFont(font);
    numberLabel.setForeground(Color.black);
 
 
     numField.setLayout(null);
     numField.setBounds(110,100+20, 270, 30);
     numField.setFont(font);
     numField.setForeground(new Color(0x292929));
     numField.setOpaque(false);
     numField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
  
  
    JLabel passLabel =new JLabel();
    passLabel.setText("Password:");
    passLabel.setBounds(5,100+60+20,100,30);
    passLabel.setFont(font);
    passLabel.setForeground(Color.black);
 
 
     passField.setLayout(null);
     passField.setBounds(110,100+20+60, 270, 30);
     passField.setFont(font);
     passField.setForeground(new Color(0x292929));
     passField.setOpaque(false);
     passField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
  

        backButton=new JButton();
        backButton.setBounds(5,5,100 ,40);
        backButton.setFont(font);
        backButton.setFocusable(false);
        backButton.setText("Confirm");
        backButton.setBackground(new Color(0x292929));
        backButton.setForeground(new Color(0xFFFFFF));
        backButton.addActionListener(this);
        
        confirmButtton=new JButton();
        confirmButtton.setBounds(140,250,130,40);
        confirmButtton.setFont(font);
        confirmButtton.setFocusable(false);
        confirmButtton.setText("Confirm");
        confirmButtton.setBackground(new Color(0x292929));
        confirmButtton.setForeground(new Color(0xFFFFFF));
        confirmButtton.addActionListener(this);
        
        
        panel=new JPanel();
        panel.setBounds(0,0,400,488-50);
        panel.setLayout(null);
        panel.setBackground(new Color(29,29,29,250));
        panel.add(confirmButtton);
        panel.add(passField);
        panel.add(passLabel);
        panel.add(numField);
        panel.add(numberLabel);
        panel.add(imgJLabel);
                                                                                          

        frame=new JFrame();
        frame.setTitle("Pay");
        frame.setIconImage(new ImageIcon("H:\\Java Project\\Image\\exIcon.png").getImage());
		frame.setBounds(1920/2-400/2, 1080/2-500/2,400,525);
        frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);     
                
             
    }
    public static void main(String[] args) {
        new paymentNagad(null, null, null, null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==confirmButtton){
            if(numField.getText().length()!=11||passField.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null, "Invalid password or phone number");
            }
            else
            {
               frame.setVisible(false);
               new generateTicket(fr,t,tp,dd);
            }
        } 
}
}