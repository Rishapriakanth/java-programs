import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int gcd=calculategcd(x,y);
    System.out.println(gcd);
  }
  public static int calculategcd(int x,int y)
  {
    if(y==0)
      return x;
    else
      return calculategcd(y,x%y);
  }
}