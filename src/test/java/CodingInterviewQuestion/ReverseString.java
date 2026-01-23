package CodingInterviewQuestion;


public class ReverseString {

    public static void main(String[] args) {

        String s = "sreelakshmi";

        int len=s.length();
        System.out.println("the length of the string is"+len);
        String rev="";
        for(int i=len-1;i>=0;i--){

           rev=rev+s.charAt(i);

        }
        System.out.println("the reverese of the string is..."+rev);

        StringBuilder s1=new StringBuilder("jimmy");

        System.out.println("reversing the string using stringbuilder is.."+s1.reverse());

        StringBuffer s2=new StringBuffer("tommy");
        System.out.println("reversing the string using stringbuffer is.."+s2.reverse());




    }




}


