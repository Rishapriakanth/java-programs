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
    int top = 0, bottom = n - 1, left = 0, right = n - 1;
        StringBuilder result = new StringBuilder();

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.append(arr[top][i]).append(" ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.append(arr[i][right]).append(" ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.append(arr[bottom][i]).append(" ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(arr[i][left]).append(" ");
                }
                left++;
            }
        }
        System.out.println(result.toString().trim());
  }
}