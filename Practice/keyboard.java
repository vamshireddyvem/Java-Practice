
import java.util.Scanner;

class keyboard {

    public static void main(String args[]) {
        System.out.println("Enter The name");
        Scanner s = new Scanner(System.in);
        String a;
        a = s.nextLine();
        System.out.println("My name is " + a);
        int x, y, z;
        System.out.println("Enter the Numbers");
        x = s.nextInt();
        y = s.nextInt();
        z = x + y;
        System.out.println("The sum is " + z);

    }
}
