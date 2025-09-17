package Java_Swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyInternalFrame extends JInternalFrame{
    static int count =0;
    JTextArea ta;
    JScrollPane sp;
    MyInternalFrame (){
        super("Document "+(++count),true,true,true,true);

        ta= new JTextArea();
        sp= new JScrollPane(ta);

        JMenuBar mb= new JMenuBar();
        JMenu file= new JMenu("File");
        JMenuItem item= new JMenuItem("Save");

        file.add(item);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }
}

class InternalFrame extends JFrame implements ActionListener{
    JDesktopPane dp;
    InternalFrame(){
        super("Internal Frame Demo");
        dp= new JDesktopPane();
        setContentPane(dp);
        JMenuBar mBar= new JMenuBar();
        JMenu Doc = new JMenu("Document");
        JMenuItem ne = new JMenuItem("New");

        Doc.add(ne);
        mBar.add(Doc);
        setJMenuBar(mBar);

        ne.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       MyInternalFrame mi= new MyInternalFrame();
       dp.add(mi);
    }
}

public class Internal_Frame {
    public static void main(String[] args) {
        InternalFrame ifi= new InternalFrame();
        ifi.setVisible(true);
        ifi.setSize(500, 500);
        ifi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
