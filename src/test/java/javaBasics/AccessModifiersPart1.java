package javaBasics;

public class AccessModifiersPart1 {

    public int variablePublic=10;
    private int VariablePrivate=20;
    protected int variableProtect=30;
    int variableDefault=40;

    public static void main(String[] args){

        AccessModifiersPart1 acp=new AccessModifiersPart1();

        System.out.println("PUBLIC ACCESSMODIFIER..."+acp.variablePublic);

        System.out.println("PRIVATE ACCESSMODIFIER..."+acp.VariablePrivate);

        System.out.println("PROTECTED  ACCESSMODIFIER..."+acp.variableProtect);

        System.out.println("DEFAULT ACCESSMODIFIER..."+acp.variableDefault);

    }
}
