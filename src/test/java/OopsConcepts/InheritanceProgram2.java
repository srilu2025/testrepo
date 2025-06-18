package OopsConcepts;

public class InheritanceProgram2 extends InheritanceProgram{

    {
        System.out.println("I AM IN THE IIB FROM THE CHILD CLASS");
    }
    static {
        System.out.println("I AM IN THE SIB FROM THE CHILD CLASS");
    }
    InheritanceProgram2(){
        super();
        System.out.println("I AM IN THE CONSTRUCTOR FROM SUB CLASS");
    }
    InheritanceProgram2(int a){
        this();
        System.out.println("I AM IN THE PARAMETERIZED CONSTRUCTOR FROM THE SUB CLASS..."+a);
    }
    void method2(){
        System.out.println("I AM IN THE method2 FROM THE CHILD CLASS");
    }

    public static void main(String[] args){

        InheritanceProgram2 p2=new InheritanceProgram2(99);
        p2.method2();
        p2.method1();//method from the super class
        // p2.name; "name" variable is from the super class but with the private access modifier








    }
}
