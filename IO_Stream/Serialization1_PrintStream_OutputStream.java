package IO_Stream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


class Student {
    String Name;
    int RollNo;
    String Dept;
    float Avg;
}

public class Serialization1_PrintStream_OutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos= new FileOutputStream("E:\\JAVA Course\\Filesource\\studenrt1.txt");
        PrintStream ps= new PrintStream(fos);
        Student s1= new Student();
        s1.Name="Hari";
        s1.Avg=10.56f;
        s1.Dept="ECE";
        s1.RollNo=427;
        ps.println(s1.Name);
        ps.println(s1.Avg);
        ps.println(s1.Dept);
        ps.println(s1.RollNo);   
    }
}
