//insertion sort 
public class Main 
{
    public static void main(String[] args)
    {
        int intArray[] = new int [] {100,30,20,90,80,60,50,40};
        sort(intArray);
        for(int k=0;k<intArray.length;k++)
        {
            System.out.println(intArray[k]+" ");
            System.out.println();
        }
    }
    public static void sort(int[] array)
    {
        int length=array.length;
        int key=0;
        int i=0;
        for(int j=1;j<length;j++)
        {
            key=array[i];
            i=j-1;
            
        }
        while(i>=0 && array[i]>key)
        {
            array[i+1]=array[i];
            i=i-1;
            array[i+1]=key;
        }
        for(int m=0;m<length;m++)
        {
            System.out.println(array[m]+" ");
            System.out.println();
        }
    }
}