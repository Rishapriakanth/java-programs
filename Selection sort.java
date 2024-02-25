//selection sort 
public class Main 
{
    public static void main(String args[])
    {
        int [] array = new int[] {6,8,1,3,5,9,11,2};
        sortSelection(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]+" ");
            System.out.println();
        }
    }
    public static int[] sortSelection(int [] intArray)
    {
        for(int i=0;i<intArray.length;i++)
        {
            int k=i;
            for(int j=i+1;j<intArray.length;j++)
            {
                if(intArray[j]<intArray[k])
                {
                    k=j;
                }
            }
            if(i!=k)
            {
                int x=intArray[k];
                intArray[k]=intArray[i];
                intArray[i]=x;
            }
            for (int n=0;n<intArray.length;n++)
            {
                System.out.println(intArray[n]+" ");
                System.out.println();
            }
        }
        return intArray;
    }
}