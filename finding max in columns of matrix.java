
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [][] matrix=new int[n][m];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
        matrix[i][j]=sc.nextInt();
    }
    for (int j = 0; j < m; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < n; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println(max);
        }
  }
}