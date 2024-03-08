import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int result=countdigit(n);
    System.out.println("The number of digits in "+ n +" is "+result);
      
  }
  public static int countdigit(int n)
  {
    if(n<10)
      return 1;
    else
      return 1+countdigit(n/10);
  }
}