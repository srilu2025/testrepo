package CodingInterviewQuestion;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args){

        String input="Java Test";

        StringBuilder finalString=new StringBuilder();

        String[] arrayOfString=input.split(" ");

        System.out.println("the array of the strings are...."+ Arrays.toString(arrayOfString));

        for(String data:arrayOfString){

            char[] ch=data.toCharArray();

            int left=0;
            int right=ch.length-1;
            char temp;

            while(left<right){

                temp=ch[right];
                ch[right]=ch[left];
                ch[left]=temp;
                left++;
                right--;
            }
            System.out.println(Arrays.toString(ch));
             finalString.append(ch).append(" ");


        }
        System.out.println("the final string is.."+finalString);
    }
}
