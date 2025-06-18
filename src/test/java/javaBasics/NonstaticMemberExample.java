package javaBasics;

 class Example {

     int nonStaticVariable;
     static int staticVariable;
     static void staticMethod()
        {
            System.out.println(staticVariable);
            //   System.out.println(nonStaticVariable);
        }
        void nonStaticMethod()
        {
            System.out.println(staticVariable);
            System.out.println(nonStaticVariable);
        }


    public static class NonstaticMemberExample
    {
        public static void main(String[] args)
        {
            Example.staticVariable = 10;
            //   Example.nonStaticVariable = 10;
            Example.staticMethod();
            //    Example.nonStaticMethod();

            Example a1 = new Example();
            Example a2 = new Example();

            System.out.println(a1.nonStaticVariable);
            System.out.println(a1.staticVariable);
            a1.nonStaticMethod();
            a1.staticMethod();

            System.out.println(a2.staticVariable);
            a1.staticVariable = 20;
            System.out.println(a2.staticVariable);
        }
    }

}
