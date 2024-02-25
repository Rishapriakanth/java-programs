//linear search
import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        boolean b=false;
        int [] array = {67,78,85,44,34,25,65,36};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched:");
        int key=sc.nextInt();
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==key)
            {
                System.out.println("Number is found at index "+i);
                b=true;
            }
        }
        if(b!=true)
        {
            System.out.println("Number not found");
        }
    }
}
