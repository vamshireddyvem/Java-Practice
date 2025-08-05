package Collections.Map;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properities {
public static void main(String[] args) throws FileNotFoundException, IOException {
    Properties pr = new Properties();
    pr.setProperty("Item",  "Personal Computer");
    pr.setProperty("Brand", "Dell");
    pr.setProperty("Processor","I-10");
    pr.setProperty("Screen", "Amoled");
    pr.setProperty("RAM", "16GB");
    pr.setProperty("Storage","1GB SSD");
    pr.setProperty("Graphics","Intel U Graphics");

    pr.storeToXML(new FileOutputStream("E:\\JAVA Course\\IO_Stream\\properties.xml"), "jnhjd");


}
    
}