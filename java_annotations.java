package com.company;

//override

//class KeyPadPhone{
//    void sendMessage(){
//        System.out.println("Text message sent!");
//    }
//}
//
//class AndroidPhone extends KeyPadPhone{
//    @Override
//    void sendMessage(){
//        System.out.println("Message sent via WhatsApp!");
//    }
//}
//
//public class java_annotations{
//    public static void main(String args[]){
//        AndroidPhone Samsung = new AndroidPhone();
//        Samsung.sendMessage();
//    }
//}


//Depricated

//class KeyPadPhone{
//    @Deprecated
//    void sendMessage(){
//        System.out.println("Text message sent!");
//    }
//}
//
//class AndroidPhone extends KeyPadPhone{
//    @Override
//    void sendMessage(){
//        System.out.println("Message sent via WhatsApp!");
//    }
//}
//
//public class java_annotations{
//    public static void main(String args[]){
//        AndroidPhone Samsung = new AndroidPhone();
//        Samsung.sendMessage();
//    }
//}

//SupressWarnings

//class KeyPadPhone{
//    @Deprecated
//    void sendMessage(){
//        System.out.println("Text message sent!");
//    }
//}
//
//class AndroidPhone extends KeyPadPhone{
//    @Override
//    void sendMessage(){
//        System.out.println("Message sent via WhatsApp!");
//    }
//}
//
//public class CWH{
//    public static void main(String args[]){
//        @SuppressWarnings("deprecation")
//        AndroidPhone Samsung = new AndroidPhone();
//        Samsung.sendMessage();
//    }
//}

//FunctionInterface

@FunctionalInterface
interface myFunctionalInterface {
    void method1();
//    void methodd2();   //This throws an error
}
public class java_annotations{
    public static void main(String args[]){
        System.out.println("Functonal interface annotation");

    }
}
