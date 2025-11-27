package javaBasics;

public class AccessModifierPart2 {

    public static void main(String[] args){


        AccessModifiersPart1 acp=new AccessModifiersPart1();

        System.out.println("PUBLIC ACCESSMODIFIER..."+acp.variablePublic);


      //cannot access the private modifier outside the class
        //System.out.println("PRIVATE ACCESSMODIFIER..."+acp.VariablePrivate);

        System.out.println("PROTECTED  ACCESSMODIFIER..."+acp.variableProtect);

        System.out.println("DEFAULT ACCESSMODIFIER..."+acp.variableDefault);

    }
}
