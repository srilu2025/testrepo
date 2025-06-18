package javaBasics;

public class InstanceInitializationBlock {

    int a;

    {
        a=10;
        System.out.println("I AM IN THE FIRST IIB ");
    }
    {
        System.out.println("I AM IN THE SECOND IIB");
    }
    InstanceInitializationBlock(){
        //here IIB will execute cause super() is the first statement
        System.out.println("I AM IN THE NO-ARG CONSTRUCTOR");
    }
    InstanceInitializationBlock(int i){

        this();//if this() is first statement then IIB won't excecute
        System.out.println("I AM IN THE SINGLE PARAMETRRIZED CONSTRUCTOR...."+i);
    }



    public static void main(String[] args){


        InstanceInitializationBlock IIB=new InstanceInitializationBlock();
        InstanceInitializationBlock IIB1=new InstanceInitializationBlock(99);

    }
}
