import java.util.Scanner;
import java.util.Matcher;
public class leapYear{
    public static void main(String args[]){
        int year;
        int days= 365;
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Year");
        year=Sc.nextInt();
        if (year.matches("[0-9]{4}")){
        if (year%4==0){
            System.out.println("This is a Leap Year");
            days=days++;
            System.out.println(year+" has "+days+" days");
        }
        else {
        System.out.println("This is NOT a Leap Year");
        System.out.println(year+" has "+days+" days");
        }
        }else {
            System.out.println("Invalid Year Try Again by Running the code again");
        }
    }   
}