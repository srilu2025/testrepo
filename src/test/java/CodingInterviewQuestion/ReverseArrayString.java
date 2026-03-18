package CodingInterviewQuestion;

import java.util.Arrays;

public class ReverseArrayString {

    public static void main(String[] args){

        String[] array={"sree","is","in","the","interview"};
        System.out.println("INITIAL ARRAY IS..."+array);

        int left=1;
        int right=array.length-2;
        String temp;
        while(left<right){

            temp=array[left];
            array[left]=array[right];
            array[right]=temp;

            left++;
            right--;
        }
        System.out.println("AFTER CONVERTING THE ARRAY...."+Arrays.toString(array));
    }
}
