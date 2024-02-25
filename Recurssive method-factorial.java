//recurrsive method-Factorial
class Fact
{
    int factorial(int n)
    {
        int f;
        if(n==0 ||n==1)
        {
            return 1;
        }
        f=n*factorial(n-1);
        return f;
    }
}
class Main 
{
    public static void main(String Str[])
    {
        
        Fact ff=new Fact();
        System.out.println("Number \t Factorial");
        for (int i=0; i<6; i++)
        {
            System.out.println(i + "\t"+ff.factorial(i));
        }
    }
}