package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_Challenge {
    public static void main( String args[]){
        try {
            FileInputStream fis1= new FileInputStream("E:/JAVA Course//Filesource//s1.txt");
            FileOutputStream fos1= new FileOutputStream("E:/JAVA Course/Filesource/s2.txt");
            int x;
            while ((x=fis1.read())!=-1) {
                if (x>=65 && x<=90)fos1.write(x+32);
                else fos1.write(x);
            }
            //byte b[]= new byte[fis1.available()];
            // fis1.read(b);
            // fos1.write(b);
            fis1.close();
            fos1.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
