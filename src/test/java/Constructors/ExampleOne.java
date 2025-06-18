package Constructors;

public class ExampleOne {

     ExampleOne(){
        this(10);
        System.out.println("IN THE NO-ARG CONSTRUCOR FROM THE ExampleOne");
    }
    ExampleOne(int a){
        this(11,22);
        System.out.println("IM IN THE SINGLE PARAMETERIZED CONSTRUCTOR IN EXAMPPLEONE...."+a);
    }
    ExampleOne(int i,int j){

        System.out.println("IM IN THE double  PARAMETERIZED CONSTRUCTOR IN EXAMPPLEONE...."+i+" "+j);
        method1();
    }
    void method1(){

        System.out.println("IM IN METHOD1 IN EXAMPLEONE");

    }

    public static void main(String[] args){


        ExampleOne c1=new ExampleOne();
        //ExampleOne  c2=new ExampleOne(10);
       // ExampleOne c3=new ExampleOne(13,21);
        //c1.method1();

    }
}
