package AWT;
import java.awt.*;

public class App1 {
    public static void main(String[] args) {
        Frame f=new Frame("My First APP");
        Button B= new Button("OK");
        Label l= new Label("Name");
        TextField tf= new TextField();
        f.setVisible(true);
        f.add(l);
        f.add(tf);
        f.add(B);
        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
    }
}
