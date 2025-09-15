import java.util.Scanner;

public class GProgression {
    public static void main(String args[]){
        int a,r,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            a=sc.nextInt();
            System.out.println("Enter the Common Ratio");
            r=sc.nextInt();
            System.out.println("Enter the No.Of TIMES");
            n=sc.nextInt();
        }
        // int t
        for(int i=0; i<n;i++){
            System.out.print(a);
            a=a*r;
            if(i==(n-1)){
                System.out.print(".");
            }
            else {
                System.out.print(", ");
            }
            
        }

    }
}
