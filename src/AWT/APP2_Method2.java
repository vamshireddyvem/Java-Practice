package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class APP2_Method2 extends Frame{
    Label l;
    Button b;
    TextField tf;
    public APP2_Method2(){
        super("MY-2-APP");
        setLayout(new FlowLayout());

        l=new Label("Name");
        b= new Button("OK");
        tf= new TextField(20);

        add(l);
        add(tf);
        add(b);
    }
    public static void main(String[] args) {
        APP2_Method2 ap2= new APP2_Method2();
        ap2.setSize(400,400);
        ap2.setVisible(true);
    }
}

