public class Triangle1 {

   int a;

   int b;

   int c;

   public void area(){
      double p =(a + b + c) /2d;
      double s = Math.sqrt(p * (p-a)*(p-b)*(p-c));
      System.out.println(s);
   }











}
