import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int res=posodd(arr,n-1);
    System.out.println("Sum = "+res);
  }
  public static int posodd(int[] arr,int n)
  {
    if (n < 0) {
            return 0;
        } else {
            if (arr[n] > 0 && arr[n] % 2 != 0) {
                return arr[n] + posodd(arr, n - 1);
            } else {
                return posodd(arr, n - 1);
            }
        }
  }
}