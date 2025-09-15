package Arrays;
import java.util.*;
public class SearchArray{
    public static void main(String args[]){
        System.out.println("Enter your key");
        try (Scanner sc = new Scanner (System.in)) {
            int key=sc.nextInt();
            int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
            System.out.println(a.length);
            for (int x:a) {
                if(key==x){
                    System.out.println(x);
                }
            }
            for (int i=0;i<a.length;i++){
                if(key==a[i]){
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }
        System.out.println("Not Found");          
    }
}
 