import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int result=sumarray(arr,n);
    System.out.println(result);
  }
  public static int sumarray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return arr[n - 1] + sumarray(arr, n - 1);
        }
  }
}