import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int sumeven=0;
    int sumodd=0;
    for(int num:arr)
    {
      if(num%2==0)
        sumeven+=num;
      else
        sumodd+=num;
    }
    System.out.println("The sum of the even numbers in the array is "+sumeven);
    System.out.println("The sum of the odd numbers in the array is "+sumodd);
    
  }
}