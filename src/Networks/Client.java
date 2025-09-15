package Networks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket st= new Socket("Localhost", 2000);
            BufferedReader keybr= new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream())); 
            PrintStream ps= new PrintStream(st.getOutputStream());
            String msg;
            do {
                msg=keybr.readLine();
                ps.print(msg);
                msg=br.readLine();
                System.out.println("From Client "+msg);
            } while (!msg.equals("nde"));
            st.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
