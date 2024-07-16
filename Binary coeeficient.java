//binomial coefficient
import java.util.*;
public class Main

{
    static int bc(int n,int k)
    {
        if(k>n)
        {
            return 0;
        }
        if(k==0||k==n)
        {
            return 1;
        }
        return bc(n-1,k-1)+bc(n-1,k);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.printf("Value of C(%d, %d) is %d ", n, k,bc(n, k));
		
		
	}
}