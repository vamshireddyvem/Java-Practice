package AWT;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class MyFrame12 extends Frame implements KeyListener{
    Label l1,l2,l3,l4;
    public MyFrame12(){
        super("Key-Event");
        l1= new Label();
        l2= new Label();
        l3= new Label();
        l4= new Label();
        setLayout(null);
        l1.setBounds(10, 20, 100, 50);
        l2.setBounds(10, 50, 100, 50);
        l3.setBounds(10, 80, 100, 50);
        l4.setBounds(10, 110, 200, 50);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        setSize(400, 400);
        addKeyListener(this);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        l1.setText("Key Typed");
        l4.setText(new Date(e.getWhen())+"");
        l3.setText("");
    }
    @Override
    public void keyPressed(KeyEvent e) {
        l2.setText("Key Pressed");
        l4.setText(new Date(e.getWhen())+"");
        l3.setText("");
        l1.setText("");
    }
    @Override
    public void keyReleased(KeyEvent e) {
        l3.setText("Key Released");
        l4.setText(new Date(e.getWhen())+"");
        l2.setText("");
        l1.setText("");
    }
}

public class KEY_EVENT {
    public static void main(String[] args) {
        MyFrame12 myf= new MyFrame12();
        myf.setVisible(true);
    }
    
}
