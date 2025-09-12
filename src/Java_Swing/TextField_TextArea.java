package Java_Swing;

import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

class InnerTextField_TextArea extends JFrame{
    JTextField tf1;
    JTextArea ta;
    InnerTextField_TextArea(){
        super("TextFiled and TextArea");
        tf1= new JTextField(15);


        DateFormat df= new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField tf2= new JFormattedTextField(df);
        tf2.setColumns(15);
        tf2.setValue(new Date());
       
        
        NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setMaximum(10000);
        nft.setAllowsInvalid(false);
        JFormattedTextField tf3= new JFormattedTextField(nft);
        tf3.setColumns(15);
        tf3.setValue(0);

        ta= new JTextArea(15, 35);
        
        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);
        add(ta);
        
    }
    
}
public class TextField_TextArea {
    public static void main(String[] args) {
        InnerTextField_TextArea tfa= new InnerTextField_TextArea();
        tfa.setVisible(true);
        tfa.setSize(500, 500);
        tfa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
