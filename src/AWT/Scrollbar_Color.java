package AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

 class MyFrame7 extends Frame implements AdjustmentListener{
    Scrollbar red,green,blue;
    TextField tf;
    MyFrame7(){
        super("Color Scrollbar");
        red= new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        green= new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        blue= new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
        tf= new TextField(20);

        tf.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        blue.setBounds(50,200,300,30);
        green.setBounds(50,250,300,30);

        setLayout(null);
        add(tf);
        add(red);
        add(green);
        add(blue);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
        
        setSize(400,400);

    }
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
    }
    
}
public class Scrollbar_Color {
    public static void main(String[] args) {
        MyFrame7 mf7= new MyFrame7();
        mf7.setVisible(true);
    }
}
