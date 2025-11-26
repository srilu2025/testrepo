package InterviewQuestion;


public class ReverseString {

    public static void main(String[] args) {

        String s = "sreelakshmi";

        int len = s.length();
        String rev = "";

        for (int i = len - 1; i >= 0; i--) {

            rev = rev + s.charAt(i);
        }
        System.out.println("Reversing the string using for loop"+rev);

        String s1="mad";
        StringBuffer s2=new StringBuffer(s1);
        System.out.println("reverse the string using the string buffer....."+s2.reverse());
    }

}


