package javaBasics;

public class FinalKeyword2 extends FinalKeyword {
    final int gvar;
    final String s;
    final static String s1;
    {
        s="final non-static variable in IIB";
        System.out.println(s);
    }
    static{
        s1="final static variable in SIB";
        System.out.println(s1);
    }
    FinalKeyword2(int var){
        this.gvar=var;
        System.out.println("FinalKeyword2 CONSTRUCTOR "+gvar);
    }
    @Override
    void method(int i){

        System.out.println("FINAl METHOD OVERLOADED IN EXTENDED CLASS..."+i);
    }
    public static void main(String[] args){

        FinalKeyword2 key1=new FinalKeyword2(99);
        key1.method(20);
    }
}
