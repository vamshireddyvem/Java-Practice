

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Copying_Two_Files {
    public static void main(String[] args) {
        try {
            FileInputStream fis2= new FileInputStream("E:/JAVA Course/Filesource/s1.txt");
            FileInputStream fis3= new FileInputStream("E:/JAVA Course/Filesource/s2.txt");
            FileOutputStream fos2= new FileOutputStream("E:/JAVA Course/Filesource/des1.txt");
            SequenceInputStream seq= new SequenceInputStream(fis2, fis3);
            int c;
            while ((c=seq.read())!=-1) {
                fos2.write(c);
            }
            fis2.close();
            fis3.close();
            fos2.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
