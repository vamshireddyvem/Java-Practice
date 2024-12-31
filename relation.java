import java.util.Scanner;
public class relation{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int a,b,c,z;
        System.out.println("Enter a b c");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a%2==0){
            System.out.println("a is EVEN");
        }
            else{
            System.out.println("a is ODD");
            }
        if (b%2==0){
            System.out.println("b is EVEN");
        }
            else{
            System.out.println("b is ODD ");
            }
        if (c%2==0){
            System.out.println("c is EVEN");
        }
            else{
                System.out.println("c is ODD");
            }
       
    }
}
