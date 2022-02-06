package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

//        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");//This the format
////        String myDate=dt.format(df);//creating date string using date format

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy --E H:m a");//This the format
//        String myDate=dt.format(df);//creating date string using date format
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate=dt.format(df);//creating date string using date format
        System.out.println(myDate);
    }
}