package Static_Final;
class test{
    final int K=1000; // final variables can initialze directly in a single line as class member like variable k
    final int Y;
    final int Z;
    {
        Y=100;           // final variables can initialiize as a class member in instance Block i,e; between{}.
    }
    test(){
        Z=10;              // final variables can be intialize inside a class Constructor.
    }
    final void show(){ //
        System.out.println("HI HELLO");
    }
}

final class test2 extends test{
    // void show(){ // final Methods Cannot be Overriden
    //     System.out.println("Hehaaahaha");
    // }
}
 // final class cannot be inherited 
// class test3 extends test2{              
// }
public class Final {
    public static void main(String[] args) {
        final int W=1;
        System.out.println(W);
        final int X; // final varibles can be intialize directly by two steps when it is inside the method.
        X=0;
        System.out.println(X);
        test n= new test();
        n.show();

    }
}
