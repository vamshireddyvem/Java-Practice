package LAMBDAEXP;
@FunctionalInterface
interface Grandfather {
 void display();
}
class Father{
    void UseFather(Grandfather gf){
        gf.display();
    }
}
class Son{
    void method(){
    Father f= new Father();
    f.UseFather(()->{System.out.println("Hello");}); // a method is passing as an object parameter to a method of another class.
    }
}
public class Capture1 {
    public static void main(String[] args) {
        Son s= new Son();
        s.method();
    }
}
