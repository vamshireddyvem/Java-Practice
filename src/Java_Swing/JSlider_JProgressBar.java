package Java_Swing;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Inner_JSlider_JProgressBar extends JFrame implements ChangeListener{
    JSlider s;
    JProgressBar pb;
    JPanel p1,p2;
    int w=50;

    public Inner_JSlider_JProgressBar(){
        s= new JSlider(0, 100, 0);
        s.setMinorTickSpacing(1);
        s.setMajorTickSpacing(10);
        // s.setBackground(Color.GREEN);
        s.setPaintLabels(true);
        s.setPaintTicks(true);


        pb= new JProgressBar(0, 100);
        pb.setString("0%");
        pb.setStringPainted(true);


        p1= new JPanel(){
            public void paintComponent(Graphics g){
                g.drawOval(200 , 200, w, w);
            }
        };
        p2= new JPanel();
        p2.add(pb);
        add(s,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        s.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        w=s.getValue();
        p1.repaint();
        pb.setString(w+"%");
        pb.setStringPainted(true);
        pb.setValue(w);
    }

}

public class JSlider_JProgressBar {
    public static void main(String[] args) {
        Inner_JSlider_JProgressBar isp= new Inner_JSlider_JProgressBar();
        isp.setVisible(true);
        isp.setSize(500, 500);
        isp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
