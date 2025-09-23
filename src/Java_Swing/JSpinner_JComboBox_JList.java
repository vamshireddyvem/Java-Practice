package Java_Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Inner_JSpinner_JComboBox_JList extends JFrame implements ActionListener,ChangeListener,ListSelectionListener{
    JComboBox c;
    JList l;
    JSpinner sp1,sp2;
    JTextField tf;

    Inner_JSpinner_JComboBox_JList(){
        String countries[]={"India","USA","Russia","China","Germany","Japan","Canada","Italy","Singapore"};
        String months[]={"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        c= new JComboBox(countries);
        l= new JList(months);
        l.setVisibleRowCount(4);

        sp1= new JSpinner(new SpinnerListModel(days));
        sp2= new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        tf= new JTextField(15);
        setLayout(new FlowLayout());
        add(c);
        add(sp1);
        add(sp2);
        add(new JScrollPane(l));
        add(tf);

        c.addActionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
        l.addListSelectionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText(c.getSelectedItem()+"");
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==sp1){
            tf.setText(sp1.getValue()+"");
        }
        else{
            tf.setText(sp2.getValue()+"");
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText(l.getSelectedValue()+"");
    }
}

public class JSpinner_JComboBox_JList {
    public static void main(String[] args) {
        Inner_JSpinner_JComboBox_JList scl= new Inner_JSpinner_JComboBox_JList();
        scl.setVisible(true);
        scl.setSize(500, 500);
        scl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
