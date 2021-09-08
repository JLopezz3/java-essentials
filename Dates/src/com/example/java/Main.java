package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        //OLDER API below...
        //months uses 0 based indexing...so January = 0, February = 1 etc...
        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
        Date d1 = gc.getTime();
        System.out.println(d1);
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println(d2);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        //PRESENT API below...
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDate ld = LocalDate.of(2009, 1, 28);
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(ld));


    }
}
