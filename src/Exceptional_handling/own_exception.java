package Exceptional_handling;

import java.util.Scanner;

class test extends Exception{
    public String toString(){
        return "Invalid Output";
    }
}
class methods{
    public static int mul1(int a,int b)throws test{
        int result=a*b;
        if(a==0||b==0){
            throw new test();
        }
        return result;
    }
    public static void  mul2(){
        Scanner uI= new Scanner(System.in);
        System.out.println("Enter the A Value");
        int num1=uI.nextInt();
        System.out.println("Enter the B Value");
        int num2 =uI.nextInt();
        display(num1, num2);
        uI.close();
    }
    public  static void  display(int a , int b){
        try {
            int ans=mul1(a, b);
            System.out.println("The Multiplication is "+ans);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class own_exception {
    public static void main(String args[]){
        methods.mul2();
    }
}
