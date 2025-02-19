package Methods;

public class ValidateMethod {
    static String ValidateMethod(String name){
        //  name.matches("[a-zA-Z//s]+");
         return name;
    }
    static int  ValidateMethod(int x){
        if (x>=5&&x<=16) {
           System.out.print("Age is ");
        return x;
        }
        else{
            System.out.print("Age is Invalid ");
            return x;
        }
        
    }
    public static void main(String[] args) {
        String Student1="Vamshi";
        int age=27;
        System.out.println("Student name is: "+ValidateMethod(Student1));
        System.out.println(ValidateMethod(age));
    }
}
