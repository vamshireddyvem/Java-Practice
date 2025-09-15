package Networks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
       
        try {
        try (ServerSocket ss = new ServerSocket()) {
            Socket st = ss.accept();
            
            BufferedReader br= new BufferedReader(new InputStreamReader(st.getInputStream()));
            PrintStream ps = new PrintStream(st.getOutputStream());

            String msg;
            StringBuilder sbr;
                do {
                    msg=br.readLine();
                    sbr= new StringBuilder(msg);
                    sbr.reverse();
                    msg=sbr.toString();
                    ps.println(msg);
                } while (!msg.equals("dne"));
                    st.close();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
