package CodingInterviewQuestion;


public class ReverseString {

    public static void main(String[] args) {

        String input="hello";

        char[] x=input.toCharArray();

        for(int i=4;i>=0;i--){

            System.out.print(x[i]);
        }


    }




}


