package CodingInterviewQuestion;

import java.util.Scanner;

public class CheckStringPalindrome {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string:");

        String text=sc.next();
        String originalText=text;

        int len = originalText.length();
        String rev = "";

        for (int i = len - 1; i >= 0; i--) {

            rev = rev + text.charAt(i);
        }
        //System.out.println("Reversing the string using for loop..."+rev);

      if(rev.equals(originalText)){
          System.out.println(originalText  +"is planidrome");
      }else
      {
          System.out.println(originalText  +"is not palindrome");
      }
    }
}
