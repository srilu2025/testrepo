package Constructors;

public class ExampleTwo extends ExampleOne{

    ExampleTwo(){
         this(99);
        System.out.println("IM IN THE NO-ARG CONSTRUCTOR FROMTHE EXAMPLETWO");
    }
    ExampleTwo(int a) {
        System.out.println("IM IN THE SINGLE PARAMETERIZED CONSTRUCTOR FROM EXAMPLETWO");
        method2();
    }
    void method2(){

             System.out.println("IM IN METHOD2 IN EXAMPLETWO CLASS");
         }

         public static void main(String[] args){

             ExampleTwo c1=new ExampleTwo();
//             ExampleTwo c2=new ExampleTwo(11);
//
//             System.out.println("in the main method of the ExampleTwo");
//             c1.method2();
    }
}
