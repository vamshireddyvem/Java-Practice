package DATE;

import java.time.LocalDate;
import java.time.ZoneId;

public class Time_API {
    public static void main(String[] args) {
        LocalDate d= LocalDate.now();
        System.out.println(d);
        LocalDate d1= LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(d1);
        
    }
}
