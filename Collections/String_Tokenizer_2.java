package Collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class String_Tokenizer_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("E:\\JAVA Course\\IO_Stream\\data.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data1= new String(b);
        StringTokenizer str=new StringTokenizer(data1);
        while (str.hasMoreElements()) {
            String s;
            s=str.nextToken();
            System.out.println(s);
        }

    }
}
