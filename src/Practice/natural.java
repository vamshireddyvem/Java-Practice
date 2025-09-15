import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        int n,i;
        int sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Value of n");
            n=sc.nextInt();
        }
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
