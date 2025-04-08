package Loops;
import java.util.*;
public class table {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner (System.in);
        System.out.println("What Table You Want");
        n=sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(n+" "+" X "+i+" "+" = "+(n*i));
        }
    }
    
}
