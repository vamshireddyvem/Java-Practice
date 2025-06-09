package IO_Stream.Serialization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStream_InputStream_Serialization {
    public static void main(String[] args) throws IOException {
        FileInputStream fis2 =new FileInputStream("E:\\JAVA Course\\Filesource\\studenrt1.txt");
        BufferedReader br= new BufferedReader(new InputStreamReader(fis2));
        Student1 s2 = new Student1();
        s2.Name=br.readLine();
        s2.Avg=Float.parseFloat(br.readLine());
        s2.Dept=br.readLine();
        s2.RollNo=Integer.parseInt(br.readLine());       
        System.out.println(s2.Name+" "+s2.Dept+" "+s2.Avg+" "+ s2.RollNo);
        fis2.close();
    }
}
