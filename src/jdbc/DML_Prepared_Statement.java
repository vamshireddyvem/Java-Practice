import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DML_Prepared_Statement {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        PreparedStatement pstm= con.prepareStatement("insert into students values(?,?,?,?)");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Student Details");
            System.out.println("Enter Student Name");
            String name= sc.nextLine();
            System.out.println("Enter Student City");
            String city=sc.nextLine();
            System.out.println("Enter Student Deptartment");
            int dept=sc.nextInt();
            System.out.println("Enter Student Roll NO");
            int rolno=sc.nextInt();
            pstm.setString(2, name);
            pstm.setString(3, city);
            pstm.setInt(1, rolno);
            pstm.setInt(4, dept);
        }
        pstm.executeUpdate();
        pstm.close();
        con.close();
    }
}
