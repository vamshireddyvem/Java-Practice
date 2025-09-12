package Java_Swing;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class InnerFirst_JavaSwing_App extends JFrame implements ActionListener{
    int count;
    JButton b;
    JLabel l;
    InnerFirst_JavaSwing_App(){
        super("First JavaSwing App");
        setLayout(new FlowLayout());
        ImageIcon i = new ImageIcon("E:/JAVA Course/src/Filesource/Icons/add.png");
        Image scaledImage = i.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);
        b= new JButton(resizedIcon);
        l= new JLabel(String.valueOf(count));
        add(l);
        add(b);
        b.addActionListener(this);
        l.setToolTipText("Counter");
        getRootPane().setDefaultButton(b);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText(String.valueOf(count));
    }
    
    
}
public class First_JavaSwing_App {
    public static void main(String[] args) {
        InnerFirst_JavaSwing_App ia= new InnerFirst_JavaSwing_App();
        ia.setSize(500, 500);
        ia.setVisible(true);
        ia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
