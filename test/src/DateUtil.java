import java.text.ParsePosition;
import java.text.SimpleDateFormat;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.*;
import java.time.format.*;
import java.util.TimeZone;

public class DateUtil {
    private String time;
    private long timel;

    public DateUtil() {

    }

    public void setTime(String t) {
        this.time = t;
    }

    public void setTimel(long t) {
        this.timel = t;
    }

    public String getTime() {
        String result = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.timel);
        return result;
    }

    public long getTimel() {
        long time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).parse(this.time, new ParsePosition(0)).getTime();
        return time;
    }

    public long getLocalTimel() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(this.time, dtf);
        return ldt.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
    }

    public void getTimeZone() {
        TimeZone tz;
        synchronized(TimeZone.class) {
            TimeZone.setDefault(null);
            System.setProperty("user.timezone","");
            tz = TimeZone.getDefault();
        }
        System.out.println(tz.getID());
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getRawOffset());
    }
}
