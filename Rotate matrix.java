import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [][] arr=new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
        arr[i][j]=sc.nextInt();
    }
    int[][] rotate=new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
        rotate[j][n-1-i]=arr[i][j];
    }
    for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotate[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
  }
}