package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame5 extends Frame implements ActionListener{

    Label l;
    TextField tf;
    TextArea ta;
    Button b;
    public MyFrame5(){
        super("Text Field Demo");
        setLayout(new FlowLayout());
        ta=new TextArea(10,20);
        l=new Label("Plese Enter your Text");
           
        tf= new TextField(20);

        // tf.setEchoChar('*');
       
        b= new Button("Click");
        b.addActionListener(this);

        add(l);
        add(ta);
        add(tf);
        add(b);
        
        setSize(400, 400);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ta.append(tf.getText());
        l.setText(tf.getSelectedText());
        ta.insert(tf.getText(), tf.getCaretPosition());
    }
    
}

public class Text_Area {
    public static void main(String[] args) {
        MyFrame5 mf5= new MyFrame5();
        mf5.setVisible(true);
    }
}
