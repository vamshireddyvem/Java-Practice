package Java_Swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Inner_SplitPane extends JFrame implements ListSelectionListener{
    JSplitPane jp;
    JLabel lb;
    JList list;
    Inner_SplitPane(){
        super("Split Pane Demo");
        String cols[]= {"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};
        list= new JList(cols);
        list.setSelectedIndex(0);
        JScrollPane sp1 = new JScrollPane(list);
        
        lb= new JLabel(" ");
        lb.setBackground(Color.RED);
        lb.setOpaque(true);
        JScrollPane sp2= new JScrollPane(lb);

        jp= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,sp1,sp2);
        jp.setDividerLocation(100);
        add(jp);
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
public class SplitPane {
    public static void main(String[] args) {
        Inner_SplitPane isp= new Inner_SplitPane();
        isp.setVisible(true);
        isp.setSize(500, 500);
        isp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
