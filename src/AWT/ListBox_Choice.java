package AWT;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame6 extends Frame implements ActionListener, ItemListener {

    Choice c;
    List l;
    TextArea ta;

    public MyFrame6(){
        super("List & Choice");
        setLayout(new FlowLayout());
        ta=new TextArea(10,20);
        l=new List(4, true);
        c= new Choice();
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("JAN");
        c.add("FEB");
        c.add("MAR");
        c.add("APR");
        c.add("MAY");
        c.add("JUN");
        c.add("JUL");
        c.add("AUG");
        c.add("SEP");
        c.add("OCT");
        c.add("NOV");
        c.add("DEC");
    
        add(l);
        add(c);
        add(ta);
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
        setSize(300, 400);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==l) {
            ta.setText(l.getSelectedItem());
        }
        else{
            ta.setText(c.getSelectedItem());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String list[]=l.getSelectedItems();
       String txt="";
       for (String x : list) {
        txt=txt+x+"\n";
        ta.setText(txt);
       }
    }
}
public class ListBox_Choice {
    public static void main(String[] args) {
        MyFrame6 mf6= new MyFrame6();
        mf6.setVisible(true);
    }
}
