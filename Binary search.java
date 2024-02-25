//binary search
import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        
        int [] array = {15,20,43,45,76,80,86,88,90,94,96,98};
        int length=array.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched:");
        int key=sc.nextInt();
        int beg,end,mid;
        beg=0;
        end=length-1;
        while(beg<=end)
        {
            if(beg==end && array[end]!=key)
            {
                System.out.println("Number is not there in the array");
                break;
            }
            mid=(beg+end)/2;
            if(array[mid]==key)
            {
                System.out.println("The key value is in the array at "+mid);
                break;
            }
            else if(array[mid]<key)
            {
                beg=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
    }
}
