package Methods;

import java.util.Scanner;

public class GCDMethod {
    static int FindGCD(int x,int y){
     while(y!=0){
        int temp=y;
        y=x%y;
        x=temp;
     }
     return x;
}
    public static void main(String[] args) {
        int num1,num2;
        Scanner Sc=new Scanner(System.in);
        num1=Sc.nextInt();
        num2=Sc.nextInt();
        System.out.println("GCD of "+num1+" and "+num2+" is "+FindGCD(num1, num2));
        }
    }