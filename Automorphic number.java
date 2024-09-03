import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=x*x;
        if(y%10==x%10)
        {
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not automorphic");
        }
    }
}