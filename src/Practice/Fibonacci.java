import java.util.*;
class Fibonacci{
    public static void main(String args[]){
        int a=0;
        int b=1;
        int c,n;
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enters No.Of TIMES");
            n=sc.nextInt();
        }
        System.out.print(a +", "+b+", ");
        for (int i=0; i<n;i++){
            c=a+b;
            System.out.print(c);
            a=b;
            b=c;
            if(i==(n-1)){
                System.out.print(".");
            }
            else{
                System.out.print(", ");
            }
            
        }
    }
}