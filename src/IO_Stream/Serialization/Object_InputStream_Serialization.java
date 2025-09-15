package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Object_InputStream_Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis= new FileInputStream("E:\\JAVA Course\\Filesource\\student4.txt");
        ObjectInputStream ois =new ObjectInputStream(fis);
        student2 s1= (student2)ois.readObject();
        System.out.println(s1.display());
        fis.close();
        ois.close();
    }
}
