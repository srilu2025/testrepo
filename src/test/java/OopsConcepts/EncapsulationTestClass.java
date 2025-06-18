package OopsConcepts;

public class EncapsulationTestClass {



    public static void main(String[] args){

        Encapsulation e=new Encapsulation();
        e.setName("srilu");
        e.setAge(36);
        e.setSal(2000.0);
        e.setStatus("active");
        System.out.println("NAME OF THE PERSON IS  "+e.getName());
        System.out.println("AGE OF THE PERSON IS  "+e.getAge());
        System.out.println("SALARY OF THE PERSON IS  "+e.getSal());
        System.out.println("STATUS OF THE PERSON IS  "+e.getStatus());
    }
}
