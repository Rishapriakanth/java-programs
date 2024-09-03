import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n*(n-1)/2;
        System.out.println("Maximum number of handshakes are "+t);
    }
}