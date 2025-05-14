package OOJ.Inner_Class;
abstract class Outer{
    abstract void display();
}
class Inner{
    void Innerdisplay(){
    new Outer(){
        void display(){
            System.out.println("Anonmyous Inner Class");
        }
    }.display();;
}
}
public class anonmyous_inner_class {
    public static void main(String[] args) {
        Inner n = new Inner();
        n.Innerdisplay();
    }
}
