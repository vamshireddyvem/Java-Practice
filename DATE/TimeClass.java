package DATE;

import java.time.Instant;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeClass {
    public static void main(String[] args) {
        ZonedDateTime zt= ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(zt);

        OffsetDateTime oft= OffsetDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(oft);

        MonthDay md= MonthDay.now();
        System.out.println(md);

        Period p =Period.of(2, 2, 2);
        System.out.println(p.addTo(LocalDate.now()));
        
        Instant i= Instant.now();
        System.out.println(i);
    }
}
