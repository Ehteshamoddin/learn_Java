package com.company;

/**
 * This is the good class
 */
public class java_docs_method_tags {
    /**
     *
     * @param args This are arguments supplied to command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     *Hello this the method
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two number as a integer
     * @throws Exception if i is 0
     * @deprecated  This method is deprecated please use + operator
     */

    public int add(int i,int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c=i+j;
        return  c;
    }
}
