import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=Integer.toString(n);
        int len=str.length();
        String str1="";
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='0')
            {
                str1=str1+'1';
            }
            else
            {
                str1= str1+str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
