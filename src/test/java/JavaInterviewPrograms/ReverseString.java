package JavaInterviewPrograms;


public class ReverseString {


    public static void main(String[] args) {

        //1.using for loop

               String s="sreelakshmi";

        int len=s.length();
        String rev=" ";

        for(int i=len-1;i>=0;i--){
        rev=rev+s.charAt(i);
        }
        System.out.println("THE REVERSE OF THE STRING USING FORLOOP...."+rev);


        //2.using StringBuffer

        StringBuffer sb = new StringBuffer("java");
        System.out.println("THE REVERSE OF A STRING USING STRINGBUFFER...."+sb.reverse());

    }
}
       /*
        */





















