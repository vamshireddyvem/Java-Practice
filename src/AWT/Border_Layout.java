package AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

class MyFrame9 extends Frame{
    Panel p;
    Button b1,b2,b3,b4,b5,b6,b7;
    public MyFrame9(){
        super("Boarder-Layout");
        setLayout(new BorderLayout());
        setSize(300,300);
        p=new Panel();
        p.add(b1=new Button("One"));
        p.add(b2= new Button("Two"));
        p.add(b3= new Button("Three"));
        b4= new Button("Four");
        b5= new Button("Five");
        b6= new Button("Six");
        b7= new Button("Seven");
        add(p,BorderLayout.WEST);
        add(b3,BorderLayout.CENTER);
        add(b4,BorderLayout.EAST);
        add(b5,BorderLayout.SOUTH);
        add(b6,BorderLayout.NORTH);
        add(b7);
        
    }
}
public class Border_Layout {
    public static void main(String[] args) {
        MyFrame9 my9 = new MyFrame9();
        my9.setVisible(true);
    }
}
