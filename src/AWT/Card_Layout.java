package AWT;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;

class InnerCard_Layout extends Frame implements ItemListener{
Checkbox cb1,cb2;
Button b1,b2,b3;
TextField tf1,tf2,tf3;
Panel mainp,p1,p2,p3;
CardLayout cl;

    InnerCard_Layout(){
        super("Card layout Demo");
        setSize(500, 500);
        CheckboxGroup cbg= new CheckboxGroup();
        cb1= new Checkbox("Card 1",cbg, true);
        cb2= new Checkbox("Card 2", cbg, false);
        cb1.addItemListener(this);
        cb2.addItemListener(this);

        b1= new Button("One");
        b2=new Button("Two");
        b3= new Button("Three");
        tf1= new TextField(10);
        tf2= new TextField(10);
        tf3= new TextField(10);
        cl= new CardLayout();

        p1= new Panel();
        p1.add(cb1);
        p1.add(cb2);

        p2= new Panel();
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);

        p3= new Panel();
        p3.add(tf1);
        p3.add(tf2);
        p3.add(tf3);

        mainp=new Panel(cl);
        mainp.add("One",p2);
        mainp.add("Two",p3);

        add(p1,BorderLayout.NORTH);
        add(mainp,BorderLayout.CENTER);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (cb1.getState()) {
            cl.first(mainp);
        }
        else{
            cl.last(mainp);
        }
    }
}
public class Card_Layout {
    public static void main(String[] args) {
        InnerCard_Layout il= new InnerCard_Layout();
        il.setVisible(true);
    }
}
