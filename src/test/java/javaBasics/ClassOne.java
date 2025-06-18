package javaBasics;

//import static jdk.nio.zipfs.ZipFileAttributeView.AttrID.method;

//1.classone is public and classtwo is default class
//2.should not contain more then one public class
 public class ClassOne {

     public static void main(String[] args){

         System.out.println("i am starting my career");

         //ClassTwo.method();

     }

 }

 class ClassTwo {

     static void method() {

         System.out.println("I AM IN CLASS TWO");
     }

     public static void main(String[] args) {

        method();

     }
 }