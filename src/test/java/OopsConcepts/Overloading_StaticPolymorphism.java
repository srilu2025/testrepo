package OopsConcepts;

//STATIC POLYMORPHISM

public class Overloading_StaticPolymorphism {
    int i;
    String s;
    static int j;

    {
        i=10;
        s="java";
        System.out.println("I am in IIB "+i+"...."+s);
    }
    static {
        j=20;
        System.out.println("I am in the SIB "+j);
    }
    Overloading_StaticPolymorphism(){
        System.out.println("I am in the constructor");

    }
    //OPERATOR OVERLOADING
    //CONSTRUCTOR OVERLOADING
    //METHOD OVERLOADING
    public static int  method1(){
        System.out.println("I am in the method1");
        return j;
    }
     void method1(String s){
        System.out.println("I am in the method1 overloaded   "+s);
    }

    public void method2(int a){
        System.out.println("I am in the method1 with single argument   "+a);
    }

    public static void main(String[] args){
        Overloading_StaticPolymorphism PE=new Overloading_StaticPolymorphism();
        //Overloading_StaticPolymorphism.method1();
        PE.method1("tippu sultan");
        PE.method2(99);
    }

}
