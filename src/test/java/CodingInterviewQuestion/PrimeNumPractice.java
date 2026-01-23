package CodingInterviewQuestion;

import java.util.Scanner;

public class PrimeNumPractice {

    public static void main(String[] args) {

        /*1.number should  be
         divisible by 1 and itself.
         2.number should be greate than 1*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();

        boolean isPrime=true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("prime number");        // print prime number
            }
            else {
                System.out.println("not a prime number");
        }
    }
}