import java.io.*;
import java.util.*;
class Main {
   
    public static void callMeFactorialLastDigit(int n, int[] result, int sumOf5)
    {
        int number = n;
        if (number == 1)
            return; 
 
        while (number % 5 == 0) {
            number /= 5;
            sumOf5++;
        }
 
        while (sumOf5 != 0 && (number & 1) == 0) {
            number >>= 1; 
            sumOf5--;
        }
 
        result[0] = (result[0] * (number % 10)) % 10;
        callMeFactorialLastDigit(n - 1, result, sumOf5);
    }
 
    public static int lastNon0Digit(int n)
    {
        int[] result = { 1 }; 
        callMeFactorialLastDigit(n, result, 0);
        return result[0];
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(lastNon0Digit(n)); 
        
    }
}