package OopsConcepts;

public class TestClassMethodOverrided extends Overriding_DynamicPolymorphism{

    @Override
    public  void method3(int a) {
        System.out.println("i am overrided in the child class");
    }

    @Override
    void method4() {
        System.out.println("I am overided method4() in the child class");
    }

    Object method5(){
        System.out.println("I am method5() overrided in the child class");
        return new Object();
    }

    //method hiding
    public static void specialmethod(){
        System.out.println("i am not overrided special method");
    }

    void method6(){
        System.out.println("I am overrided in child class");
    }

    public static void main(String[] args){
         TestClassMethodOverrided tc=new TestClassMethodOverrided();
        Overriding_DynamicPolymorphism odp=new Overriding_DynamicPolymorphism();

        tc.method3(10);
        tc.method4();
        Object obj=tc.method5();
        System.out.println("THE RETURN VALUE FROM THE METHOD5() IS...."+obj.toString());
        tc.method6();
    }
}
