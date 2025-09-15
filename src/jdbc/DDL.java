import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DDL {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
            Statement stm=con.createStatement();
            // stm.executeUpdate("create table Temp (a integer,b text)");
            stm.executeUpdate("drop table Temp");
            stm.close();
            con.close();
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
