import java.util.*;
class Main{
    public static int LIS(int[] arr,int i,int n,int prev)
    {
        if(i==n)
        {
            return 0;
        }
        int ex=LIS(arr,i+1,n,prev);
        int in=0;
        if(arr[i]>prev)
        {
            in=1+LIS(arr,i+1,n,arr[i]);
        }
        return Integer.max(in,ex);
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The length of LIS is "+LIS(arr,0,arr.length,Integer.MIN_VALUE));
    }
}