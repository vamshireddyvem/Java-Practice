package AWT;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class MyFrame13 extends Frame implements MouseListener, MouseMotionListener{
    Label l1,l2;
    MyFrame13(){
        super("Mouse Event");
        l1= new Label();
        l2= new Label();
        setLayout(null);
        l1.setBounds(10, 20, 100, 50);
        l2.setBounds(10, 50, 100, 50);  
        setSize(500, 500);
        add(l1);
        add(l2);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        l1.setText("Mouse Dragged");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
       l1.setText("Mouse Moved");
       l2.setText("("+e.getX()+","+e.getY()+")");
    }
    @Override
    public void mouseClicked(MouseEvent e) {
       l1.setText("Mouse Clicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited");
    }
}

public class MOUSE_EVENT {
    public static void main(String[] args) {
        MyFrame13 myf= new MyFrame13();
        myf.setVisible(true);
    }
}
