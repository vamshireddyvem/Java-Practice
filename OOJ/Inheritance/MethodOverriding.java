package OOJ.Inheritance;
class Parent{
    void display(){
        System.out.println("Parent Class Method"); ///
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Child Class Method");   /// When the same method is used in both parent and Child class it is called method Overriding
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Parent P= new Parent();
        P.display();
        Child C=new Child();
        C.display();                                // here the Parent class method is shadowed since it overrides
        Parent P2= new Child();
        P2.display();// The Object is created by Super Class Reference But the method  is called according to the object Created which is Child here, it is called Dynamic Method Dispatch
    }
}
