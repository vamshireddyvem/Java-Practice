package OOJ.Inheritance;
class parent{
    parent(){
        System.out.println("Non-Parameterized Parent Class");
    }
    parent (int x){
        System.out.println("Parameterized Parent Class");
    }
}
class child extends parent  {                 // Parameterized Constructors flows from parent to child in Inheritance and "keyword: Extends" makes inheritance between classes
    child (){
        System.out.println("Non-Parameterized child Class");
    }
    child (int y){
        System.out.println("Parmaterized child Class");
    }
    child(int x, int y){
        super(x);
        System.out.println("Both Parent and child paramterized");
    }
}
public class intro {
    public static void main(String[] args) {
        child c= new child(20,10);
        
    }
   
}
