package com.company;

import java.util.ArrayList;

class MyGeneric<T1,T2>{
    int val;
    private  T1 t1;
    private  T2 t2;

    public MyGeneric(int val,T1 t1,T2 t2) {
        this.val = val;
        this.t1=t1;
        this.t2=t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class java_generics {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
//        arrayList.add(2);
//        arrayList.add("Hello");
//        arrayList.add(4);
//        arrayList.add(8);
//
//        int a= (int) arrayList.get(0);
//        System.out.println(a);

        MyGeneric<String,Integer> g1=new MyGeneric<>(10,"My string",25);
        Integer i1= g1.getVal();
        Integer i2= g1.getT2();
        String str=g1.getT1();
        System.out.println(str);
        System.out.println(i1);
        System.out.println(i2);
    }
}