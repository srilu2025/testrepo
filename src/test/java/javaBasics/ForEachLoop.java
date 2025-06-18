package javaBasics;

//for each is enhanced version of the for loop
// which is mainly used to iterate the elements fron the array/collections

import java.util.ArrayList;

public class ForEachLoop {

   static void forEachArray(){
        String[] names = {"tom", "dan", "mary", "paul", "jon"};

        for (String s : names) {

            //System.out.print("[");

            System.out.println("  " + s);
        }
        //System.out.println("]");
    }
    public static void arraylist(){

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(13);
        list.add(21);
        list.add(39);
        list.add(30);

        for ( int i:list){
            System.out.println(i);
        }
   }

   public static void nestedForeach(){

       int[][] numbers={{1,2,3,4},{5,6,7,8}};

           //iterating every element in 2 dimensional array
       for(int[] first:numbers){

           System.out.print("[");

           //iterating every element in 1 dimensional array
           for (int second:first){

               System.out.print(second);
           }
           System.out.println("]");
       }
   }

    public static void main(String[] args) {

       forEachArray();
       arraylist();
       nestedForeach();

    }
}