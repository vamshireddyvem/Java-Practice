package AWT;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;

class MyFrame3 extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;

    MyFrame3(){
        
        super("My Checkbox App");
        l=new Label("Nothing is Selected");
        cbg= new CheckboxGroup();
        c1= new Checkbox("Java",false,cbg);
        c2= new Checkbox("Phyton",false,cbg);
        c3= new Checkbox("C#",false,cbg);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());
        setSize(400, 400);
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str="";
        if (c1.getState()) {
            str=str+" "+c1.getLabel();
        }
        if (c2.getState()) {
            str=str+" "+c2.getLabel();
        }
        if (c3.getState()) {
            str=str+" "+c3.getLabel();
        }
        if (str.isEmpty()) {
            str="Nothing is Selected";
        }
        l.setText(str);
    }
}
public class CheckboxRadio {
    public static void main(String[] args) {
        MyFrame3 mf3 = new MyFrame3();
        mf3.setVisible(true);
    }
}
