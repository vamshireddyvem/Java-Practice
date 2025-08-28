package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2 extends Frame implements ActionListener{
    int count=0;
    Label l;
    Button b;

    MyFrame2(){
        super("Label+Button EDM");
        l=new Label("    "+count);
        b=new Button("Click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(b);
        add(l);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("    "+count);
    }
}
public class Event_Delegation_Model {
    public static void main(String[] args) {
        MyFrame2 myf= new MyFrame2();
        myf.setSize(400, 400);
        myf.setVisible(true);
    }
}
