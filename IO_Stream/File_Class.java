package IO_Stream;

import java.io.File;
import java.io.IOException;

public class File_Class {
    public static void main(String[] args) throws IOException {
        File fi = new File("E:\\JAVA Course\\Filesource");
        System.out.println(fi.getParent());
        System.out.println(fi.isDirectory());
        System.out.println(fi.setLastModified(System.currentTimeMillis()));
        String list[]= fi.list();
        for (String  x : list) {
            System.out.println(x);
        }
        File[] list2=fi.listFiles();
        for (File x : list2) {
            System.out.print(x.getName());
            System.out.println(x.getPath());
        }
    }
}
