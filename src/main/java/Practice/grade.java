import java.util.Scanner;
public class grade{
    public static void main(String args[]){
        int tel,hin,eng,sci,soc,math,avg;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Telugu Marks");
        tel=sc.nextInt();
        System.out.println("Enter Hindi Marks");
        hin=sc.nextInt();
        System.out.println("Enter English Marks");
        eng=sc.nextInt();
        System.out.println("Enter Science Marks");
        sci=sc.nextInt();
        System.out.println("Enter Social Marks");
        soc=sc.nextInt();
        System.out.println("Enter Maths Marks");
        math=sc.nextInt();
        avg=(tel+hin+eng+sci+soc+math)/6;
        System.out.println(avg);

    }
    
}     