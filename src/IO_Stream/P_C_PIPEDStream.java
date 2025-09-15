

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class producer extends Thread{
    OutputStream os;
    producer(OutputStream os){
        this.os=os;
    }
    public void run(){
        int count=1;
        while (true){
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer"+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }    
        }
    }
    
}
class consumer extends Thread{
    InputStream is;
    consumer (InputStream is){
        this.is=is;
    }
    public void run(){
        int x;
        while (true){
            try {
                x=is.read();
                System.out.println("Consumer"+x);
                System.out.flush();
                Thread.sleep(10);
            
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }    
        }
    }
    
}

public class P_C_PIPEDStream {
    public static void main(String[] args) throws IOException {
    PipedInputStream pis= new PipedInputStream();
    PipedOutputStream pos =new PipedOutputStream();
    (pis).connect(pos);
    producer p= new producer(pos);
    consumer c= new consumer(pis);
    p.start();
    c.start();
    }

}
