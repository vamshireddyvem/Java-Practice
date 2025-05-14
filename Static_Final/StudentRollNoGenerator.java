package Static_Final;
import java.sql.Date;

class StudentRollNoGenerator{
    private String rollNo;
    private static int count=1;
    private String assignrollNo(){
        Date d= new Date(2025, 05, 01);
        String rn= "Uni-"+(d.getYear())+"-"+count;
        count++;
        return rn;
    }
    StudentRollNoGenerator(){
        rollNo=assignrollNo();
    }
   public  String getrollNo(){
        return rollNo;
    }

}
class Student {
public static void main(String[] args) {
    StudentRollNoGenerator s1=new StudentRollNoGenerator( );
    StudentRollNoGenerator s2=new StudentRollNoGenerator( );
    StudentRollNoGenerator s3=new StudentRollNoGenerator( );
    System.out.println(s1.getrollNo());
    System.out.println(s2.getrollNo());
    System.out.println(s3.getrollNo());
    }
}
