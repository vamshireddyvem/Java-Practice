package IO_Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Serialzation1_PrinStream_InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis2 =new FileInputStream("E:\\JAVA Course\\Filesource\\studenrt1.txt");
        BufferedReader br= new BufferedReader(new InputStreamReader(fis2));
        Student s2 = new Student();
        s2.Name=br.readLine();
        s2.Avg=br.read();
        s2.Dept=br.readLine();
        s2.RollNo=br.read();
        System.out.println(s2.Name+" "+s2.Dept+" "+s2.Avg+" "+ s2.RollNo);
        
        
    }
}
