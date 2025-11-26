package InterviewQuestion;

import java.util.SplittableRandom;

public class RemoveSpecialCharacters {

    public static void main(String[] args){


       String s="java$%$^%^is!@#@a)(*(&Amazing";
        String s1=s.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println("the output after seperating the characters from the...."+s1);

        //substring practice
        String str = "Java Concept Of The Day";

        String subString1 = str.substring(11);

        System.out.println(subString1);           //Output : t Of The Day

        String subString2 = str.substring(5, 15);

        System.out.println(subString2);

        //comparision of the strings
        String s2=new String("abc");
        String s3=new String("def");

        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());



    }
}
