package IO_Stream.Serialization;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_Serialization {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos3= new FileOutputStream("E:\\JAVA Course\\Filesource\\student3.txt");
        try (DataOutputStream dos = new DataOutputStream(fos3)) {
            Student s3= new Student();
            s3.Name="Vicky";
            s3.Dept="CSE";
            s3.RollNo=1259;
            s3.Avg=9.85f;
            dos.writeUTF(s3.Name);
            dos.writeUTF(s3.Dept);
            dos.writeInt(s3.RollNo);
            dos.writeFloat(s3.Avg);
            fos3.close();
            dos.close();
        }
    }
}
