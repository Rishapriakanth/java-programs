import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        while(n!=0)
        {
            int pl=n%10;
            result+=pl;
            n=n/10;
        }
        if(n%result==0)
        {
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a harshad number");
        }
    }
}