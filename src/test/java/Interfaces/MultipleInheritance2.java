package Interfaces;

public class MultipleInheritance2 implements InterfaceExample2{

    @Override
    public void method3() {
        System.out.println("I AM IN THE METHOD3() IN MULTIPLEINHERITANCE2");
    }

    @Override
    public void method4() {
        System.out.println("I AM IN THE METHOD4() IN MULTIPLEINHERITANCE2");
    }

    public static void main(String[] args){

        MultipleInheritance2 multi=new MultipleInheritance2();
        multi.method3();
        multi.method4();
    }


}
