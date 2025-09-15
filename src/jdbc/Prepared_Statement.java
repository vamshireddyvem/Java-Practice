import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Prepared_Statement {
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        PreparedStatement ps = con.prepareStatement("select * from students where deptno=?");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Department Number");
            int dno=sc.nextInt();
            ps.setInt(1, dno);
        }
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getInt("roll")+" | ");
            System.out.print(rs.getString("name")+" | ");
            System.out.print(rs.getString("city")+" | ");
            System.out.println(rs.getInt(4)+" | ");
        }

        rs.close();
        ps.close();
        con.close();
        

    }
}
