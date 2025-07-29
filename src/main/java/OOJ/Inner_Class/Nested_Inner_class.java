package OOJ.Inner_Class;
class outer {
    int x=5;
    void outerdisplay(){
        System.out.println("It is from Outer Class");
        inner i= new inner();       // a inner class members/variables are accesible by using object of inner class by outer class.
        i.innerDisplay();
    }
    class inner{
        int y=15;
        void innerDisplay(){
            System.out.println("It is from Inner Class");
            System.out.println(x+y); // outer class is accesible by inner class
        }
    }
}
public class Nested_Inner_class {
    public static void main( String args[]){
        outer o= new outer();
        // i.innerDisplay(); // Inner class members are not accesible without any outer class members
        o.outerdisplay();
        outer.inner oi =new outer().new inner(); // inner class members are called using outer class as it is limited by outer class itself.
        oi.innerDisplay();

    }
}
