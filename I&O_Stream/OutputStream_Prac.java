package I.O_Stream;

import java.io.FileOutputStream;

public class OutputStream_Prac {
    public static void main( String args[]){
        try {
            FileOutputStream fos = new FileOutputStream("E:/JAVA Course/Filesource/newfile.txt");
            String str="Hi VAMSHI";
            fos.write(str.getBytes());
            fos.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
}
