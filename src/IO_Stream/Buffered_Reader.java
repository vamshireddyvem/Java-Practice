

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Buffered_Reader {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fis= new FileReader("Filesource//bfs.txt.txt");
        BufferedReader br = new BufferedReader(fis);
    }
}
