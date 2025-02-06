import java.util.Scanner;
class daysMonth{
    public static void main(String args[]){
        int year,month;
        Scanner s=new Scanner(System.in);
        year=s.nextInt();
        month=s.nextInt();
        if (month>0 && month<13){
            if(month[]=={1,3,5,7,8,10,12}){
                System.out.println("Days in "+month+"Month = 31days");
            }
            else if(month[]=={4,6,9,11}){
                System.out.println("Days in "+month+"Month = 31days");
            }
            else if(year%4==0 && month==2){
                System.out.println("Days in "+month+"Month = 28days");
            }
            else{
                System.out.println("Days in "+month+"Month=29days");
            }
        }
        else{
            System.out.println("Enter VALID MONTH");
        }
    }
}