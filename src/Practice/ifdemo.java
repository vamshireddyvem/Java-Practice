import java.util.Scanner;

public class ifdemo {
    public static void main(String[] args) {
        long balance= 5000;
        long withdraw=0, deposit=0;
        int option;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to ATM"+"\n"+"Please Select an Option"+"\n"+"1.Balance "+"\n"+"2.Deposit"+"\n"+"3.Withdraw");
            option=sc.nextInt();
            if (option==1){
                System.out.println("Your Account Balance is "+balance);
            }
            else if (option==2){
                System.out.println("Enter the Amount to deposit");
                deposit= sc.nextLong();
                
                if (deposit > 10000) {
                System.out.println("Deposit cannot exceed ₹10,000.");
                } 
                else if (deposit % 100 != 0) {
                System.out.println("Deposit must be in multiples of ₹100.");
                } 
                else {
                System.out.println("Deposit successful. Amount deposited: ₹" + deposit);
                }
                balance= balance+deposit;
                System.out.println("Updated Balance "+ balance);
            }
            else if(option ==3){
                System.out.println("Enter the Amount to Withdraw");
                withdraw= sc.nextLong();
            }
        }     
    }
}

