package org.formatter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class formatterEx3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.SEPTEMBER, 18);

        Date date = calendar.getTime();

        SimpleDateFormat[] simpleDateFormats = new SimpleDateFormat[]{
                new SimpleDateFormat("yyyy-MM-dd"),
                new SimpleDateFormat("yyyy-MM-dd E요일"),
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"),
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"),
        };

        for(SimpleDateFormat formats :  simpleDateFormats){
            System.out.println(formats.format(date));
        }

    }
}
