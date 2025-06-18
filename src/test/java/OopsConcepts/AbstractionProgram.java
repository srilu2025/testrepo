package OopsConcepts;

abstract  class AbstractionProgram {

    abstract void method1();
    void method2(){

        System.out.println("I AM IN METHOD2");
    }
    abstract void method3();

    int i;
    String s;

    AbstractionProgram(){
        i=10;
        s="java";
        System.out.println("I AM IN THE CONSTRUCTOR FROM THE ABSTRACT CLASS..."+i+"____"+s);
    }

}

