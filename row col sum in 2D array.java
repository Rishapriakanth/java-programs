import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [][] arr=new int[n][m];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
        arr[i][j]=sc.nextInt();
    }
    int [] rs=new int[n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
        rs[i]+=arr[i][j];
    }
    int [] cs=new int[m];
    for(int j=0;j<m;j++)
    {
      for(int i=0;i<n;i++)
        cs[j]+=arr[i][j];
    }
    int maxrow= rs[0];
    int maxrowind=0;
    for(int i=1;i<n;i++)
    {
      if(rs[i]>maxrow)
      {
        maxrow=rs[i];
        maxrowind=i;
      }
    }
    int maxcol= rs[0];
    int maxcolind=0;
    for(int j=1;j<m;j++)
    {
      if(cs[j]>maxcol)
      {
        maxcol=rs[j];
        maxcolind=j;
      }
    }
    System.out.print("The Sum of rows is ");
        for (int sum : rs) {
            System.out.print(sum + " ");
        }
        System.out.println("\nRow " + (maxrowind + 1) + " has a maximum sum");

        System.out.print("The Sum of columns is ");
        for (int sum : cs) {
            System.out.print(sum + " ");
        }
        System.out.println("\nColumn " + (maxcolind) + " has the maximum sum");
  }
}