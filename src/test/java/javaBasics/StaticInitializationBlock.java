package javaBasics;

public class StaticInitializationBlock {

    static  int i;

    static {

        i=10;
        System.out.println("I AM IN THE STATIC BLOCK");
    }

    public static void main(String[] args){

        System.out.println("the value of the i is..."+i);
    }


}
