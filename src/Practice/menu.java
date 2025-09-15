import java.util.*;
public class menu {
    public static void main(String[] args) {
        String str;
        int no1,no2;
        System.out.println("MENU");
        System.out.println("-----------------");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your two NO ");
            no1=sc.nextInt();
            no2=sc.nextInt();
            System.out.println("Select the Arthematic Operation as In words");
            str=sc.nextLine();
            str=sc.nextLine();
        }
        switch (str) {
            case "ADD": System.out.println("Addition of "+no1+" and "+no2+" is "+(no1+no2));
                break;
            case "SUB" :System.out.println("Substraction of "+no1+" and "+no2 + " is "+(no1-no2));
                break;
            case "MUL": System.out.println("Multiplication of "+no1+" and "+no2+" is "+(no1*no2));
                break;
            case "DIV": System.out.println("Division of "+no1+" and "+no2+" is "+(no1/no2));
                break;
            default:System.out.println("Please Check The Options");
            break;
        }
    }
}
