//assigning array to another array
class Main 
{
    public static void main(String args[])
    {
        int [] array1,array2;
        array1 = new int[5];
        array2 = new int[5];
        
        for(int k=0;k<5;k++)
        {
           array1[k]=2*k;
           array2=array1;
        }
        System.out.println("The elements of array1 are as below.");
        display(array1);
        System.out.println("The elements of array2 are as below.");
        display(array2);
        
        for(int j=0;j<5;j++)
        {
           array1[j]+=3;
        }
        System.out.println("New elements of array1 are as below.");
        display(array1);
        System.out.println("New elements of array2 are as below.");
        display(array2);
        
    }
        public static void display(int [] array)
        {
            for(int i=0;i<array.length;i++)
            {
                System.out.println(array[i]+" ");
            }
        }
}