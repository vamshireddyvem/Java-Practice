import java.util.*;
public class factors {
    public static void main(String[] args) {
        int i,n,fac=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        n=sc.nextInt();
        for (i=1;i<=n;i++){
            fac=(fac*i);
            System.out.println(fac);
        }
    }
    
}
