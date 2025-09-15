import java.util.Scanner;
class daysMonth{
    public static void main(String args[]){
        int year,month;
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter year: ");
            year=s.nextInt();
            System.out.print("Enter month (1-12): ");
            month=s.nextInt();
        }
        if (month>0 && month<13){
            if (month == 1 || month == 3 || month == 5 || month == 7 || 
            month == 8 || month == 10 || month == 12) {
                System.out.println("Days in "+month+" Month = 31 days");
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                System.out.println("Days in "+month+" Month = 30 days");
            }
            else if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Days in Month " + month + " = 29 days (Leap Year)");
                } else {
                    System.out.println("Days in Month " + month + " = 28 days");
                }
            }
        } 
        else{
            System.out.println("Enter VALID MONTH");
        }
    }
}