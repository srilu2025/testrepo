package CodingInterviewQuestion;

import java.util.Scanner;

public class CheckStringPalindrome {

    public static void main(String[] args) {

        String s2="madam";
        boolean flag=isPalindrome(s2);
        System.out.println("THE STRING IS PALINDROM...."+flag);

    }

      //  Scanner sc=new Scanner(System.in);

//        System.out.println("Enter the string:");
//
//        String text=sc.next();
//        String originalText=text;
//
//        int len = originalText.length();
//        String rev = "";
//
//        for (int i = len - 1; i >= 0; i--) {
//
//            rev = rev + text.charAt(i);
//        }
//        //System.out.println("Reversing the string using for loop..."+rev);
//
//      if(rev.equals(originalText)){
//          System.out.println(originalText  +"is planidrome");
//      }else
//      {
//          System.out.println(originalText  +"is not palindrome");
//      }

      //using the inbuilt methods
//        String s1="A man, A plat, A Canal : Panama";
//
//        StringBuilder sb=new StringBuilder();
//
//        char[] array=s1.toCharArray();//converting S1 [string] to the char array
//
//        for(char ch:array){
//            if(Character.isLetterOrDigit(ch)) {
//                sb.append(Character.toLowerCase(ch));
//            }
//        }
//            System.out.println(sb);
//
//        String clearString= sb.toString();
//        System.out.println("clear string is   "+clearString);
//
//        String reverseString= sb.reverse().toString();
//        System.out.println("reverse string is   "+reverseString);
//
//        if(clearString.equals(reverseString)){
//            System.out.println("planidrome");
//      }else
//      {
//          System.out.println("not palindrome");
//        }

        //two pointer approach

        public static boolean isPalindrome(String s2){


            char[] c = s2.toCharArray();

            int left = 0;
            int right = c.length - 1;

            while (left < right) {

                while (left < right && !Character.isLetterOrDigit(c[left])) {
                    left++;
                }
                while (left < right && !Character.isLetterOrDigit(c[right])) {
                    right--;
                }
                if (Character.toLowerCase(c[left]) != Character.toLowerCase(c[right])) {
                    return false;
                }
                left++;
                right--;
            }
                return true;

            }

    }


















