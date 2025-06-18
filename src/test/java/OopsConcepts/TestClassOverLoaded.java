package OopsConcepts;

public class TestClassOverLoaded {


      void method3(){
          System.out.println("I am in the method3");
      }



    public static void main(String[] args){

        TestClassOverLoaded tl=new TestClassOverLoaded();
        tl.method3();

        Overloading_StaticPolymorphism osp=new Overloading_StaticPolymorphism();
        osp.method1("from overloaded class");
        osp.method2(100);
        int answer=Overloading_StaticPolymorphism.method1();
        System.out.println("THE VALUE OF THE RETURN VALUE FROM THE METHOD1() IS......"+answer);
    }
}
