import java.util.Scanner;
public class days{
    public static void main(String args[]){
        int month,year;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Month in No");
        month=s.nextInt();
        if(month>=1 && month<=12){
            System.out.println("Month= "+month);
            System.out.println("Enter Year");
            year=s.nextInt();
            }
        else if(month<=12){
            System.out.println("Enter a valid Month");
        }
    }
}