package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream_Prac {
    public static void main(String[] args) {
        try {
            try (FileInputStream fis = new FileInputStream("E:/JAVA Course/Filesource/newfile.txt")) {
                byte[] b= new byte [fis.available()];
                System.out.println(fis.markSupported());
                fis.read(b);
                String str= new String(b);
                System.out.print(str);
                fis.close();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
