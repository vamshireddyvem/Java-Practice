package IO_Stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Byte_Array_IS {
    public static void main(String[] args) throws IOException {
        byte b[]={'a','b','c','d'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        // int x;
        // while ((x=bis.read())!=-1) {
        //     System.out.println((char)x);
        // }
        String str =new String(bis.readAllBytes());
        System.out.println(str);
        bis.close();

    }
}
