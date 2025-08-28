package AWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.*;

class MyFrame extends Frame {

    Label l;
    Button b;
    TextField tf;
    public MyFrame(){
        super("MY-2-APP");
        setLayout(new FlowLayout());

        l=new Label("Name");
        b= new Button("OK");
        tf= new TextField(20);

        add(l);
        add(tf);
        add(b);

    }
    
}

public class App2 {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
