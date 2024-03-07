import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int[] arr1=new int[n1];
    for(int i=0;i<n1;i++)
    {
      arr1[i]=sc.nextInt();
    }
    int n2=sc.nextInt();
    int[] arr2=new int[n2];
    for(int i=0;i<n2;i++)
    {
      arr2[i]=sc.nextInt();
    }
    boolean check= true;
    if(n1!=n2)
    {
      check=false;
    }
    else
    {
      for(int i=0;i<n1;i++)
      {
        if(arr1[i]<arr2[i])
        {
          	check=false;
        	break;
        }
      }
    }
    if(check)
      System.out.println("Compatible");
    else
      System.out.println("Incompatible");
    
  }
}