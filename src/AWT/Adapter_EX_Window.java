package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class InnerAdapter_EX_Window extends Frame {
public InnerAdapter_EX_Window(){
        super("Window Adapter");
        setLayout(new FlowLayout());
        Label l=new Label("Name");
        Button b= new Button("OK");
        TextField tf= new TextField(20);
        setSize(500, 500);
        add(l);
        add(tf);
        add(b);
        addWindowListener(new WindowAdapter() {
        @Override                          // we can use Adapter class by Inner class and Outer class or on the go i,e anonymus Class like this here.
        public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);}
    });
    }
}
public class Adapter_EX_Window {
    public static void main(String[] args) {
        InnerAdapter_EX_Window i= new InnerAdapter_EX_Window();
        i.setVisible(true);
    }
}
