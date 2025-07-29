package Collections;

import java.util.StringTokenizer;

public class String_Tokenizer {
public static void main(String[] args) {
    
    String data= "Brand=Lenevo;Processor=i10;Ram=16GB;Storage=1GB SSD;ScreenSize=14";
    StringTokenizer st= new StringTokenizer(data,"=;");
    String s;
    while (st.hasMoreElements()) {
        s=st.nextToken();
        System.out.println(s);
    }
}
    
}
