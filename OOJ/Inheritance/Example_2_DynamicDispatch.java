package OOJ.Inheritance;
class car{
    void accelerate(){
        System.out.println("Rev The Engine");
    }
    void Brake(){
        System.out.println("Stops The Engine");
    }
    void changeGear(){
        System.out.println("Gear Changed");
    }}

class Luxcar extends  car{
    void changeGear(){
        System.out.println("Automatically changes Gear");
    }
    void infoSystem(){
        System.out.println("Plays Music and Shows 360 Degree Camera");
    }
}

public class Example_2_DynamicDispatch {
    public static void main(String Args[]){
        car ho= new car();
        ho.accelerate();
        ho.Brake();
        ho.changeGear();
        Luxcar ty= new Luxcar();
        ty.changeGear();     // Dynamic Dispatch Method which is by super class reference and the object is created by Sub class where it only access common methods in both sub and super class
        ty.infoSystem();
        car vw= new Luxcar();
        vw.accelerate();
        vw.Brake();
        vw.changeGear();
        
    }
}
