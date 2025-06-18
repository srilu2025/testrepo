package Interfaces;

public class MultipleInheritance implements InterfaceExample1,InterfaceExample2{

    @Override
    public void method1() {

        System.out.println("I AM IN THE METHOD1()");
        System.out.println("VALUE OF THE A IS...."+a);
        System.out.println("VALUE OF THE S IS...."+s);
    }
    @Override
    public void method2() {

        System.out.println("I AM IN THE METHOD2()");
    }

    public void method3(){
        System.out.println("I AM IN THE METHOD3()");
    }

    public void method4(){

        System.out.println(" IAM IN THE METHOD4()");
    }

    public static void main(String[] args){

        MultipleInheritance mul=new MultipleInheritance();
        mul.method1();
        mul.method2();
        mul.method3();
        mul.method4();
    }
}
