package InterviewQuestion;

public class CountVowelConstDigitSpace {

    static int vowels;
    static int consonants;
    static int digits;
    static int spaces;
    public static void main(String[] args){

        String str="Hello java world 123";

        str=str.toLowerCase();

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
                vowels++;

            } else if (ch>='0' && ch<='9') {
                digits++;

            }else if(ch>='a' && ch<='z' ){
                consonants++;
            }
            else if(ch==' '){
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
