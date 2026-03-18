public class Practice {

    public static void main(String[] args) {

        //*reverse the string*//

//        String s = "Iamwinner";
//        int len = s.length();
//        System.out.println(len);
//        String reverse="";
//        for(int i=len-1;i>=0;i--){
//            reverse=reverse+s.charAt(i);
//        }
//        System.out.println(reverse);
//    }StringBuilder s2=new StringBuilder("timmy");
//   StringBuilder s3= s2.reverse();

        //*check string palindrom*//

        String s1="liril";
        int len=s1.length();
        String reverse="";
        for(int i=len-1;i>=0;i--){
            reverse=reverse+s1.charAt(i);
        }
        if(s1.equals(reverse)){
            System.out.println("string is palindrom");
        }else {
            System.out.println("string is not palindrom");
        }

        //**write a clear java program to Count vowels in a string*//

        String s2="automationtesting";
        int vowelCount=0;
        s2=s2.toLowerCase();
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);

        //*removing special characters*//

        String s4="sree@#$lakshmi";
        String s5=s4.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(s5);



    }
}
















