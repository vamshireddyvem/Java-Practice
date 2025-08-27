import java.sql.*;

class Database
{
public static void main(String arg[]) throws Exception
{
Class.forName("org.sqlite.JDBC");

Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

Statement stm= con.createStatement();

ResultSet rs= stm.executeQuery("select * from dept");
int dno;
String dname;

while(rs.next()){
dno=rs.getInt("deptno");
dname=rs.getString("dname");
System.out.println(dno+" "+dname);
}
}
}