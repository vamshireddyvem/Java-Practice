import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        int n,r;
        int rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            n=n/10;
            rev=(rev*10)+r;
        }
        System.out.println(rev);
    }
}
