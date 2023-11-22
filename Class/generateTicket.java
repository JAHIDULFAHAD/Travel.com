import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.AWTException;
import javax.imageio.ImageIO;



public class generateTicket implements ActionListener {
    static int i=1;
    JFrame frame;
    JPanel panel=new JPanel();
    JLabel fromLabel,toLabel,dateLabel,classLabel,saveLabel;

    JButton homeButton=new JButton();
    JButton saveButton =new JButton();
    String fr,t,tp,dd;

    Font font=new Font("Bell MT", Font.PLAIN, 28);
    Font font2=new Font("Bell MT", Font.PLAIN, 30);
    Font fontx=new Font("Bell MT", Font.PLAIN, 18);


    public generateTicket(String fr, String t, String tp, String dd){
      this.fr=fr;
      this.t=t;
      this.tp=tp;
      this.dd=dd;
       
        panel.setBounds(0,0,800,600);
        panel.setLayout(null);
        
        JLabel imgJLabel=new JLabel(new ImageIcon("H:\\Java Project\\Image\\lastbg.png"));
        imgJLabel.setSize(800,600);

        fromLabel=new JLabel(fr);
        fromLabel.setBounds(330,233,400,50);
        fromLabel.setFont(font2);
        fromLabel.setHorizontalAlignment(JLabel.LEFT);
        fromLabel.setForeground(Color.BLACK);
        panel.add(fromLabel);

        toLabel=new JLabel(t);
        toLabel.setBounds(330,233+65,400,50);
        toLabel.setFont(font2);
        toLabel.setHorizontalAlignment(JLabel.LEFT);
        toLabel.setForeground(Color.WHITE);
        panel.add(toLabel);
        
        classLabel=new JLabel(tp);
        classLabel.setBounds(330,233+65+65,400,50);
        classLabel.setFont(font2);
        classLabel.setHorizontalAlignment(JLabel.LEFT);
        classLabel.setForeground(Color.BLACK);
        panel.add(classLabel);

        dateLabel=new JLabel(dd);
        dateLabel.setBounds(330,233+65+65+65,400,50);
        dateLabel.setFont(fontx);
        dateLabel.setHorizontalAlignment(JLabel.LEFT);
        dateLabel.setForeground(Color.WHITE);
        panel.add(dateLabel);

        homeButton.setBounds(26,41,90,40);
        homeButton.setFocusable(false); 
        homeButton.addActionListener(this);
        homeButton.setForeground(new Color(0xFFFFFF));
        homeButton.setBackground(new Color(29,29,29,10));
        homeButton.setOpaque(false);
        homeButton.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0));       
        panel.add(homeButton);

        saveLabel=new JLabel();
        saveLabel.setBounds(705,40+70,48,20);
        saveLabel.setHorizontalAlignment(JLabel.CENTER);
        saveLabel.setForeground(Color.WHITE);
        saveLabel.setBackground(new Color(0x292929));
        panel.add(saveLabel);

        saveButton.setBounds(705,40,48,40+8);
        saveButton.setFocusable(false); 
        saveButton.addActionListener(this);
        saveButton.setForeground(new Color(0xFFFFFF));
        saveButton.setBackground(new Color(29,29,29,100));
        saveButton.setOpaque(false);
        saveButton.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0));       
        panel.add(saveButton);   
        panel.add(imgJLabel);
      

        frame=new JFrame();
        frame.setTitle("Collect Ticket");
        frame.setIconImage(new ImageIcon("H:\\Java Project\\Image\\exIcon.png").getImage());
		    frame.setBounds(1920/2-816/2, 1080/2-643/2,800,600);
        frame.add(panel);
        frame.setMinimumSize(new Dimension(816,639));
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true); 

      
    }
public static void main(String[] args) {
    new generateTicket(null, null, "bb","29-December-2022(12:30am)");
}


public void actionPerformed(ActionEvent e) {
      if(e.getSource()==saveButton)  
      {
             
        try {
            Thread.sleep(1);
      
            int width = frame.getWidth()-460;
            int height = frame.getHeight()-310;
      
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
      
            Robot robot = new Robot();
      
            robot.createScreenCapture(new Rectangle(frame.getLocationOnScreen().x+218, frame.getLocationOnScreen().y+200, width, height)).copyData(image.getRaster());
            String workingDir = System.getProperty("user.dir");
            File folder = new File(workingDir+"\\saved");
      
            ImageIO.write(image, "png", new File(folder, "ss"+i +".png"));
            i++;
            
          } catch (IOException ae) {
            ae.printStackTrace();
          } catch (AWTException ae) {
            ae.printStackTrace();
          } catch (InterruptedException ae) {
            ae.printStackTrace();
          }
        saveButton.setEnabled(false);
        saveLabel.setOpaque(true);
        saveLabel.setText("saved");
        
      }

      if(e.getSource()==homeButton)
      {
        frame.setVisible(false);
        new exploreGUI();
      }
        
       
 
   
}
    
}
    
    

