package org.formatter;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class formatterEx4 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        String[] patterns = new String[]{"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss.SSS"};

        for(String pattern : patterns){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            System.out.println(formatter.format(now));
        }

    }
}
