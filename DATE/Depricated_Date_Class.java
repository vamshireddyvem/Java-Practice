package DATE;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Depricated_Date_Class {
    public static void main(String[] args) {
        Date d= new Date(01/01/2025);
        System.out.println(d);
        System.out.println(System.currentTimeMillis());
        GregorianCalendar gc= new GregorianCalendar();
        System.out.println(gc.get(Calendar.DATE));
        TimeZone tz=gc.getTimeZone();
        gc.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.println(gc);
    }
}
