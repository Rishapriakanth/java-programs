import java.util.*;
class Main{
    static void printorder(int[] a,int n)
    {
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            for(int j=n/2;j<n-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printorder(arr,n);
    }
}
