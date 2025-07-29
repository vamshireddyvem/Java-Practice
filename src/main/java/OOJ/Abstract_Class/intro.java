package OOJ.Abstract_Class;

abstract class Super {
   
    void Methd1(){
        System.out.println("Super Class Method");
    }
   abstract  void display();
}
class Sub extends Super{
    void Methd1(){
        System.out.println("Sub Class Method");
    }
    void display(){
        System.out.println("Abstract method Overrridden");
    }
}
public class intro {
    public static void main(String[] args) {
        Super S= new Sub();
            S.display();
        
    }
}
