

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Buffered_InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Filesource//bfs.txt.txt");
        BufferedInputStream bis= new BufferedInputStream(fis);
        System.out.println(fis.markSupported());
        System.out.println(bis.markSupported());
        System.out.print((char)bis.read());
        bis.mark(3);
        System.out.print((char)bis.read());//I
        System.out.print((char)bis.read());//
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());//reset
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

    //    int x;
    //     while((x=bis.read())!=-1){
    //         System.out.print((char)x);
    
    //     }
        fis.close();
        bis.close();
    }
}
