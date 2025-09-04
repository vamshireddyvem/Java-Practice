package AWT.Handling_Events;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Inner_Class extends Frame implements ActionListener{
    int count =0;
    Label l;
    Button b;
    TextField tf;
        public Inner_Class(){
        super("Ways to handle events");
        setLayout(new FlowLayout());
        l=new Label("Name");
        b= new Button("OK");
        tf= new TextField("0",20);
        b.addActionListener(this);
        add(l);
        add(tf);
        add(b);
        setSize(500, 500);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            count++;
            tf.setText(String.valueOf(count));
        }
    }
public class Inner_Class_Event {
        public static void main(String[] args) {
        Inner_Class i = new Inner_Class();
        i.setVisible(true);
    }
}



