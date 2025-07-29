package LAMBDAEXP;


@FunctionalInterface
interface hello {

    void display();
}
// class hi implements hello{

//     @Override
//     public void display() {
       
//         System.out.println("HI Namaste");
//     }
    
// }
public class Lambdaexp {
    public static void main(String[] args) {
        // a regular object creation and overridding of a abstract method 
        // hello h= new hello() {

        //     @Override
        //     public void display() {
       
        //        System.out.println("HI Namaste");
        //     }
            
        // };

        // we can also create a Anonymous Method/object and over ride it

        // hello h= new hi(){
        //     public void display() {
        //     System.out.println("HI Namaste");
        // }



        // now the lambda expression is used like below

        hello h=()->{System.out.println("HI Namaste");};
        h.display();
    }

}
