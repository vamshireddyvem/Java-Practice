package Java_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class Inner_LayeredPane extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4;
    JRadioButton r1,r2,r3;
    JLayeredPane lp2;
    JPanel p;

    Inner_LayeredPane(){
        super("Layered Pane");
        r1= new JRadioButton("Red");
        r2= new JRadioButton("Green");
        r3= new JRadioButton("Blue",true);
        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        p= new JPanel();
        p.add(r1);
        p.add(r2);
        p.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        

        l1= new JLabel("Red");
        l1.setBounds(50, 50, 200, 200);
        l1.setBackground(Color.RED);
        l1.setOpaque(true);

        l2= new JLabel("Green");
        l2.setBounds(100, 100, 200, 200);
        l2.setBackground(Color.GREEN);
        l2.setOpaque(true);

        l3= new JLabel("Blue");
        l3.setBounds(150, 150, 200, 200);
        l3.setBackground(Color.BLUE);
        l3.setOpaque(true);

        l4= new JLabel("Black");
        l4.setBounds(300, 300, 100, 100);
        l4.setBackground(Color.BLACK);
        l4.setOpaque(true);
        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent me){
                l4.setLocation(me.getX(), me.getY());
            }
        });

        lp2= new JLayeredPane();
        lp2.add(l1,new Integer(0));
        lp2.add(l2, new Integer(1));
        lp2.add(l3,new Integer(2));
        lp2.add(l4,new Integer(3));
        add(p,BorderLayout.NORTH);
        add(lp2,BorderLayout.CENTER);

        


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(r1.isSelected())
        lp2.setLayer(l4, 1);
        if(r2.isSelected())
        lp2.setLayer(l4, 2);
        if(r3.isSelected())
        lp2.setLayer(l4, 3);
    }

}

public class LayeredPane {
    public static void main(String[] args) {
        Inner_LayeredPane il= new Inner_LayeredPane();
        il.setVisible(true);
        il.setSize(500, 500);
        il.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
