package Loops;
import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        int n,r,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number you want to check");
        n=sc.nextInt();
        int m=n;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        System.out.println(sum);
        if (sum==m) {
            System.out.println(sum+" is a Armstrong Number");
        }

    }    
}
