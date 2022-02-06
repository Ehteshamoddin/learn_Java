package com.company;

import java.util.Date;

public class date {
    public static void main(String[] args) {
        System.out.print("Number of years passed from 1 Jan 1970 : ");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//        System.out.println(Long.MAX_VALUE);
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getHours());
        System.out.println(d.getYear());
    }
}