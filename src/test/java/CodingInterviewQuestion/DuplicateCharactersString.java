package CodingInterviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersString {

    public static void main(String[] args){

        checkDuplicateCharacters("sreelakshmi");

    }

    public static void checkDuplicateCharacters(String str){

        if(str==null){
            System.out.println("String is Null");
            return;
        }
        if(str.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        if (str.length()==1){
            System.out.println("String length is 1");
            return;
        }
        char[] ch=str.toCharArray();//java
        Map<Character,Integer> charMap=new HashMap<Character,Integer>();

        for(Character c:ch){

            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }
            else {
                charMap.put(c,1);
            }
        }
       //print the map
        Set<Map.Entry<Character,Integer>> enrtySet=charMap.entrySet();
        for(Map.Entry<Character,Integer> entry:enrtySet){
            if(entry.getValue()>1){

                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }




    }
}
