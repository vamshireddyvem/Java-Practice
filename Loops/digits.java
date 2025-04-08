package Loops;
import java.util.Scanner;
public class digits {
    public static void main(String[] args) {
    int n,r,count=0;
    System.out.println("Enter the Number");
    Scanner sc= new Scanner (System.in);
    n= sc.nextInt();
        while (n>0) {
            r=n%10;
            System.out.println(r);
            n=n/10;
            count++;
        } 
        System.out.println("The No of Digits is "+ count);          
    }
}

