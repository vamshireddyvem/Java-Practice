package Java_Swing;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import javax.swing.JTabbedPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Inner_TabbedPane extends JFrame implements ListSelectionListener{
    JTabbedPane tp;
    JLabel lb;
    JList list;
    Inner_TabbedPane(){
        super("Tabbed Pane Demo");
        String cols[]= {"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};
        list= new JList(cols);
        list.setSelectedIndex(0);
        JScrollPane sp1 = new JScrollPane(list);
        
        lb= new JLabel(" ");
        lb.setBackground(Color.RED);
        lb.setOpaque(true);
        JScrollPane sp2= new JScrollPane(lb);

        tp= new JTabbedPane();
        tp.add("Colors",sp1);
        tp.add("Label", sp2);
        add(tp);
        list.addListSelectionListener(this);
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
       String str=(String) list.getSelectedValue();
       switch (str) {
        case "RED":lb.setBackground(Color.red);
            break;
        case "GREEN":lb.setBackground(Color.GREEN);
            break;
        case "BLUE":lb.setBackground(Color.BLUE);
            break;
        case "YELLOW":lb.setBackground(Color.YELLOW);
            break;
        case "MAGENTA":lb.setBackground(Color.MAGENTA);
            break;
        case "ORANGE":lb.setBackground(Color.ORANGE);
            break;
        case "BLACK":lb.setBackground(Color.BLACK);
            break;
       }
    }
}
public class TabbedPane {
    public static void main(String[] args) {
        Inner_TabbedPane itp= new Inner_TabbedPane();
        itp.setVisible(true);
        itp.setSize(500, 500);
        itp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

