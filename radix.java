import com.sun.corba.se.spi.orbutil.fsm.Input;
import java.util.Scanner;
public class radix{
    public static void main (String args[]){
        String no;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your Numbers");
        no=sc.nextLine();
        if(no.matches("[01]+")){
            System.out.println("the no is Binary");
        }
        else if(no.matches ("[0-7]+")){
           System.out.println("the no is Octal"); 
        }
        else if(no.matches("[0-9]+")){
            System.out.println("the no is Decimal");
        }
        else if(no.matches("[0-9 A-F]+")){
            System.out.println("the no is Hexa-Decimal");
        }
    }
}