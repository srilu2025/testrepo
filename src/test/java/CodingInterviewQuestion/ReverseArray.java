package CodingInterviewQuestion;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args){

        int[] a={1,5,8,9,6};

        int temp;

        int right=0;
        int left=a.length-1;

        while(right<left) {

            temp = a[right];
            a[right] = a[left];
            a[left] = temp;
            right++;
            left--;
        }

        System.out.println(Arrays.toString(a));
    }
}
