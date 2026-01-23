package CodingInterviewQuestion;

//here we are finding given number is even or odd

import java.util.Scanner;

public class EvenOddPractice {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int number=sc.nextInt();

        if((number%2)==0){

            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
