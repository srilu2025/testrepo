package JavaInterviewPrograms;

public class ReverseInteger {

    public static void main(String[] args){

        int num=12345;

        int rev=0;

        //1.approach using algorithm
        while(num!=0){

            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);

        //2.approach using stringBuffer
        int num1=12345;

        StringBuffer sb=new StringBuffer(String.valueOf(num1));
        System.out.println("THE REVERSE OF THE INTEGER IS...."+sb.reverse());

    }
}

   /*while(num!=0){
   * rev=rev*10+num%10;
   * num=num/10;
   * }
   * system.out.println(rev);
   *
   * StringBuffer sb=new StringBuffer(String.valueOf(num));
   * sb.reverse();
   * */





























