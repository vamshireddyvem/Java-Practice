package Static_Final;

class CoffeeMachine{
    private int Sugar;
    private int Milk;
    private static CoffeeMachine cm=null;
    private CoffeeMachine(){
        Sugar=1;
        Milk=1;
    }
    public static CoffeeMachine getInstance(){
        if(cm==null){
            CoffeeMachine cm=new CoffeeMachine();
        }
        return cm;
    }
}
class Singleton_class{
public static void main (String args[]){
    CoffeeMachine c1= CoffeeMachine.getInstance();
    CoffeeMachine c2= CoffeeMachine.getInstance();
    CoffeeMachine c3= CoffeeMachine.getInstance();
        if (c1==c2 && c2==c3){
            System.out.println("All the Refereces are referring to a single Refernce of cm Object of a Coffee Machine");
        }
    }
}
