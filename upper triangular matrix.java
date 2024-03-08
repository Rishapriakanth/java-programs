import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [][] matrix=new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
        matrix[i][j]=sc.nextInt();
    }
    if(ut(matrix,n))
      System.out.println("Upper triangular matrix");
    else
      System.out.println("Not an Upper triangular matrix");	
  }
  public static boolean ut(int[][] matrix, int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}