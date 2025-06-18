package OopsConcepts;

  public class InheritanceProgram {
    int i;
    String s;
    static int j;
    static String s1;
    private String name;

    {
        i=10;
        s="java";
        name="sri";
        System.out.println("I AM IN IIB IN SUPER CLASS");
    }
    static {
       j=20;
       s1="selenium";
        System.out.println("I IN THE SIB IN SUPER CLASS");
    }
    InheritanceProgram(){

        System.out.println("I AM IN THE CONSTRUCTOR FROM THE SUPER CLASS");
    }
      InheritanceProgram(int k){

          System.out.println("I AM IN THE PARAEMTERIZED CONSTRUCTOR FROM THE SUPER CLASS..."+k);
      }

    void method1(){
        System.out.println("I AM IN THE method1 FROM SUPERCLASS");
    }

    public static void main(String[] args)
    {
        InheritanceProgram IP=new InheritanceProgram();
        InheritanceProgram IP1=new InheritanceProgram(200);
        IP.method1();
        System.out.println(IP.name);

    }





}
