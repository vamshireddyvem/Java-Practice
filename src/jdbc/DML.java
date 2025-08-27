import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DML {
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con= DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\univ.db");
        Statement stm=con.createStatement();
        stm.executeUpdate("update dept set dname='Chem' where deptno=70");
        con.close();
        stm.close(); 
    }
    
}
