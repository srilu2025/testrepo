package JavaInterviewPrograms;

public class FindMissingNumberInArray {

    public static void main(String[] args){

        int[] a={1,2,3,4,5,6,8,9,10};

        int sum=0;

        for(int i=0;i< a.length;i++){

            sum=sum+a[i];
        }
        System.out.println(sum);

        int sum1=0;

        for(int j=0;j<=10;j++){
            sum1=sum1+j;
        }
        System.out.println(sum1);

        int missinNumber=sum1-sum;
        System.out.println("THE MISSING NUMBER IN AN ARRAY IS...."+missinNumber);
    }
}
