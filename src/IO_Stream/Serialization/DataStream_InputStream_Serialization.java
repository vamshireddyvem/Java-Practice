package Serialization;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStream_InputStream_Serialization {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("E:\\JAVA Course\\Filesource\\student3.txt");
        try (DataInputStream dis = new DataInputStream(fis)) {
            Student1 s3= new Student1();
            s3.Name= dis.readUTF();
            s3.Dept=dis.readUTF();
            s3.RollNo=dis.readInt();
            s3.Avg=dis.readFloat();
            System.out.println(s3.Name+" "+s3.Dept+" "+s3.RollNo+" "+s3.Avg);
            fis.close();
            dis.close();
        }
        
    }
}
