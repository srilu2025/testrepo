package javaBasics;
  //1.cannot inherit the class if declare final
//public class FinalKeyword{
  public class FinalKeyword {

      FinalKeyword(){

          System.out.println("CONSTRUCTOR FROM THE FINALKEYWORD");
      }

      final int i=30;
     //3. int j=i; can use i to initialize the another variable

      void arrayExample(){
          final int[] i=new int[3];
        //4.  i=new int[5];//cannot re-initialize  i(reference variable) once is final
          i[0]=21;
          i[1]=31;
          i[2]=41;
          System.out.println(i[0]+" "+i[1]+" "+i[2]);
      }
      //2.method with final cannot overridden but can be overload
        final void method(){

            System.out.println("FINAL METHOD");

        }
        void method(int i){
            final int finvar=45;
            //5.finvar=45; cannot reassign the value.
            System.out.println("FINAL METHOD OVERLOADED VALUE IS "+i);
        }
     public static void main(String[] args){

        System.out.println("FINAL CLASS");

         FinalKeyword key =new FinalKeyword();
         FinalKeyword2 k=new FinalKeyword2(20);

         final FinalKeyword k1=new FinalKeyword();
         //k1=new FinalKeyword(); cannot use to reassign the reference variable

         key.method();
         key.method(10);



    }

 }
