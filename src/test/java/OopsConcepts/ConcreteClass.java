package OopsConcepts;

public class ConcreteClass extends AbstractionProgram{

    static  void method4(){

        System.out.println("I AM IN THE METHOD4 ");
    }

    @Override
    void method1() {
        System.out.println("I AM IMPLEMENTED METHOD1() FROM ABSTRACT CLASS ");
    }
    @Override
    void method3() {
        System.out.println("I AM IMPLEMENTED METHOD3() FROM ABSTRACT CLASS");
    }
    public static void main(String[] args){

//        ConcreteClass AP=new ConcreteClass();
//        AP.method1();
//        AP.method3();
//        ConcreteClass.method4();

        //we can call the ABSTRACT constructor by creating reference variable to ABSTRACT(SUPER) CLASS
        // using its CHILD/EXTENDED class

        AbstractionProgram AP1=new ConcreteClass();
        System.out.println(AP1.i);


        }
    }

