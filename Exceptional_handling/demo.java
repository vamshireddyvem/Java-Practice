package Exceptional_handling;

import java.util.Scanner;
class demo {
    public static void main(String[] args) {    
    int a,b,c;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator Must not be Zero");
            System.out.println(e); // the message is from JVM
        }
        System.out.println("The Demo of Exceptions");

    }
}