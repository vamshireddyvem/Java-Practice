

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_Reader {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fis= new FileReader("Filesource//bfs.txt.txt");
        try (BufferedReader br = new BufferedReader(fis)) {
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
