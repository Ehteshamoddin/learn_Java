package com.company;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        //String name=new String("Harry Potter");
        //strings are immutable and cannot be changed
//        String name="Harry Potter";
//        System.out.println("The name is:");
//        System.out.println(name);
//        int a=6;
//        float b=5.6454f;
//        System.out.printf("The value of a is %d and b is %f",a,b);
        Scanner sc=new Scanner(System.in);
//        String st=sc.next();//  for one word
        String st=sc.nextLine();//  for many words
        System.out.println(st);

    }
}