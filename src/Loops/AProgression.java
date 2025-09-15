package Loops;
import java.util.*;
public class AProgression {
    public static void main(String args[]){
        int n,d,a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Number");
            a=sc.nextInt();
            System.out.println("Enter The Difference");
            d=sc.nextInt();
            System.out.println("Enter The No.Of Times");
            n=sc.nextInt();
        }
        for (int i=0; i<n;i++) {
        System.out.print(a);
        a=a+d;
        if(i==(n-1)){
            System.out.print(".");
        }
        else{
            System.out.print(", ");
        }
        
        }
        
    }    
}
