package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

class MyFrame10 extends Frame{
    
    Button b1,b2,b3,b4,b5,b6,b7;
    public MyFrame10(){
        super("Grid_Layout");
        setLayout(new GridLayout(3,3));
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
public class Grid_Layout {
    public static void main(String[] args) {
        MyFrame10 my10= new MyFrame10();
        my10.setVisible(true);

    }
}
