//bubble sort 
public class  Main 
{
    public static void main(String args[])
    {
        double darray[]= new double[]{7.7,1.3,9.9,1.1,6.6,2.2,3.3,8.8,4.4,5.5};
        bubbleSort(darray);
        {
            for (int k=0;k<10;k++)
            {
                System.out.println(darray[k]+"");
            }
        }
    }
        public static void bubbleSort(double[] x)
        {
            int length=x.length;
            double y;
            for(int i=0;i<length;i++)
            {
                for(int j=length-1;j>=(i+1);j--)
                {
                    if(x[j]<x[j-1])
                    {
                        y=x[j];
                        x[j]=x[j-1];
                        x[j-1]=y;
                    }
                }
            }
        }
        
    
}