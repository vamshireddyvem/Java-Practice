package DATE;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now();
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(df.format(dt));
    }
}
