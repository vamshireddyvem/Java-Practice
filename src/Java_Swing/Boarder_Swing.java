package Java_Swing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

class Inner_Boarder_Swing extends JFrame{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;
        Inner_Boarder_Swing(){
            setLayout(new FlowLayout());
            l= new JLabel("Name");
            tf= new JTextField(15);
            b = new JButton("Login");
            p = new JPanel();
            Border bd= BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Login", TitledBorder.CENTER, TitledBorder.BELOW_TOP);
            p.setBorder(bd);
            p.add(l);
            p.add(tf);
            p.add(b);
            add(p);

        }
}

public class Boarder_Swing {
    public static void main(String[] args) {
        Inner_Boarder_Swing ib= new Inner_Boarder_Swing();
        ib.setSize(500, 500);
        ib.setVisible(true);
        ib.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
