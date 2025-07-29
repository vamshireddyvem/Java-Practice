package IO_Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Seq_Access_IO {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new FileReader("E:\\JAVA Course\\Filesource\\newfile.txt"));
        System.out.println((char)bf.read());
        System.out.println((char)bf.read());
    }
}
