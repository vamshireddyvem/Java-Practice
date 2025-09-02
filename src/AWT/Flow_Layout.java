package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

class MyFrame8 extends Frame{
    
    Button b1,b2,b3,b4,b5,b6,b7;
    public MyFrame8(){
        super("Flow-Layout");
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setSize(300,300);
        b1= new Button("One");
        b2= new Button("Two");
        b3= new Button("Three");
        b4= new Button("Four");
        b5= new Button("Five");
        b6= new Button("Six");
        b7= new Button("Seven");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
    }
}
public class Flow_Layout {
    public static void main(String[] args) {
       MyFrame8 my8 = new MyFrame8();
        my8.setVisible(true);
    }
}
