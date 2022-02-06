package com.company;

public class precedence {
    public static void main(String[] args) {
//        int a=6*5-34/2;
//        System.out.println(a);
        //highest precedence goes to * and / they are then evaluated on the basis of associativity(left to right)

//        int b=6/5-34*2;
//        System.out.println(b);
//        int x=6;
//        int y=1;
//        int k=x*y/2;
        int b=1;
        int c=4;
        int a=5;
//        int k=(b*b-4*a*c)/(2*a);
        int k=b*b-4*a*c/2*a;
        System.out.println(k);
        //associativity of * and / is left to right
    }
}
