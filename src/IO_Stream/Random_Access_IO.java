

import java.io.IOException;
import java.io.RandomAccessFile;

public class Random_Access_IO {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile rf = new RandomAccessFile("E:\\JAVA Course\\Filesource\\newfile.txt", "rw")) {
            System.out.println(rf.read());
            System.out.println(rf.readChar());
            System.out.println(rf.getFilePointer());
            rf.seek(1);
            System.out.println(rf.readChar());
            rf.skipBytes(3);
            System.out.println(rf.getFilePointer());
            rf.write('d');
        }
        System.out.println();
    }
}
