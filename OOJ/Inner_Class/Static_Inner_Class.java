package OOJ.Inner_Class;

class Outter{
    int x=5;
    static int y=15;
    static class Inner_Static{
        void display(){
        System.out.println(y);
    }   
}
}
public class Static_Inner_Class {
    public static void main(String[] args) {
        Outter.Inner_Static OI= new Outter.Inner_Static();
        OI.display();
    }
}
