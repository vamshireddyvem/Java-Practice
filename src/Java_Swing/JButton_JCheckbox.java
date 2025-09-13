package Java_Swing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


class Inner_JButton_JCheckbox extends JFrame implements ActionListener{
    JRadioButton r1,r2;
    JCheckBox c1,c2;
    JTextField tf;
    Inner_JButton_JCheckbox(){
        super("Checkbox & Radio");
        setLayout(new FlowLayout());
        tf= new JTextField("Demo Text", 20);

        c1= new JCheckBox("BOLD");
        c1.setMnemonic(KeyEvent.VK_B);
        c2= new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);

        r1= new JRadioButton("UPPER");
        r2= new JRadioButton("lower");
        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r1.setActionCommand("UPPER");
        r2.setActionCommand("lower");

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "UPPER": tf.setText(tf.getText().toUpperCase());
            break;
            case "lower":tf.setText(tf.getText().toLowerCase());
            break;
        }

        int b=0, i=0;
        if(c1.isSelected())b=Font.BOLD;
        if(c2.isSelected())i=Font.ITALIC;
        Font f= new Font("Times New Roman",b|i,15);
        tf.setFont(f);
    }


}
public class JButton_JCheckbox {
     public static void main(String[] args) {
        Inner_JButton_JCheckbox jbc= new Inner_JButton_JCheckbox();
        jbc.setVisible(true);
        jbc.setSize(500, 500);
        jbc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
