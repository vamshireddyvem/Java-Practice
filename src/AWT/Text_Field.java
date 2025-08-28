package AWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame4 extends Frame implements ActionListener, TextListener{

    Label l1,l2;
    TextField tf;
    public MyFrame4(){
        super("Text Field Demo");
        setLayout(new FlowLayout());

        l1=new Label("Plese Enter your Text");
        l2=new Label("                     ");
    
        tf= new TextField(20);
        tf.setEchoChar('*');
        tf.addActionListener(this);
        tf.addTextListener(this);

        add(l1);
        
        add(tf);
        add(l2);

    }
    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       l2.setText(tf.getText());
    }
    
}
public class Text_Field {
    public static void main(String[] args) {
        MyFrame4 mf3= new MyFrame4();
        mf3.setSize(400,400);
        mf3.setVisible(true);
        
    }
}
