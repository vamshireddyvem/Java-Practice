package AWT.Handling_Events;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame_As_EventListner extends Frame implements ActionListener{
    int count =0;
    Label l;
    Button b;
    TextField tf;
        Frame_As_EventListner(){
        super("Ways to handle events");
        setLayout(new FlowLayout());
        l=new Label("Name");
        b= new Button("OK");
        tf= new TextField("0",20);
        b.addActionListener(this);
        add(l);
        add(tf);
        add(b);
        setSize(500, 500);
        }

@Override
    public void actionPerformed(ActionEvent e) {
        count++;
        tf.setText(String.valueOf(count));
    }
        
    public static void main(String[] args) {
        Frame_As_EventListner f=new Frame_As_EventListner();
        f.setVisible(true);
    }
}


