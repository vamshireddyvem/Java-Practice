package AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class InnerAnimation extends Frame implements Runnable{
    int x,y,tx,ty;
    InnerAnimation(){
        super("Animation");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        x=100;
        y=100;
        tx=ty=1;
        Thread th=new Thread(this);
        th.start();

    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x, y, 50, 50);
    }
    @Override
    public void run() {
        while (true) {
            x=x+tx;
            y=y+ty;
            if (x<05||x>445) {
                tx=tx*-1;
            }
            if (y<30||y>445) {
                ty=ty*-1;
            }
            repaint();
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
   
}
public class Animation {
    public static void main(String[] args) {
        InnerAnimation ia= new InnerAnimation();
        ia.setSize(500, 500);
        ia.setVisible(true);
    }
}
