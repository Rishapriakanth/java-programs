import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String binary=convertbin(n);
    System.out.println(binary);
  }
  public static String convertbin(int n)
  {
    if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return convertbin(n / 2) + n % 2;
        }
  }
}