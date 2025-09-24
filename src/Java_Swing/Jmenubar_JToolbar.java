package Java_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

class Inner_JMenubar_JToolbar extends JFrame implements ActionListener{
 JButton b1,b2,b3,b4,b5,b6,b7;
 JToolBar tb;
 JTextArea ta;
    Inner_JMenubar_JToolbar(){
        super("Menu & Toolbar");

        JMenuBar MB= new JMenuBar();
        JMenu file= new JMenu("File");
        JMenuItem Open= new JMenuItem("Open");
        JMenuItem New= new JMenuItem("New");
        
        file.add(Open);
        file.addSeparator();
        file.add(New);
        MB.add(file);
        setJMenuBar(MB);
        Open.setMnemonic(KeyEvent.VK_O);
        New.setMnemonic(KeyEvent.VK_N);

        b1= new JButton("O");
        b2= new JButton("FC");
        
        tb= new JToolBar();
        tb.add(b1);
        tb.add(new JToolBar.Separator());
        tb.add(b2);
        
        ta= new JTextArea();
        JScrollPane sp= new JScrollPane(ta);
        b1.setActionCommand("Open");
        Open.setActionCommand("Open");
        b1.addActionListener(this);
        Open.addActionListener(this);
        b2.addActionListener(this);
        New.addActionListener(this);
        add(tb,BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Open")){
        JFileChooser fc= new JFileChooser();
        fc.showOpenDialog(this);
        File f = fc.getSelectedFile();
        try {
            FileInputStream FIS= new FileInputStream(f);
            byte b[]= new byte[FIS.available()];
            FIS.read(b);
            String data= new String(b);
            ta.setText(data);
            FIS.close(); 

        } catch (Exception e) {
            System.out.println("Input ERROR");
        }
        }else{
            Color col= JColorChooser.showDialog(this, "Font Color", Color.BLUE);
            ta.setForeground(col);
        }
    }
}
public class JMenubar_JToolbar {
     public static void main(String[] args) {
        Inner_JMenubar_JToolbar mt= new Inner_JMenubar_JToolbar();
        mt.setVisible(true);
        mt.setSize(500, 500);
        mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
