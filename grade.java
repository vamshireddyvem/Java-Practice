import java.util.Scanner;

public class grade {
   public static void main(String args[]){
    int tel,hin,eng,math,sci,soc,totalMarks,avg;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Telugu marks");
    tel=sc.nextInt();
    System.out.println("Enter Hindi marks");
    hin=sc.nextInt();
    System.out.println("Enter English marks");
    eng=sc.nextInt();
    System.out.println("Enter Maths marks");
    math=sc.nextInt();
    System.out.println("Enter Science marks");
    sci=sc.nextInt();
    System.out.println("Enter Social marks");
    soc=sc.nextInt();
    totalMarks=tel+hin+eng+math+sci+soc;
    
    System.out.println("Total Marks= "+ totalMarks);
    avg=totalMarks/6;
    if (tel<35 ||hin<35 ||eng<35 ||math<35||sci<35||soc<35){
        System.out.println("You are Failed");
    }
    else {
            System.out.println("Average="+avg);
            if(avg>=90 && avg<100){
                System.out.println("Grade A");
            }
            else if(avg>=80 && avg<90){
                System.out.println("Grade B");
            }
            else if(avg>=70 && avg<80){
                System.out.println("Grade C");
            }
            else if(avg>=60 && avg<70){
                System.out.println("Grade D");
            }
            else if (avg>=50 && avg<60){
                System.out.println("Grade E");   
            }
        }
    }
}
