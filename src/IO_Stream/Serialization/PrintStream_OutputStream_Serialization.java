package Serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


class Student1 {
    String Name;
    int RollNo;
    String Dept;
    float Avg;
}

public class PrintStream_OutputStream_Serialization {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos= new FileOutputStream("E:\\JAVA Course\\Filesource\\studenrt1.txt");
        PrintStream ps= new PrintStream(fos);
        Student1 s1= new Student1();
        s1.Name="Hari";
        s1.Avg=10.56f;
        s1.Dept="ECE";
        s1.RollNo=427;
        ps.println(s1.Name);
        ps.println(s1.Avg);
        ps.println(s1.Dept);
        ps.println(s1.RollNo);  
        fos.close();
    }
}
