package com.company;

interface DemoAno{
    void meth1();
//    void meth2();
}

//Without implementing class we can create method with lambda expression
//class next implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}

//class AnonyDemo implements DemoAno{
//
//    @Override
//    public void meth1() {
//        System.out.println("I am method 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am method 2");
//    }
//}

public class expression {
    public static void main(String[] args) {
//        AnonyDemo obj=new AnonyDemo();
//        obj.meth1();

        //Object created by anonymous class,This is used when a local class is to be used only once
//        DemoAno obj=new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am method 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am method 2");
//            }
//        };
//        obj.meth1();

        //Lambda Expressions
//        DemoAno obj=new next();
//        obj.meth1();
        DemoAno obj=()->{
            System.out.println("I am method 1 from this lambda function");
        };
        obj.meth1();
    }
}