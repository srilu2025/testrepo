package CodingInterviewQuestion;


//single parse approach

public class FirstMaxSecondMax {

    public static void main(String[] args){

        int a[]={10,2,5,6};

        int firstMax=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;

        for(int num:a){

            if(num>firstMax){
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=num;
            }else if(num>secondMax && num<=firstMax){
                thirdMax=secondMax;
                secondMax=num;
            }else if(num>thirdMax && num<=secondMax){
                thirdMax=num;
            }
        }
        System.out.println("the first largest is.."+firstMax);
        System.out.println("The second largest number is.."+secondMax);
        System.out.println("The third largest number is.."+thirdMax);


    }
}
