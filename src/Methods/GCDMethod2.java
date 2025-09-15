package Methods;

import java.util.Scanner;

public class GCDMethod2 {
    static int gcd(int x,int y){
        while(x!=y){
            if (x>y){
                x=x-y;
            }
            else if(y>x){
               y=y-x;
            }  
        }
        return x;
    }
    public static void main(String[] args) {
        int num1,num2;
        try (Scanner sc = new Scanner(System.in)) {
            num1=sc.nextInt();
            num2=sc.nextInt();
        }
        System.out.println(gcd(num1, num2));
    }
}
