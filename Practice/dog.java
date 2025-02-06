public class dog {
    
        int size;
        String Name;
        String Breed;
        void bark (){
            System.out.println("ruff ruff");
        }
    }
class testdog{
    public static void main(String args[]){
        dog d=new dog();
        d.size=40;
        System.out.println(d.size);
        d.bark();
        
}
}