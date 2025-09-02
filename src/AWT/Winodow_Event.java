package AWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyFrame14 extends Frame implements WindowListener{
Label l;
    MyFrame14(){
        super("Window Event");
        l= new Label();
        setLayout(new FlowLayout());
        setSize(500,500);
        add(l);
        addWindowListener(this);
    }
    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }
    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }   
    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }
    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window DeIconified");
    }
    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
    
}

public class Winodow_Event {
    public static void main(String[] args) {
        MyFrame14 myf=new MyFrame14();
        myf.setVisible(true);
    }
}
