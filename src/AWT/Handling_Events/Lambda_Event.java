package AWT.Handling_Events;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;

class Lambda_InnerClass_Event  extends Frame {

    int count =0;
    Label l;
    Button b;
    TextField tf;
        public Lambda_InnerClass_Event(){
        super("Ways to handle events");
        setLayout(new FlowLayout());
        l=new Label("Name");
        b= new Button("OK");
        tf= new TextField("0",20);
        b.addActionListener((ActionEvent e)-> {
        count++;
        tf.setText(String.valueOf(count));
    }
);
        add(l);
        add(tf);
        add(b);
        setSize(500, 500);
    }
}
public class Lambda_Event {
    public static void main(String[] args) {
        Lambda_InnerClass_Event li= new Lambda_InnerClass_Event();
        li.setVisible(true);
    }
}
