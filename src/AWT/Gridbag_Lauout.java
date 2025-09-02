package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

class MyFrame11 extends Frame{
    
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    public MyFrame11(){
        super("Grid_Layout");
        
        // GridLayout gl= new GridLayout(3,3);
        GridBagLayout gbl= new GridBagLayout();
        GridBagConstraints gbc= new GridBagConstraints();
      
        setSize(300,300);
        setLayout(gbl);
        setVisible(true);
        b1= new Button("One");
        b2= new Button("Two");
        b3= new Button("Three");
        b4= new Button("Four");
        b5= new Button("Five");
        b6= new Button("Six");
        b7= new Button("Seven");
        b8= new Button("Eight");

        gbc.gridx=1;
        gbc.gridy=1;
        add(b1,gbc);

        gbc.gridx=3;
        gbc.gridy=1;
        add(b2,gbc);

        gbc.gridx=2;
        gbc.gridy=2;
        add(b3,gbc);

        gbc.gridx=1;
        gbc.gridy=3;
        add(b4,gbc);

        gbc.gridx=3;
        gbc.gridy=3;
        add(b5,gbc);

        gbc.gridx=2;
        gbc.gridy=5;
        add(b6,gbc);

        gbc.gridx=1;
        gbc.gridy=6;
        add(b7,gbc);

        gbc.gridx=3;
        gbc.gridy=6;
        add(b8,gbc);
    }
}

public class Gridbag_Lauout {
        public static void main(String[] args) {
            MyFrame11 my10= new MyFrame11();

    }
}
