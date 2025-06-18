package OopsConcepts;

public class Overriding_DynamicPolymorphism {

     public void method3(int a){
        System.out.println("i am method3() in the parent class before override");

    }
    void method4(){

         System.out.println("i am method4() in the parent class method4");
    }

    Object method5(){
        System.out.println("i am method5() return type object");
        return new Object();
    }
     void method6(){
        System.out.println("i am in the method6()");
    }

    //method hiding --->method resolution takes place compiler based reference variable
    //overriding---->method resoultion takes place by jvm based on runtime object
    public static void specialmethod(){
        System.out.println("i am in methodhiding method");
    }

}
