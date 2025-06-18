package JavaInterviewPrograms;

public class RemoveJunk_SpecialCharacters {

    public static void main(String[] args){

        String s="!@#$ sreelu  %^&* is ()@! good #$% girl";
        String s1="!@@^%^%^^ tom &**^*& and )(*&&^ jerry";

        s=s.replaceAll("[^a-zA-Z0-9 ]","");
        System.out.println(s);

        s1=s1.replaceAll("[^a-zA-Z0-9 ]","");
        System.out.println(s1);
    }
}
/*
* */