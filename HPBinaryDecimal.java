/*

Created By : Himanshu Prajapati
Date : 20th March, 2017
Github : hrp03

*/

public class HPBinaryDecimal {

   public static void main(String []args) 
   {
       int n = 101;
       int dec = 0;
       int i = 0;
       while(n > 0)
       {
           int t = n % 10;
           dec += t * Math.pow(2,i);
           n = n / 10;
           i++;
       }
      System.out.println("Decimal : " + dec);
      
      String s = "";
      
      while(dec > 0)
       {
           int t = dec % 2;
           s += t;
           dec = dec / 2;
       }
       
       System.out.println("Binary : " + new StringBuffer(s).reverse());
   }
} 
