package javaBasics;

public class InstanceInitializationBlock {

    int a;

    {
        a=10;
        System.out.println("I AM IN THE FIRST IIB "+a);
    }
    {
        System.out.println("I AM IN THE SECOND IIB");
    }
    InstanceInitializationBlock(){

        super();
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

        AccessModifiersPart1 acp=new AccessModifiersPart1();

        System.out.println("PROTECTED  ACCESSMODIFIER..."+acp.variableProtect);

        System.out.println("DEFAULT ACCESSMODIFIER..."+acp.variableDefault);

    }
}
