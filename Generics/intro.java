package Generics;

public class intro {
    public static void main(String[] args) {
        // Object obj = new String();
        // obj= "Hi";
        // obj= 10;// Doesnt show any Compile time Errors as their is No Type Safety
        // String str= (String) obj; // type cast is needed when try to store/Use in a variable
        // System.out.println(obj);

        Object obj[]= new Object[3];
        obj[0]="Hi";
        obj[1]="Hello";
        obj[2]=25;
        for (int i=0; i<3;i++) {
            String str= (String) obj[i];
            System.out.println(str);
        }
    }
}
