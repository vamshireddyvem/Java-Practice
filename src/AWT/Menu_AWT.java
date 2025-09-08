package AWT;

import java.awt.CheckboxMenuItem;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



class InnerMenu_AWT extends Frame{

    Menu File,Sub;
    MenuItem Open,Save,Close,CloseAll;
    CheckboxMenuItem Auto;
    TextField TF;

    InnerMenu_AWT(){
        super("Menu");
        Open =new MenuItem("Open");
        Save= new MenuItem("Save");
        Close= new MenuItem("Close");
        CloseAll= new MenuItem("Close All");

        Auto= new CheckboxMenuItem("Auto Save");

        File = new Menu("File");
        Sub = new Menu("Close");

        File.add(Open);
        File.add(Save);
        File.add(Auto);
        File.add(Sub);

        Sub.add(Close);
        Sub.add(CloseAll);


        TF= new TextField(20);
        setLayout(new FlowLayout());
        add(TF);

        MenuBar mb= new MenuBar();
        mb.add(File);
        setMenuBar(mb);


        Open.addActionListener((ActionEvent ae)->{
            TF.setText("OPEN");
        });

        Save.addActionListener((ActionEvent ae)->{
            TF.setText("Save");
        });

        Close.addActionListener((ActionEvent ae)->{
            TF.setText("Close");
        });
        CloseAll.addActionListener((ActionEvent ae)->{
            TF.setText("CloseAll");
        });


        Auto.addItemListener((ItemEvent ie)->{
            if (Auto.getState()) {
                TF.setText("Auto Save ON");
            }
            else{TF.setText("Auto Save OFF");}
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
    }
    
}   

public class Menu_AWT {
    public static void main(String[] args) {
        InnerMenu_AWT im= new InnerMenu_AWT();
        im.setSize(500,500);
        im.setVisible(true);
    }
}
