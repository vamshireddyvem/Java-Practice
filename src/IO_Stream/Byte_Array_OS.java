package IO_Stream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte_Array_OS {
    public static void main(String[] args) throws IOException {
      ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
      bos.write('a');
      bos.write('b');
      bos.write('c');
      bos.write('d');
      bos.writeTo(new FileOutputStream("E://JAVA Course//Filesource/bytearrayOS.txt"));
    }
}
