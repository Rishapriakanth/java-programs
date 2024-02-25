//2D array 
public class Main 
{
    public static void main(String args[])
    {
        
        String str[][]={{"AA","BB","CC"},{"DD","EE","FF"}};
        System.out.println("The elements of str are:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(str[i][j]+" ");
                System.out.println();
            }
        }
    }
}