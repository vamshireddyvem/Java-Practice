package OOJ.Interfaces;

interface test{
    final static int X=5; // identifiers can be used and they are defaulted as final and static and can be called in main method by using inteface name.variable  for ex: test.x;
    void method1(); // by default interfaces methods are abstract and public
    void method2();
    static void method3(){
        System.out.println("method-3 is called from test interface");  // to have body of a method the method has to be static
    }
    default void method4(){
        System.out.println("method-4 is Called");// to have a body or non abstract methods in interface it has be default or static depending logic
    }
    private void method6(){
        System.out.println("method-6 is called from test interface");
    }
    default void method7(){
        method6();                   // private methods are used within the interfaces itself for logic
    }
}
interface test2 extends test{
    void method5();
}
class exam implements test2{
    public void method1(){
        System.out.println("Method-1 from test interface which is overriden by class exam");
    }
    public void method2(){
        System.out.println("Method-2 from test interface which is overriden by class exam");

    }
    public void method3(){
        System.out.println("Method-3 from test interface which is overriden by class exam"); //
    }
    public void method4() {
        System.out.println("Method-4 from test interface which is overriden by class exam");  // default method can be called into class by overridden

    }
    public void method5(){
        System.out.println("Method-5 from test2 interface which is overriden by class exam"); // test2 interface method is Overridden
    }

}
public class Do_and_Dont {
    public static  void main (String args[]){
        System.out.println(test.X);
        test.method3();  // here static method is called from interface itself
        exam m1= new exam();
        m1.method4();
        m1.method3(); // here the method is called from the object by is overridden by class exam
        m1.method7(); // here method 6 is called as it is private and called within the interface and implements here with method 7
    }
}
