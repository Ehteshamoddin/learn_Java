package com.company;

class employee{
    int id;
    String name;
    public void display()
    {
        System.out.println(id);
        System.out.println(name);
    }
}
public class classes {
    public static void main(String[] args) {
        employee e1=new employee();
        employee e2=new employee();
        e1.id=1212;
        e1.name="Hello world";
        e2.id=2121;
        e2.name="Hello intellij idea in my pc";
        e1.display();
        e2.display();
//        System.out.println(e1.id);
//        System.out.println(e1.name);

    }
}
