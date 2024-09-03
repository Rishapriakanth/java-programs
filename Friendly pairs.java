import java.util.*;
public class Main
 {
   public static void main (String[]args)
   {
    Scanner sc=new Scanner(System.in);
     int num1 = sc.nextInt();
     int num2=sc.nextInt();

     int sum1 = getDivisorsSum (num1);
     int sum2 = getDivisorsSum (num2);

     if (sum1 / num1 == sum2 / num2)
       System.out.println (num1 + " & " + num2 + " are friendly pairs");
     else
         System.out.println (num1 + " & " + num2 + " are not friendly pairs");
   }

   static int getDivisorsSum (int num)
   {

     int sum = 0;

     for (int i = 1; i < num; i++)
       {
 	    if (num % i == 0)
 	    sum = sum + i;
       }
     return sum;
   }
 }