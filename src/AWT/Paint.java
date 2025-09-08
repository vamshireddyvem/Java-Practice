package AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class InnerPaint extends Frame{
    int x=0;int y=0;
    InnerPaint (){
        super("Paint");
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                repaint();
            }
       
        });
    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 50, 50);
    }
}
public class Paint {
    public static void main(String[] args) {
        InnerPaint ip= new InnerPaint();
        ip.setSize(500,500);
        ip.setVisible(true);
    }
}
