import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Students_Database {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        Statement stm= con.createStatement();
        ResultSet rs= stm.executeQuery("Select * from students");
        while (rs.next()) {
            System.out.print(rs.getInt("roll")+" | ");
            System.out.print(rs.getString("name")+" | ");
            System.out.print(rs.getString("city")+" | ");
            System.out.println(rs.getInt(4)+" | ");
        }
        rs.close();
        stm.close();
        con.close();
    }
}
