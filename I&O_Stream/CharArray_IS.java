package I.O_Stream;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArray_IS {
    public static void main(String args[]) throws IOException{
        char c[]= {'A','B','C','D'};
        CharArrayReader cr= new CharArrayReader(c);
        int x;
        while ((x=cr.read())!=-1) {
            System.out.println((char)x);
        }
        cr.close();
    }
}
