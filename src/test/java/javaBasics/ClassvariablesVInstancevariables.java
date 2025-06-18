package javaBasics;

//  CLASS VARIABLES/INSTANCE VARIABLES
//  c

public class ClassvariablesVInstancevariables {

    // CLASS VARIABLES/INSTANCE VARIABLES
    static int a=10;
    static String s="srilu";
     // CLASS VARIABLES/INSTANCE VARIABLES
    int b=20;
    String s1="sree";

    public static void main(String[] args){

        ClassvariablesVInstancevariables cv1=new ClassvariablesVInstancevariables();
        ClassvariablesVInstancevariables cv2=new ClassvariablesVInstancevariables();

        //accessing class variable through class name and object
        System.out.println("ACCESSING STATIC VARIABLES through class name... "+ClassvariablesVInstancevariables.a+" "+ClassvariablesVInstancevariables.s);
        System.out.println("ACCESSING STATIC VARIABLES through cv1... "+cv1.a+" "+cv1.s);
        System.out.println("ACCESSING STATIC VARIABLES through cv2... "+cv2.a+" "+cv2.s);

        //accessing instance variables through cv1 object
        System.out.println("ACCESSING INSTANCE  VARIABLES through cv1 object before modification... "+cv1.b+" "+cv1.s1);
        System.out.println("ACCESSING INSTANCE  VARIABLES through cv2 object before modification... "+cv2.b+" "+cv2.s1);



        //accessing instance variable through cv2 object
         cv2.b=99;
         cv2.s1="sri";
        System.out.println("ACCESSING INSTANCE  VARIABLES through cv2 object after modification... "+cv2.b+" "+cv2.s1);
        System.out.println("ACCESSING INSTANCE  VARIABLES through cv1 object after modification... "+cv1.b+" "+cv1.s1);






    }



}
