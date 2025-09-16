package Java_Swing;

import java.awt.BorderLayout;

import java.io.File;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class Inner_Tree extends JFrame implements TreeSelectionListener{

    JTree tree;
    JLabel label;
    
    Inner_Tree(){
        DefaultMutableTreeNode root= new DefaultMutableTreeNode("E:/JAVA Course");
        File f= new File("E:/JAVA Course");

        for (File x:f.listFiles()) {
            if (x.isDirectory()) {
                DefaultMutableTreeNode temp= new DefaultMutableTreeNode(x.getName());
                for (File y : x.listFiles()) {
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            }
            else{
                root.add(new DefaultMutableTreeNode(x.getName()));
            }
           
        }
        tree= new JTree(root);
        label= new JLabel("No Files Selected");
        JScrollPane sp= new JScrollPane(tree);
        tree.addTreeSelectionListener(this);
        add(sp,BorderLayout.CENTER);
        add(label,BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        // label.setText(e.getPath().toString()); // this is get the path and the below is for the name of the file
        TreePath tp=e.getPath();
        StringTokenizer sz=new StringTokenizer(tp.toString(),",]");
        String str="";
        while(sz.hasMoreTokens())
            str=sz.nextToken();
        label.setText(str);
    }

}
public class Tree {
    public static void main(String[] args) {
        Inner_Tree it= new Inner_Tree();
        it.setVisible(true);
        it.setSize(500, 500);
        it.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
